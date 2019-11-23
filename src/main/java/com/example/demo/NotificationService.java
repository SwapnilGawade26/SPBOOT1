package com.example.demo;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.sun.mail.smtp.SMTPTransport;




@Service
public class NotificationService {

	/*
	 * @Value("${email.id}") private String email;
	 */
	
	private static final String SMTP_SERVER = "smtp server ";
	@Value("${email.id}")
	private  String USERNAME = "";
	@Value("${email.password}")
	    private String PASSWORD = "";
	    @Value("${email.id}")
	    private String EMAIL_FROM ;
	    
	    
	   
	
	public void sendMsg(String email, String message) {

		System.out.println("Notice send to admin:" + email);
	}

	public void sendEmail(String EMAIL_TO,String EMAIL_TO_CC,String EMAIL_SUBJECT,String EMAIL_TEXT)
	{
		
		/*
		 * private static final String EMAIL_TO =
		 * "email_1@yahoo.com, email_2@gmail.com"; private static final String
		 * EMAIL_TO_CC = "";
		 * 
		 * private static final String EMAIL_SUBJECT = "Test Send Email via SMTP";
		 * private static final String EMAIL_TEXT = "Hello Java Mail \n ABC123";
		 */
		 Properties prop = System.getProperties();
	        prop.put("mail.smtp.host", SMTP_SERVER); //optional, defined in SMTPTransport
	        prop.put("mail.smtp.auth", "true");
	        prop.put("mail.smtp.port", "25"); // default port 25

	        Session session = Session.getInstance(prop, null);
	        Message msg = new MimeMessage(session);

	        try {
			
				// from
	            msg.setFrom(new InternetAddress(EMAIL_FROM));

				// to 
	            msg.setRecipients(Message.RecipientType.TO,
	                    InternetAddress.parse(EMAIL_TO, false));

				// cc
	            msg.setRecipients(Message.RecipientType.CC,
	                    InternetAddress.parse(EMAIL_TO_CC, false));

				// subject
	            msg.setSubject(EMAIL_SUBJECT);
				
				// content 
	            msg.setText(EMAIL_TEXT);
				
	            msg.setSentDate(new Date());

				// Get SMTPTransport
	            SMTPTransport t = (SMTPTransport) session.getTransport("smtp");
				
				// connect
	            t.connect(SMTP_SERVER, USERNAME, PASSWORD);
				
				// send
	            t.sendMessage(msg, msg.getAllRecipients());

	            System.out.println("Response: " + t.getLastServerResponse());

	            t.close();

	        } catch (MessagingException e) {
	            e.printStackTrace();
	        }
	}
}
