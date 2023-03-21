package com.spring.mongo.demo.repository;

import java.util.List;

import com.spring.mongo.demo.model.Address;
import com.spring.mongo.demo.model.Employee;

public interface EmployeeQueryDao {
	
	List<Employee> getAll();

	List<Employee> getEmployeeByFirstName(String firstName);

	Employee getSingleEmployeeByFirstName(String firstName);

	List<Employee> getEmployeeByFirstNameLike(String firstName);

	Employee getSingleEmployeeByLastName(String lastName);

	void doUpdateEmployeeSalary(int empId, float salary);

	List<Employee> getEmployeeBySalaryGreaterThan(int salary);

	void doUpdateEmployeeAddress(int empId, Address address);
}
