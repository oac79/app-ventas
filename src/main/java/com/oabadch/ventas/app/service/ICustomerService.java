package com.oabadch.ventas.app.service;

import java.util.List;
import java.util.Optional;

import com.oabadch.ventas.app.model.Customer;

public interface ICustomerService {
	List<Customer> findALL();
	Optional<Customer> findById(Integer id);
	Customer create(Customer customer);
	Customer update(Customer customer);
	void delete(Integer id);
}
