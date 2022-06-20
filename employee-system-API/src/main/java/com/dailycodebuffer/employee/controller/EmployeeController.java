package com.dailycodebuffer.employee.controller;

import com.dailycodebuffer.employee.model.Employee;
import com.dailycodebuffer.employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee){
            return employeeService.createEmployee(employee);

    }
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return  employeeService.getAllEmployees();
    }
}
