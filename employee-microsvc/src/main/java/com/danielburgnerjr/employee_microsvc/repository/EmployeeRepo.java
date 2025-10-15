package com.danielburgnerjr.employee_microsvc.repository;

import com.danielburgnerjr.employee_microsvc.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
