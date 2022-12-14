package com.project.user.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.user.entity.buyer;
import com.project.user.entity.cart;
import com.project.user.entity.seller;
import com.project.user.entity.wishlist;
import com.project.user.service.UserService;

@RestController
@CrossOrigin
public class UserController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserService userService;
	
	    @PostMapping("/login")
	    public String login(@ModelAttribute("user") buyer user ) {
	    
	     buyer oauthUser = userService.login(user.getEmail(), user.getPassword());
	    
	 
	     System.out.print(oauthUser);
	     if(Objects.nonNull(oauthUser))
	     {
	  
	     return "login successfull";
	    
	    
	     } else {
	    	
	     return "Login Successfull";
	    
	    
	     }
	 
	}
	
	    @PostMapping("/logout")
	    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
	    {
	        return "Login Again";
	    }
	
	

	@GetMapping("/buyer")
	public List<buyer> getAllbuyer(){
		return userService.getAllbuyer();
	}
	
	  @GetMapping("/buyer/{buyerid}")
	    public Optional<buyer> getOneBuyer(@PathVariable Integer buyerid) {
	    return	userService.getOneBuyer(buyerid);
	    }
	    @GetMapping("/seller/{sellerid}")
	    public Optional<seller> getOneSeller(@PathVariable Integer sellerid) {
	    return	userService.getOneSeller(sellerid);
	    }
	@GetMapping("/seller")
	public List<seller> getAllSeller(){
		return userService.getAllseller();
	}

	
	 @PostMapping("/buyer")
	    public buyer putallproducts(@RequestBody  buyer Product){
			return userService.putallproducts(Product);
	    	
	    }
	 @PostMapping("/seller")
	    public seller putallseller(@RequestBody  seller Seller){
			return userService.putallseller(Seller);
	    
	    }
	 @GetMapping("/cart/{buyerid}")
	    public Optional<cart> getonecart(@PathVariable Integer buyerid){
			return userService.getonecart(buyerid);
	    	
	    }
	    @GetMapping("/wishlish/{buyerid}")
	    public Optional<wishlist> getonewishlist(@PathVariable Integer buyerid){
			return userService.getonewishlist(buyerid);
	    	
	    }
	

	
	 
}
