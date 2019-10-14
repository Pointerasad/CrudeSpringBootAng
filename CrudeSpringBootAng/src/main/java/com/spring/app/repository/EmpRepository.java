package com.spring.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.app.model.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long> {
  
}
