package com.suvidhabank.repository;

import org.springframework.data.repository.CrudRepository;

import com.suvidhabank.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

}
