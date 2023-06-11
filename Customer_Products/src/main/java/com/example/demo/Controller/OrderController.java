package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.OrderRequest;
import com.example.demo.Entity.Customer;
import com.example.demo.Repo.CustomerRepo;
import com.example.demo.Repo.ProductRepo;

@RestController
public class OrderController {

	@Autowired
	private CustomerRepo custRepo;
	
	@Autowired
	private ProductRepo prdctsRepo;
	
	@PostMapping(path="/PlaceOrder")
	public Customer placeHolder(@RequestBody OrderRequest request) {
    	return	custRepo.save(request.getCustomer());
	}
	@GetMapping(path="/GetAll")
	public List<Customer> findAllOrders(){
		return custRepo.findAll();
	}
}
