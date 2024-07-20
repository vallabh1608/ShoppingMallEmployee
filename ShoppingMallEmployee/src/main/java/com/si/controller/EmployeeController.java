package com.si.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.si.entity.Employee;
import com.si.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService s1;
	
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
    	
    	return s1.saveEmployee(employee);
		
	}
	
	@GetMapping("/employee")
    public List<Employee> fetchEmployeeList() {
        //LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return s1.fetchEmployeeList();
    }
	
	@GetMapping("/employee/{id}")
    public Employee fetchEmployeeById(@PathVariable("id") Long id)
            {
        return s1.fetchEmployeeById(id);
    }
	
	@DeleteMapping("/employee/{id}")
    public String deleteEmployeeById(@PathVariable("id") Long id) {
	    s1.deleteEmployeeById(id);
        return "Employee deleted Successfully!!";
    }
	
	@PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable("id") Long id,
                                       @RequestBody Employee employee) {
        return s1.updateEmployee(id,employee);
    }
}
