package com.Employee.Services;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Employee.Emp.Employee;
import com.Employee.Service.EmployeeService;
import com.Employee.repo.EmpRepository;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
	
	@Mock
	private EmpRepository personRepo;
	
	
	private EmployeeService personService;
	
	@BeforeEach
	void setUp() {
		this.personService=new EmployeeService(this.personRepo);
		
	}
	
	@Test
	void getAllEmployee() {
		
		
		personService.getAllEmployee();
		
		verify(personRepo).findAll();
		
	}
	
//	@ParameterizedTest
//	void getEmployee(Integer id) {
//		personService.getEmployee(id);
//		verify(personRepo).existsById(id);
//	}

}
