package com.oabadch.ventas.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oabadch.ventas.app.model.Customer;
import com.oabadch.ventas.app.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {


	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	public ResponseEntity<List<Customer>> findAll(){
		
		return ResponseEntity.ok(customerService.findALL());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Customer> findById(@PathVariable("id") Integer idCustomer){
		
		return customerService.findById(idCustomer)
				.map(ResponseEntity::ok)
				.orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Customer> create(@RequestBody Customer customer){
		return new ResponseEntity<>(customerService.create(customer), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Customer> update(@RequestBody Customer customer){
		return customerService.findById(customer.getIdCustomer())
				.map(c -> ResponseEntity.ok(customerService.update(customer)))
				.orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Customer> delete(@PathVariable("id") Integer idCustomer){
		return customerService.findById(idCustomer)
				.map(c -> {
					customerService.delete(idCustomer); 
					return ResponseEntity.ok(c);
				})
				.orElseGet(() -> ResponseEntity.notFound().build());
	}
}
