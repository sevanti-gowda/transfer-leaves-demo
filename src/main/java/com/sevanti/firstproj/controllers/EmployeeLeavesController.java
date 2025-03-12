package com.sevanti.firstproj.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sevanti.firstproj.dto.EmployeeLeavesDTO;
import com.sevanti.firstproj.service.EmployeeLeavesService;

@RestController
public class EmployeeLeavesController {
	
	@Autowired
	EmployeeLeavesService empLeavesService;
	
	// localhost:8080/getLeaves/1204980
	@GetMapping(value="/getLeaves/{employeeId}")
	public EmployeeLeavesDTO getEmpLeaves(@PathVariable("employeeId") Integer empId) {
		return empLeavesService.getEmployeeLeaves(empId);
	}
	
	@PostMapping(value="/createNewEmployee")
	public String createNewEmployee(@RequestBody EmployeeLeavesDTO empLeavesDTO) {
		empLeavesService.createNewEmployee(empLeavesDTO);
		return "Employee Created";
	}
	// localhost:8080/transferLeaves?from=1204980&toId=1173649&leaves=6
	@PutMapping(value="/transferLeaves")
	public String transferLeaves(@RequestParam("from") Integer fromId, @RequestParam Integer toId, @RequestParam Integer leaves) {
		return null;
	}
	
	@DeleteMapping(value="/deleteEmployee/{employeeId}")
	public EmployeeLeavesDTO deleteEmployee(@PathVariable("employeeId") Integer empId) {
		return null;
	}

}
