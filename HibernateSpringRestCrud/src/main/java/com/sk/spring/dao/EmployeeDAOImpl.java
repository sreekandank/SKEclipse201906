package com.sk.spring.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.sk.spring.model.Employee;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class EmployeeDAOImpl implements EmployeeDAO{
    @PersistenceContext
    private EntityManager entityManager;
    
    public void createEmployee(Employee employee)
    {
    	entityManager.persist(employee);
    }
    
    public List<Employee> getAllEmployees()
    {
        return entityManager.createQuery("select emp from Employee emp").getResultList();
    }
    
    public void updateEmployee(Employee employee)
    {
        entityManager.merge(employee);
    }
    
    public Employee getEmployeeById(long id)
    {
        return entityManager.find(Employee.class,id);
    }
    
    public void deleteEmployee(long id)
    {
    	Employee s = entityManager.find(Employee.class,id);
        entityManager.remove(s);
    }
}