package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="jpa_laptop")
public class Laptop {

	@Id
	private int laptop_id;
	private String modelNum;
	private String brand;
	
	
	private Student student;


	
}
