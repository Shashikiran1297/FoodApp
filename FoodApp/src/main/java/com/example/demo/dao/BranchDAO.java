package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Branch;
import com.example.demo.repo.BranchRepo;

@Repository
public class BranchDAO {

	@Autowired
	private BranchRepo branchRepo;
	

	
	public Branch saveBranch(Branch branch) {
		return branchRepo.save(branch);
	}
	
	public List<Branch> getAllBranch(){
		return branchRepo.findAll();
	}
	
	public Branch findBranch(int id) {
		
		Optional<Branch> option=branchRepo.findById(id);
		if(option.isPresent()) {
			return option.get();
		}
		return null;
	}
	
	public Branch updateBranch(int id,Branch branch) {
		Optional<Branch> branch1=branchRepo.findById(id);
		if(branch1.isPresent()) {
			branch.setId(id);
			return branchRepo.save(branch);
		}
		return null;
	}
	public Branch deleteBranch(int id) {
		Optional<Branch> branch=branchRepo.findById(id);
		if(branch.isPresent()) {
			branchRepo.deleteById(id);
		return branch.get();	
		}
		return null;
	}
	
}






