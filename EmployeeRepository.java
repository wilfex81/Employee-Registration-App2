package com.codewithflex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import come.codewithflex.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
