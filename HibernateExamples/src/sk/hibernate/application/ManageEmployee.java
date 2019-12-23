package sk.hibernate.application;

import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import sk.hibernate.pojo.Employee;

public class ManageEmployee
{
	private static SessionFactory factory;
	public static void main(String[] args)
	{
		try 
		{
			factory = new Configuration().configure().buildSessionFactory();
		} 
		catch (Throwable ex)
		{
			System.err.println("Failed to create sessionFactory object." + ex);
			//throw new ExceptionInInitializerError(ex);
		}
		ManageEmployee ME = new ManageEmployee();
		/* Add few employee records in database */
		Integer empID1 = ME.addEmployee("SreeK", "K", 25000);
		Integer empID2 = ME.addEmployee("SR", "K", 25000);
		Integer empID3 = ME.addEmployee("JS", "R", 10000);
		/* List down all the employees */
		System.out.println("*****************EMPLOYEE RECORDS*****************");
		ME.listEmployees();
		/* Update employee's records */
		ME.updateEmployee(empID1, 27000);
		System.out.println("**********EMPLOYEE RECORDS AFTER UPDATE***********");
		ME.listEmployees();
		/* Delete an employee from the database */
		ME.deleteEmployee(empID2);
		ME.deleteEmployee(empID3);
		System.out.println("**********EMPLOYEE RECORDS AFTER DELETE***********");
		/* List down new list of the employees */
		ME.listEmployees();
	}
	/* Method to CREATE an employee in the database */
	public Integer addEmployee(String fname, String lname, int salary)
	{
		Session session = factory.openSession();
		Transaction tx = null;
		Integer employeeID = null;
		try 
		{
			tx = session.beginTransaction();
			Employee employee = new Employee(fname, lname, salary);
			employeeID = (Integer) session.save(employee);
			tx.commit();
		} 
		catch (HibernateException e) 
		{
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		} 
		finally 
		{
			session.close();
		}
		return employeeID;
	}
	/* Method to READ all the employees */
	public void listEmployees( )
	{
		Session session = factory.openSession();
		Transaction tx = null;
		System.out.println("First Name\tLast Name\tSalary");
		try 
		{
			tx = session.beginTransaction();
			List employees = session.createQuery("FROM Employee").list();
			for (Iterator iterator = employees.iterator(); iterator.hasNext();)
			{
				Employee employee = (Employee) iterator.next();
				System.out.println(employee.getFirstName()+"\t"
				+employee.getLastName()+"\t"
				+employee.getSalary());
			}
			tx.commit();
		} 
		catch (HibernateException e) 
		{
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		} 
		finally 
		{
			session.close();
		}
	}
	/* Method to UPDATE salary for an employee */
	public void updateEmployee(Integer EmployeeID,int salary )
	{
		Session session = factory.openSession();
		Transaction tx = null;
		try 
		{
			tx = session.beginTransaction();
			Employee employee = (Employee)session.get(Employee.class, EmployeeID);
			employee.setSalary( salary );
			session.update(employee);
			tx.commit();
		} 
		catch (HibernateException e) 
		{
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		} 
		finally 
		{
			session.close();
		}
	}
	/* Method to DELETE an employee from the records */
	public void deleteEmployee(Integer EmployeeID)
	{
		Session session = factory.openSession();
		Transaction tx = null;
		try 
		{
			tx = session.beginTransaction();
			Employee employee = (Employee)session.get(Employee.class, EmployeeID);
			session.delete(employee);
			tx.commit();
		} 
		catch (HibernateException e) 
		{
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		} finally 
		{
			session.close();
		}
	}
}