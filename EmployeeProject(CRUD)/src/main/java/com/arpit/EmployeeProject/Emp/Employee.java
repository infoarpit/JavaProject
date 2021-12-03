package com.arpit.EmployeeProject.Emp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employ")
public class Employee {
	
	@Id
	private int id;
	
	private String name;
	private String role;
	
	
	
	public Employee(int id, String name, String role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
	
	
	public Employee() {
		super();
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
