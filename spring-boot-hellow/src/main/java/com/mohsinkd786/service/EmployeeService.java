package com.mohsinkd786.service;

import com.mohsinkd786.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    List<Employee> employees = new ArrayList<>();

    public EmployeeService(){
        Employee employee1 = new Employee("1","User1");
        Employee employee2 = new Employee("2","User2");
        Employee employee3 = new Employee("3","User3");
        Employee employee4 = new Employee("4","User4");
        Employee employee5 = new Employee("5","User5");
        Employee employee6 = new Employee("6","User6");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);

    }
    public List<Employee> findAll(){
        return employees;
    }

    public Employee createEmployee(Employee employee){

        employees.add(employee);
        return employee;
    }

    public Employee findById(String id){
        Optional<Employee> optionalEmployee = employees.stream().filter(e-> e.getEId().equals(id)).findFirst();
        return optionalEmployee.isPresent() ? optionalEmployee.get() : null;
    }

    public Employee updateEmployee(Employee employee){
        // update the list
        employees = employees.stream().map(e-> {
            if(employee.getEId().equals(e.getEId())){
                e.setName(employee.getName());
            }
            return e;
        }).collect(Collectors.toList());

        return findById(employee.getEId());
    }
    public boolean deleteEmployee(String eId){
        Employee employee = findById(eId);
        boolean wasDeleted = employees.remove(employee);

        return wasDeleted;
    }
}
