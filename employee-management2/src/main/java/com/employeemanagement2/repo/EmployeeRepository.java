package com.employeemanagement2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeemanagement2.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
