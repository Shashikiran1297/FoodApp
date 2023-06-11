package com.example.demo.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="jpa_student")
public class Student {
	@Id
	private int student_id;
	private String student_name;
	private String about;

	@OneToMany(targetEntity = Laptop.class,cascade = CascadeType.ALL)
	@JoinColumn(name="cp_fk",referencedColumnName = "id")
	private List<Laptop> laptop;

	
	
	
}
