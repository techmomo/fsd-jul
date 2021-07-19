package com.mohsinkd786.controller;

import com.mohsinkd786.entity.Employee;
import com.mohsinkd786.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/employees")
@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> findEmployees(){ // to get all employees
        return  employeeService.findAll();
    }

    @GetMapping("{empId}")
    public Employee findById(@PathVariable String empId){ // to find the employee by its id
        return employeeService.findById(empId);
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){ // create a new employee & add it to the list
        return employeeService.createEmployee(employee);
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee){ // modify the employee & update the list
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("{id}")
    public boolean deleteEmployee(@PathVariable String id){ // delete an employee from the list
        return employeeService.deleteEmployee(id);
    }
}
