package com.arpit.EmployeeProject.dao;


import org.springframework.data.repository.CrudRepository;

import com.arpit.EmployeeProject.Emp.Employee;

public interface EmployeeRepositry extends CrudRepository<Employee, Integer> {
	public Employee findById(int id); 
}
