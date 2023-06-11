package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.dto.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	@Query("select u from User u where u.user_Email=?1")
	public User getEmail(String user_Email);
	
}
