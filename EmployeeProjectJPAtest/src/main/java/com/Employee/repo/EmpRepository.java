package com.Employee.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.Employee.Emp.*;

@Component
public interface EmpRepository extends CrudRepository<Employee,Integer> {
	public Employee findById(int id);

//	public boolean existsById(int id);
}
