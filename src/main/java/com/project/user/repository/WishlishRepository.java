package com.project.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.user.entity.wishlist;

public interface WishlishRepository extends JpaRepository<wishlist, Integer> {

}
