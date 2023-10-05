package com.t4transform.compositekey.service;

import com.t4transform.compositekey.entity.Employee;
import com.t4transform.compositekey.entity.Person;
import com.t4transform.compositekey.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) {
        Person person = new Person();
        person.setFirstName(employee.getPerson().getFirstName());
        person.setLastName(employee.getPerson().getLastName());
        person.setAge(employee.getPerson().getAge());
        Employee emp = new Employee();
        emp.setPerson(person);
        emp.setCity(employee.getCity());
        emp.setCountry(employee.getCountry());

        return employeeRepository.save(emp);
    }
}
