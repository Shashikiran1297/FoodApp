package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.config.ResponseStructure;
import com.example.demo.dao.BranchDAO;
import com.example.demo.dao.UserDAO;
import com.example.demo.dto.Branch;
import com.example.demo.dto.User;

@Service
public class BranchService {
	
	@Autowired
	private BranchDAO BranchDao;
	
	@Autowired
	private UserDAO userDao;
	
//	public Branch saveBranch(Branch branch) {
//		return BranchDao.saveBranch(branch);	
//	}
//	
	
	public ResponseEntity<ResponseStructure<Branch>> saveBranch(Branch branch,int id){
		User user = userDao.findUser(id);
		branch.setUser(user);
		ResponseStructure<Branch> responseStructure=new ResponseStructure<>();
		responseStructure.setData(BranchDao.saveBranch(branch));
		responseStructure.setMessage("Branch added successfully");
		responseStructure.setStatus(HttpStatus.CREATED.value());
		return new ResponseEntity<ResponseStructure<Branch>>(responseStructure,null, HttpStatus.CREATED.value());
	}
	
//	public List<Branch> getAllBranch(){
//		return BranchDao.getAllBranch();
//	}
	
	public ResponseEntity<ResponseStructure<Branch>> getAllBranch(){
		ResponseStructure<Branch> responseStructure=new ResponseStructure<>();
		responseStructure.setData(BranchDao.getAllBranch());
		responseStructure.setMessage("All data will retrived Successfully");
		responseStructure.setStatus(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Branch>> (responseStructure,null, HttpStatus.OK.value());
		
	}
	
//	public Branch findBranch(int id) {
//		return BranchDao.findBranch(id);
//		
//	}
	
	public ResponseEntity<ResponseStructure<Branch>> findBranch(int id){
		ResponseStructure<Branch> responseStructure=new ResponseStructure<>();
		responseStructure.setData(BranchDao.findBranch(id));
		responseStructure.setMessage("sucssesfully retrived ");
		responseStructure.setStatus(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Branch>>(responseStructure,null, HttpStatus.OK.value());
	}

	public ResponseEntity<ResponseStructure<Branch>>updateBranch(int id,Branch branch){
		ResponseStructure<Branch> responseStructure=new ResponseStructure<>();
		responseStructure.setData(BranchDao.updateBranch(id, branch));
		responseStructure.setMessage("Data Updated Sucssesfull");
		responseStructure.setStatus(HttpStatus.CREATED.value());
		return new ResponseEntity<ResponseStructure<Branch>>(responseStructure,null, HttpStatus.OK.value());
	}
	
	public ResponseEntity<ResponseStructure<Branch>> deleteBranch(int id){
		ResponseStructure<Branch> responseStructure=new ResponseStructure<>();
		responseStructure.setData(BranchDao.deleteBranch(id));
		responseStructure.setMessage("Data deleted Sucessfully");
		responseStructure.setStatus(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Branch>>(responseStructure,null, HttpStatus.OK.value());
	}
}
