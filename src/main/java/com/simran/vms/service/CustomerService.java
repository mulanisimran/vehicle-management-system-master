package com.simran.vms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simran.vms.entity.Customer;

public interface CustomerService {
		List<Customer> getAllCustomers();
		void saveCustomer(Customer customer);
		Customer getCustomerById(Long id);
		void deleteCustomerById(Long id);
	
}
