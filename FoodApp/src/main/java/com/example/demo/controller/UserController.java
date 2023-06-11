package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.ResponseStructure;
import com.example.demo.dto.User;
import com.example.demo.service.UserService;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/save")
	public User saveuser(@RequestBody User user) {
		return service.saveuser(user);
	}
	
	@GetMapping("/getAll")
    public List<User> getAlldata(){
		return service.getAllData();
	}
	
	@GetMapping("/find")
	public  User findUser( @RequestParam int id) {
		return service.findUser(id);
	}
	
//	@GetMapping("/getbyid")
//	public Optional<User> getbyid(@RequestParam Integer cust_id){
//		return service.getById(cust_id);
//	}
	
	@PutMapping("/update")
	public ResponseEntity<ResponseStructure<User>> updateUser(@RequestParam int id, @RequestBody User user){
		return service.updateUser(id, user);
		
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<ResponseStructure<User>> deleteUser(@RequestParam int id){
		return service.deleteUser(id);
	}
	
	@GetMapping("/user")
	public ResponseStructure<User> findByEmail(@RequestParam String user_Email, @RequestParam String user_Password ){
		return  service.findByEmail(user_Email,user_Password);	
	}
}

