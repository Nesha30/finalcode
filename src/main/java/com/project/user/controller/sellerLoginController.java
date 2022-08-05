package com.project.user.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.user.entity.buyer;
import com.project.user.entity.seller;
import com.project.user.service.UserService;

@RestController
@CrossOrigin
public class sellerLoginController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserService userService;
	
	
	
	    @PostMapping("/loginseller")
	    public String loginseller(@ModelAttribute("user") seller user ) {
	    
	     buyer oauthUser = userService.loginseller(user.getEmail(), user.getPassword());
	    
	 
	     System.out.print(oauthUser);
	     if(Objects.nonNull(oauthUser))
	     {
	  
	     return "login successfull";
	    
	    
	     } else {
	    	
	     return "Login Successfull";
	    
	    
	     }
	 
	}
	
	    @PostMapping("/logoutseller")
	    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
	    {
	        return "Login Again";
	    }
	
}
