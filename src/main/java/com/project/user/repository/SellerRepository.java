package com.project.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.user.entity.buyer;
import com.project.user.entity.seller;

public interface SellerRepository extends JpaRepository <seller, Integer>{

	buyer findByEmailAndPassword(String email, String password);

}
