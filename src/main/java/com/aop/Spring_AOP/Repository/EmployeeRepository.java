package com.aop.Spring_AOP.Repository;

import com.aop.Spring_AOP.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
