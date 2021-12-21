package com.Employee.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.Emp.Employee;
import com.Employee.repo.*;

@Service
public class EmployeeService {
	
	@Autowired
	private EmpRepository e;
	
	
//	private static List<Employee>  emp=new ArrayList<Employee>();
	
	
	// it will not able to add elements to list because main method is not there.
	// so it uses static block to add elements because static method is load in class loader
	// https://stackoverflow.com/questions/51064240/list-add-method-gives-error-in-public-class
//	static {
//	emp.add(new Employee(12,"abc","xyz"));
//	emp.add(new Employee(13,"ram","tester"));
//	}
	
	
	
	
	
	public EmployeeService(EmpRepository e) {
		super();
		this.e = e;
	}

	public List<Employee> getAllEmployee(){
		return (List<Employee>) this.e.findAll();
	}
	
	public Employee getEmployee(int id) {
		
//		for(Employee i:emp) {
//		if(i.getId()==id) {
//			return i;
//		}
//	}
//	return null;
		
		for(Employee i:e.findAll()) {
		if(i.getId()==id) {
			return i;
			}
	     }
	    return null;
		

	}
	
	public void addEmployee(Employee em) {
		e.save(em);
	}
	
	public boolean removeEmployee(int id) {
		return e.existsById(id);
//		for(Employee i:emp) {
//			if(i.getId()==id) {
//				return emp.remove(i);
//			}
//		}
//		return false;
	}
	
	public Employee updateEmployee(Employee em,int id) {
		
		for(Employee i:e.findAll()) {
			if(i.getId()==id) {
				i.setName(em.getName());
				i.setRole(em.getRole());
			}
		}
		return em;
		
//		for(Employee i:emp) {
//			if(i.getId()==id) {
//				i.setName(e.getName());
//				i.setRole(e.getRole());
//			}
//		}
//		return e;
	}
	


}
