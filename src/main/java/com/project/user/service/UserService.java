package com.project.user.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.user.entity.buyer;
import com.project.user.entity.cart;
import com.project.user.entity.seller;
import com.project.user.entity.wishlist;
import com.project.user.repository.BuyerRepository;
import com.project.user.repository.CartRepository;
import com.project.user.repository.SellerRepository;
import com.project.user.repository.WishlishRepository;

@Service
public class UserService {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	BuyerRepository buyerRepository;

	@Autowired
	SellerRepository sellerRepository;
	
	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	WishlishRepository wishlistRepository;
	
	public List<buyer> getAllbuyer() {
		// TODO Auto-generated method stub
		return buyerRepository.findAll();
	}
	
	

	public List<seller> getAllseller() {
		// TODO Auto-generated method stub
		return sellerRepository.findAll();
	}



	public Optional<seller> getOneSeller(Integer sellerid) {
		// TODO Auto-generated method stub
		return  sellerRepository.findById(sellerid);
	}


	public Optional<buyer> getOneBuyer(Integer buyerid) {
		// TODO Auto-generated method stub
		return buyerRepository.findById(buyerid);
	}



	public buyer login(String email, String password) {
		// TODO Auto-generated method stub
		buyer user = buyerRepository.findByEmailAndPassword(email, password);
		   return user;
	}



	public buyer loginseller(String email, String password) {
		buyer user = sellerRepository.findByEmailAndPassword(email, password);
		   return user;
	}



	public buyer putallproducts(buyer product) {
		// TODO Auto-generated method stub
		return buyerRepository.save(product);
	}
	public seller putallseller(seller Seller) {
		// TODO Auto-generated method stub
		return sellerRepository.save(Seller);
	}



	public Optional<cart> getonecart(int buyerid) {
		// TODO Auto-generated method stub
		return cartRepository.findById(buyerid);
	}
	
	public Optional<wishlist> getonewishlist(int buyerid) {
		// TODO Auto-generated method stub
		return wishlistRepository.findById(buyerid);
	}
	
	
	

}
