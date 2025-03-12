package com.sevanti.firstproj.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="employee_leaves")
public class EmployeeLeaves {

	@Id
	@Column(name ="employee_id")
	private Integer employeeId;
	
	@Column(name ="employee_name")
	private String employeeName;
	
	@Column(name ="leaves_balance")
	private Integer leavesBalance;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getLeavesBalance() {
		return leavesBalance;
	}

	public void setLeavesBalance(Integer leavesBalance) {
		this.leavesBalance = leavesBalance;
	}
	

}
