package com.project.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.user.entity.cart;

public interface CartRepository extends JpaRepository <cart, Integer> {}


