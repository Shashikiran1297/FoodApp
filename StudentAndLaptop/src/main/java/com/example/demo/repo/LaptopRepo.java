package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Laptop;

public interface LaptopRepo  extends JpaRepository<Laptop, Integer>{

}
