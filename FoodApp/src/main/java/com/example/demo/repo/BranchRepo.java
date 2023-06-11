package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Branch;

public interface BranchRepo extends JpaRepository<Branch, Integer>{

}
