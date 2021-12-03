package com.arpit.EmployeeProject.EmpService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arpit.EmployeeProject.Emp.Employee;
import com.arpit.EmployeeProject.dao.EmployeeRepositry;

@Component
public class EmployeeService {
	
	@Autowired
	public EmployeeRepositry employeeRepositry;
	
	
	public List<Employee> getAllEmployee(){
	return (List<Employee>) this.employeeRepositry.findAll();
    }
	
	
	
	public Employee getEmployee(int id) {
		Employee e= this.employeeRepositry.findById(id);
		return e;
	}
	
	
	public Employee addEmployee (Employee e) {
		Employee result= this.employeeRepositry.save(e);
		return result;
	}
	
	
	
	public void removeEmployee(int id) {
		this.employeeRepositry.deleteById(id);
	}
	
	public void updateEmployee(Employee e,int id) {
		e.setId(id);
		this.employeeRepositry.save(e);
	}
	


}
