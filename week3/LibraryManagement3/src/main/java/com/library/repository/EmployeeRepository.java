package com.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.library.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
