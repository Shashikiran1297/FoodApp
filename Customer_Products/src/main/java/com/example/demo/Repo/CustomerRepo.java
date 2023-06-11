package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
