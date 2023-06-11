package com.example.demo.DTO;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {

	@Autowired
	private Customer customer;
}
