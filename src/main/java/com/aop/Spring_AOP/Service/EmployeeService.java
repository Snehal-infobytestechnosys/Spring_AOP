package com.aop.Spring_AOP.Service;


import com.aop.Spring_AOP.Entity.Employee;
import com.aop.Spring_AOP.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();

    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long id, Employee employee) {

        employee.setId(id);
        return employeeRepository.save(employee);
    }


    public void deleteEmployee(Long id) {

        employeeRepository.deleteById(id);
    }


}