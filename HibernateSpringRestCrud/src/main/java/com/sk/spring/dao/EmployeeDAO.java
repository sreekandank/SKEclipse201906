package com.sk.spring.dao;

import java.util.List;

import com.sk.spring.model.Employee;

public interface EmployeeDAO {
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public void updateEmployee(Employee employee);
	public Employee getEmployeeById(long id);
	public void deleteEmployee(long id);
}