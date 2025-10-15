package com.danielburgnerjr.employee_microsvc.service;

import com.danielburgnerjr.employee_microsvc.entity.Employee;
import com.danielburgnerjr.employee_microsvc.repository.EmployeeRepo;
import com.danielburgnerjr.employee_microsvc.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper mapper;

    public EmployeeResponse getEmployeeById(int id) {
        Optional<Employee> employee = employeeRepo.findById(id);
        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);
        return employeeResponse;
    }

}