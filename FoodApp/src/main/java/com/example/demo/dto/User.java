package com.example.demo.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;




@Component
@Entity
public  @Data class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_Id;
	private String user_Name;
	private String user_Address;
	private String user_Email;
	private String user_Password;
	private String Role;
	
	@OneToMany(mappedBy = "user")
	private List<Branch> branches;
		
}
