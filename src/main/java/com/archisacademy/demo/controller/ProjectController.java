package com.archisacademy.demo.controller;

import com.archisacademy.demo.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService){
        this.projectService=projectService;
    }

    @GetMapping("/getall")
    public List<String> getAllProjects(){
        return projectService.getAllProject();
    }

    @PostMapping("/add")
    public String create(@RequestBody String projectName){
        return projectService.addProject(projectName);
    }

    @DeleteMapping("/delete/{index}")
    public String delete(@PathVariable int index){
        return projectService.delete(index);
    }

    @GetMapping("/get/{index}")
    public String getProjectById(@PathVariable int index){
        return projectService.getProjectById(index);
    }

    @PutMapping("/update/{index}")
    public String update(@PathVariable int index,@RequestBody String projectName){
        return projectService.update(index,projectName);
    }
}
