package com.sk.spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sk.spring.dao.EmployeeDAOImpl;
import com.sk.spring.model.Employee;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDAOImpl employeeDAOImpl;
    
    /*** Creating a new Employee ***/
    @CrossOrigin(origins="http://localhost:4200")
    @RequestMapping(value="/create", method=RequestMethod.POST, 
            produces="application/json", consumes="application/json")
    public void createEmployee(@RequestBody Employee employee)
    {
        employeeDAOImpl.createEmployee(employee);
    }
    
    /*** Retrieve all Employees ***/
    @CrossOrigin(origins="http://localhost:4200")
    @RequestMapping(value="/employees",produces="application/json",
            method=RequestMethod.GET)
    public List<Employee> getAllEmployees()
    {
        List<Employee> employeeList = employeeDAOImpl.getAllEmployees();
        return employeeList;
    }
    
    /*** Update a Employee ***/
    @CrossOrigin(origins="http://localhost:4200")
    @RequestMapping(value="/update", method=RequestMethod.PUT, 
            produces="application/json", consumes="application/json")
    public void updateEmployee(@RequestBody Employee employee)
    {
    	employeeDAOImpl.updateEmployee(employee);
    }
    
    /*** Retrieve a single Student ***/
    @CrossOrigin(origins="http://localhost:4200")
    @RequestMapping(value="/employee/{id}",produces="application/json",
            method=RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable("id") long id)
    {
    	Employee employee = employeeDAOImpl.getEmployeeById(id);
        return employee;
    }
    
    /*** Delete a Student ***/
    @CrossOrigin(origins="http://localhost:4200")
    @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE,
    		produces="application/json")
    public void deleteEmployee(@PathVariable("id") long id)
    {
    	employeeDAOImpl.deleteEmployee(id);
    }
}