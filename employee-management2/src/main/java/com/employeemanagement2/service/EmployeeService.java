package com.employeemanagement2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employeemanagement2.model.Employee;

import com.employeemanagement2.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployee(){
		return employeeRepository.findAll();
	}

	public void deleteEmployee(int empId) {
		 employeeRepository.deleteById(empId);
	}

}
