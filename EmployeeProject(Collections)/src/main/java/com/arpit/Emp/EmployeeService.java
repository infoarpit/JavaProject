package com.arpit.Emp;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	
	private static List<Employee>  emp=new ArrayList<Employee>();
	
	// it will not able to add elements to list because main method is not there.
	// so it uses static block to add elements because static method is load in class loader
	// https://stackoverflow.com/questions/51064240/list-add-method-gives-error-in-public-class
	static {
	emp.add(new Employee(12,"abc","xyz"));
	emp.add(new Employee(13,"ram","tester"));
	}
	
	public List<Employee> getAllEmployee(){
		return emp;
	}
	
	public Employee getEmployee(int id) {
		for(Employee i:emp) {
			if(i.getId()==id) {
				return i;
			}
		}
		return null;
	}
	
	public void addEmployee(Employee e) {
		emp.add(e);
	}
	
	public boolean removeEmployee(int id) {
		for(Employee i:emp) {
			if(i.getId()==id) {
				return emp.remove(i);
			}
		}
		return false;
	}
	
	public Employee updateEmployee(Employee e,int id) {
		for(Employee i:emp) {
			if(i.getId()==id) {
				i.setName(e.getName());
				i.setRole(e.getRole());
			}
		}
		return e;
	}
	


}
