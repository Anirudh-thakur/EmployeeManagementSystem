package com.dailycodebuffer.employee.services;

import com.dailycodebuffer.employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
