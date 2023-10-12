package com.employeemanagement2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement2.model.Employee;
import com.employeemanagement2.service.EmployeeService;

@CrossOrigin(origins =  "http://localhost:3000")

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getEmployee")
	public List<Employee> getEmployee(){
		return employeeService.getEmployee();
	}
	
	@DeleteMapping("/deleteEmployee")
	public void deleteEmployee(@RequestParam(name = "empId") int  empId) {
		 employeeService.deleteEmployee(empId);
	}


}
