package com.mohsinkd786.service;

import com.mohsinkd786.entity.Employee;
import com.mohsinkd786.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private EmployeeRepository repository;

    @Autowired
    public EmployeeService(EmployeeRepository repository){
        this.repository = repository;
    }

    public List<Employee> findAll(){
        List<Employee> employees = new ArrayList<>();
        repository.findAll().forEach(e-> employees.add(e));
        return employees;
    }

    public Employee createEmployee(Employee employee){
        Employee savedEntity = repository.save(employee);
        return savedEntity;
    }

    public Employee findById(Integer id){
        Optional<Employee> optionalEmployee=  repository.findById(id);
        return optionalEmployee.isPresent() ? optionalEmployee.get() : null;
    }

    public Employee updateEmployee(Employee employee){
        Employee empFound = findById(employee.getEId());
        empFound.setName(employee.getName());
        Employee updatedEmployee =  repository.save(empFound);
        return updatedEmployee;
    }
    public boolean deleteEmployee(Integer eId){
        repository.deleteById(eId);
        return true;
    }
}
