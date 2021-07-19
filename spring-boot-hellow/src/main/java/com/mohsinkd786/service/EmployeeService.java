package com.mohsinkd786.service;

import com.mohsinkd786.entity.Employee;
import com.mohsinkd786.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    //List<Employee> employees = new ArrayList<>();

    private EmployeeRepository repository;

    @Autowired
    public EmployeeService(EmployeeRepository repository){
        this.repository = repository;
    }

    public EmployeeService(){
//        Employee employee1 = new Employee("1","User1");
//        Employee employee2 = new Employee("2","User2");
//        Employee employee3 = new Employee("3","User3");
//        Employee employee4 = new Employee("4","User4");
//        Employee employee5 = new Employee("5","User5");
//        Employee employee6 = new Employee("6","User6");
//
//        employees.add(employee1);
//        employees.add(employee2);
//        employees.add(employee3);
//        employees.add(employee4);
//        employees.add(employee5);
//        employees.add(employee6);

    }
    public List<Employee> findAll(){
        return repository.findAll();
    }

    public Employee createEmployee(Employee employee){
        //employees.add(employee);
        Employee savedEntity = repository.save(employee);
        return savedEntity;
    }

    public Employee findById(Integer id){
        //Optional<Employee> optionalEmployee = employees.stream().filter(e-> e.getEId().equals(id)).findFirst();
        Optional<Employee> optionalEmployee=  repository.findById(id);
        return optionalEmployee.isPresent() ? optionalEmployee.get() : null;
    }

    public Employee updateEmployee(Employee employee){
//        // update the list
//        employees = employees.stream().map(e-> {
//            if(employee.getEId().equals(e.getEId())){
//                e.setName(employee.getName());
//            }
//            return e;
//        }).collect(Collectors.toList());
//
//        return findById(employee.getEId());

        Employee empFound = findById(employee.getEId());
        empFound.setName(employee.getName());
        Employee updatedEmployee =  repository.save(empFound);
        return updatedEmployee;
    }
    public boolean deleteEmployee(Integer eId){
//        Employee employee = findById(eId);
//        boolean wasDeleted = employees.remove(employee);
//
//        return wasDeleted;
        repository.deleteById(eId);
        return true;
    }
}
