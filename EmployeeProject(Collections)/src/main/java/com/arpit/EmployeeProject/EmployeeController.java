package com.arpit.EmployeeProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arpit.Emp.*;

@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeService employee;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return this.employee.getAllEmployee();
	} 	
	
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		Employee e=this.employee.getEmployee(id);
		return e;
	}
	
	@PostMapping("/employees")
	public void addEmployee(@RequestBody List<Employee> e) {
		for(Employee i:e) {
			this.employee.addEmployee(i);
		}
	}
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@RequestBody Employee e,@PathVariable int id) {
		return this.employee.updateEmployee(e, id);
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable int id) {
		this.employee.removeEmployee(id);
	}
	
	
	

}
