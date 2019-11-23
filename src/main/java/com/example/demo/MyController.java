package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {
	
	User user =new User("swap", "swapg@gmail.com", 26);
	  @GetMapping("/") 
	  public String getGreeting()
	  {
		  return "hello SWapN";
	  }
	  
	  @GetMapping("/user") 
	  public User getUser()
	  {
		  return user;
	  }
	 
}
