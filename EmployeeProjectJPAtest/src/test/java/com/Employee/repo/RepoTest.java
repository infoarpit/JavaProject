package com.Employee.repo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Employee.Emp.Employee;

@SpringBootTest
public class RepoTest {
	
	@Autowired
	private EmpRepository personRepo;
	
	@Test
	void isfindById() {
		Employee person=new Employee(19,"abcd","xyza");
		personRepo.save(person);
		
		
		Boolean actualResult=personRepo.existsById(19);
		assertThat(actualResult).isTrue();
	}

}
