package com.arpit.EmployeeProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.arpit.EmpController.EmployeeController",
//		"com.arpit.EmpService.EmployeeService"})
//@EnableJpaRepositories("com.arpit.Emp.EmployeeRepositry")
public class EmployeeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProjectApplication.class, args);
	}

}
