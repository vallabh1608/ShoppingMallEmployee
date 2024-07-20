package com.si.service;

import java.util.List;

import com.si.entity.Employee;


public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> fetchEmployeeList();

	Employee fetchEmployeeById(Long id);

	void deleteEmployeeById(Long id);

	

	Employee updateEmployee(Long id, Employee employee);

}
