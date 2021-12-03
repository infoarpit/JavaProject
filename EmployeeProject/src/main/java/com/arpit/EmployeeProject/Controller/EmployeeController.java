package com.arpit.EmployeeProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arpit.EmployeeProject.Emp.Employee;
import com.arpit.EmployeeProject.EmpService.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeService employee;
	
	@GetMapping(path="/emp")
	public List<Employee> getAllEmployees(){
		return this.employee.getAllEmployee();
	} 	
	
	@GetMapping("emp/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		Employee e=this.employee.getEmployee(id);
		return e;
	}
	
	@PostMapping(path="/emp")
	public Employee addEmployee(@RequestBody Employee e) {
		 this.employee.addEmployee(e);
		 return e;
	}
	
	@PutMapping("/emp/{id}")
	public void updateEmployee(@RequestBody Employee e,@PathVariable int id) {
		this.employee.updateEmployee(e, id);
	}
	
	@DeleteMapping("/emp/{id}")
	public void deleteEmployee(@PathVariable int id) {
		this.employee.removeEmployee(id);
	}
	
	
	

}
