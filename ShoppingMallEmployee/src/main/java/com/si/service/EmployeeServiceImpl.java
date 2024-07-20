package com.si.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.entity.Employee;
import com.si.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository r1;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return r1.save(employee);
	}

	@Override
	public List<Employee> fetchEmployeeList() {
		// TODO Auto-generated method stub
		return r1.findAll();
	}

	@Override
	public Employee fetchEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return r1.findById(id).get();
	}

	@Override
	public void deleteEmployeeById(Long id) {
		// TODO Auto-generated method stub
		r1.deleteById(id);
	}

	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		// TODO Auto-generated method stub
		 Employee empDB = r1.findById(id).get();

       if(Objects.nonNull(employee.getName()) &&
	       !"".equalsIgnoreCase(employee.getName())) {
	           empDB.setName(employee.getName());
	       }

       if (Objects.nonNull(employee.getDob())) {
           empDB.setDob(employee.getDob());
       } 
		return r1.save(empDB);
	}
	
	
}
