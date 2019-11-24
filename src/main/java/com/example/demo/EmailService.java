package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements INotificationService {

	@Value("${sms.username}")
	private String username;
	@Value("${sms.password}")
	private String password;
	
	@Override
	public String sendMsg(String text,String number)
	{
		System.out.println("Email sending");
		return "";
		
	}
	
}
