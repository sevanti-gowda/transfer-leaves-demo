package com.sevanti.firstproj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sevanti.firstproj.dao.EmployeeLeavesRepo;
import com.sevanti.firstproj.dto.EmployeeLeavesDTO;
import com.sevanti.firstproj.entity.EmployeeLeaves;

import jakarta.transaction.Transactional;

@Service
public class EmployeeLeavesService {
	
	@Autowired
	EmployeeLeavesRepo empRepo;
	
	@Transactional
	public void createNewEmployee(EmployeeLeavesDTO empLeavesDTO) {
		
		EmployeeLeaves empLeaves = new EmployeeLeaves();
		
		empLeaves.setEmployeeId(empLeavesDTO.getEmployeeId());
		empLeaves.setEmployeeName(empLeavesDTO.getEmployeeName());
		empLeaves.setLeavesBalance(empLeavesDTO.getLeavesBalance());
		
		empRepo.save(empLeaves);
		//
	}
	
	public EmployeeLeavesDTO getEmployeeLeaves(Integer empId) {
		EmployeeLeaves empLeaves = empRepo.findById(empId).get();
		
		return new EmployeeLeavesDTO(empLeaves.getEmployeeId(),empLeaves.getEmployeeName(),empLeaves.getLeavesBalance());
	}
	
	

}
