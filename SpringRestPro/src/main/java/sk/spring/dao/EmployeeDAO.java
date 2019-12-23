package sk.spring.dao;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import sk.spring.model.Employee;

public interface EmployeeDAO {
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public void updateEmployee(Employee employee);
	public Employee getEmployeeById(long id);
	public void deleteEmployee(long id);
}