package com.sevanti.firstproj.dto;

import java.util.Objects;

public class EmployeeLeavesDTO {
	
	private Integer employeeId;
	private String employeeName;
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
	
	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName, leavesBalance);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeLeavesDTO other = (EmployeeLeavesDTO) obj;
		return Objects.equals(employeeId, other.employeeId) && Objects.equals(employeeName, other.employeeName)
				&& Objects.equals(leavesBalance, other.leavesBalance);
	}
	
	

}
