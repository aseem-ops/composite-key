package com.t4transform.compositekey.repository;

import com.t4transform.compositekey.entity.Employee;
import com.t4transform.compositekey.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Person> {
}
