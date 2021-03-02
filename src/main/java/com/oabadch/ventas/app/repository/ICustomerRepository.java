package com.oabadch.ventas.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oabadch.ventas.app.model.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer>{

}
