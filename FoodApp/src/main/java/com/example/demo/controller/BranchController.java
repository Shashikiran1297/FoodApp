package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.ResponseStructure;
import com.example.demo.dto.Branch;
import com.example.demo.service.BranchService;

@RestController

public class BranchController {

	@Autowired
	private BranchService branchService;
	
//	@PostMapping("/save")
//	 public Branch saveuser(@RequestBody Branch branch) {
//		return branchService.saveBranch(branch);
//	}
	
//	@PostMapping("/save")
//	public ResponseEntity<ResponseStructure<Branch>> saveUser(@RequestBody Branch branch){
//		return branchService.saveBranch(branch);
//	}
	
	@PostMapping(path = "/savebranch/{id}")

	private ResponseEntity<ResponseStructure<Branch>> saveBranch(@RequestBody Branch branch, @PathVariable("id") int id){
		return branchService.saveBranch(branch, id);
	}
	
//	@GetMapping("/getAllBranch")
//	public List<Branch> getAllBranch(){
//		return branchService.getAllBranch();
//	}
	
	@GetMapping("/getAllBranch")
	public ResponseEntity<ResponseStructure<Branch>> getAllUser(){
		return branchService.getAllBranch();
	}
	
//	@GetMapping("/getBranch")
//	public Branch findBranch(@RequestParam int id) {
//		return branchService.findBranch(id);
//	}
	
	@GetMapping("/getBranch")
	public ResponseEntity<ResponseStructure<Branch>> findBranch(int id){
		return branchService.findBranch(id);
	}
	
	@PutMapping("/updateBranch")
	public ResponseEntity<ResponseStructure<Branch>> updateBranch(@RequestParam int id,@RequestBody Branch branch){
		return branchService.updateBranch(id, branch);
	}
}