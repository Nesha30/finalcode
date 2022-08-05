package com.project.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.user.entity.buyer;

public interface BuyerRepository extends JpaRepository<buyer, Integer> {



	buyer findByEmailAndPassword(String email, String password);

	
	
}
