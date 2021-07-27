package com.mohsinkd786.service;

import com.mohsinkd786.entity.Project;
import com.mohsinkd786.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    private ProjectRepository repository;

    @Autowired
    public ProjectService(ProjectRepository repository){
        this.repository = repository;
    }

    public List<Project> findAll(){
        List<Project> projects = new ArrayList<>();
        repository.findAll().forEach(e-> projects.add(e));
        return projects;
    }

    public Project createProject(Project project){
        Project savedEntity = repository.save(project);
        return savedEntity;
    }

    public List<Project> findProjectsByNameLike(String name){
        return repository.findProjectsByNameAndOrderByBudget(name);
    }

//    public Employee findById(Integer id){
//        Optional<Employee> optionalEmployee=  repository.findById(id);
//        return optionalEmployee.isPresent() ? optionalEmployee.get() : null;
//    }

//    public Employee updateEmployee(Employee employee){
//        Employee empFound = findById(employee.getEId());
//        empFound.setName(employee.getName());
//        Employee updatedEmployee =  repository.save(empFound);
//        return updatedEmployee;
//    }
//    public boolean deleteEmployee(Integer eId){
//        repository.deleteById(eId);
//        return true;
//    }
}
