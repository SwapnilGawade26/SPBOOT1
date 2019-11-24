package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
//@Primary
public class SmsService implements INotificationService{

	@Value("${sms.username}")
	private String username;
	@Value("${sms.password}")
	private String password;
	
	@Bean
	public EmaiUser getAdmin() {
		
		return new EmaiUser("admin","apass");
	}
	
	@Override
	public String sendMsg(String text,String number)
	{
		System.out.println("sms sending");
		return "";
		
	}

	@Override
	public String sendTypeMSg(EmaiUser e) {
		// TODO Auto-generated method stub
		System.out.println("in sms"+e.getUsername());
		return null;
	}
	
	
	
}
