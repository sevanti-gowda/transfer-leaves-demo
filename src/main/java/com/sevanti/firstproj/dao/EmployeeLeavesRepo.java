package com.sevanti.firstproj.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sevanti.firstproj.entity.EmployeeLeaves;

@Repository
public interface EmployeeLeavesRepo extends JpaRepository<EmployeeLeaves,Integer>{

}
