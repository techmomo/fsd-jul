package com.mohsinkd786.controller;

import com.mohsinkd786.entity.Project;
import com.mohsinkd786.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/projects")
@RestController
public class ProjectController {

    private ProjectService ProjectService;

    @Autowired
    public ProjectController(ProjectService ProjectService){
        this.ProjectService = ProjectService;
    }

    @GetMapping
    public List<Project> findProjects(){ // to get all Projects
        return  ProjectService.findAll();
    }

//    @GetMapping("{empId}")
//    public Project findById(@PathVariable Integer empId){ // to find the Project by its id
//        return ProjectService.findById(empId);
//    }

    @PostMapping
    public Project createProject(@RequestBody Project Project){ // create a new Project & add it to the list
        return ProjectService.createProject(Project);
    }

//    @PutMapping
//    public Project updateProject(@RequestBody Project Project){ // modify the Project & update the list
//        return ProjectService.updateProject(Project);
//    }
//
//    @DeleteMapping("{id}")
//    public boolean deleteProject(@PathVariable Integer id){ // delete an Project from the list
//        return ProjectService.deleteProject(id);
//    }
}
