package com.suvidhabank.repository;

import org.springframework.data.repository.CrudRepository;

import com.suvidhabank.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String>{

}
