package sk.hibernate.dao;

import java.util.List;

import sk.hibernate.pojo.Customer;

public interface CustomerDao {
	Long saveCustomer(Customer customer);

	void updateCustomer(Customer customer);

	void deleteCustomer(Long id);

	Customer findCustomerById(Long id);

	List<Customer> findAllCustomers();
}
