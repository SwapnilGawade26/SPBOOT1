package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
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
	
	@Override
	public String sendMsg(String text,String number)
	{
		System.out.println("sms sending");
		return "";
		
	}
	
	
	
}
