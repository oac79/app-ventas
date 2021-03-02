package com.oabadch.ventas.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oabadch.ventas.app.model.Customer;
import com.oabadch.ventas.app.repository.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService{
	
	@Autowired
	ICustomerRepository customerRepository;
	
	public List<Customer> findALL() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	public Optional<Customer> findById(Integer id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id);
	}

	public Customer create(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	public Customer update(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
	}

}
