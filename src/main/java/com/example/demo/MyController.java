package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.NotificationService;

@RestController
public class MyController {

	@Autowired
	NotificationService nb;

	@Autowired
	EmaiUser getAdmin;
	
	@Autowired
	EmaiUser getHr;
	
	
	@Autowired
	//@Qualifier("emailService")
	INotificationService smsService;
	
	@Autowired
	@Qualifier("emailService")
	INotificationService emailService;

	User user = new User("swap", "swapg@gmail.com", 26);

	@Value("${greeting}")
	private String greeting;

	@GetMapping("/abc")
	public String getGreeting() {
		return "hello SWapN";
	}

	@GetMapping("/user")
	public User getUser() {
		return user;
	}

	@GetMapping("/autowiredtest1")
	public User getNotificationService1() {
		// nb.sendMsg("swapg", "hey");
		nb.sendEmail("swapg26@gmail.com", "", "hey swap hi", "abcd efg hijk lmn op qrst uvw xyz");
		return user;
	}

	@GetMapping("/")
	public String getPFile() {
		/*
		 * smsService.sendMsg("sdf", "sdf"); emailService.sendMsg("sdf", "sdf");
		 */
		
		emailService.sendTypeMSg(getAdmin);
		emailService.sendTypeMSg(getHr);
		return "";
	}

}
