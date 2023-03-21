package com.spring.mongo.demo.service;

import java.util.List;

import com.spring.mongo.demo.model.Address;
import com.spring.mongo.demo.model.Employee;

public interface EmployeeQueryService {
	
	List<Employee> getAll();

	List<Employee> getEmployeeByFirstName(String firstName);

	Employee getSingleEmployeeByLastName(String lastName);

	List<Employee> getEmployeeByFirstNameLike(String firstName);

	Employee getOneEmployeeByFirstName(String firstName);

	List<Employee> getEmployeeBySalaryGreaterThan(int salary);

	List<Employee> getEmployeeByCondition(Employee employee);

	void doUpdateEmployeeSalary(int empId, float salary);

	void doUpdateEmployeeAddress(int empId, Address address);
}
