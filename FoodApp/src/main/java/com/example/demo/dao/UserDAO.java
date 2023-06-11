package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.User;
import com.example.demo.repo.UserRepo;

@Repository
public class UserDAO {
	@Autowired
	private UserRepo userrepo;
	public User saveuser(User user) {
		return userrepo.save(user);
	}
	public List<User> getAllData() {
		return  userrepo.findAll();
	}
//	public Optional<User> getById(Integer cust_id){
//		
//		return userrepo.findById(cust_id);
//	}
	public User findUser(int id) {
		
		Optional<User> option=userrepo.findById(id);
		if(option.isPresent()) {
		return option.get();
		}
		return null; 
	}
	public User updateUser(int id ,User user) {
		Optional<User> user1=userrepo.findById(id);
		if(user1.isPresent()) {
			user.setUser_Id(id);
			return userrepo.save(user);
		}
		return null;
	}
	public User deleteUser(int id ) {
		Optional<User> user1=userrepo.findById(id);
		if(user1.isPresent()) {
			userrepo.deleteById(id);
			return user1.get();
		}
		return null;
	}
	public User getEmail(String user_Email) { 
		User user=userrepo.getEmail(user_Email);
		if(user!=null) {
			return user;
		}
		return null;
	}
	
}
