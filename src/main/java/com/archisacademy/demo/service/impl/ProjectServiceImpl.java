package com.archisacademy.demo.service.impl;

import com.archisacademy.demo.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    private final List<String> projects = new ArrayList<>();
    @Override
    public List<String> getAllProject() {
        return projects;
    }

    @Override
    public String addProject(String projectName) {
        projects.add(projectName);
        return "Project added successfully.";
    }

    @Override
    public String delete(int index) {
        projects.remove(index);
        return "Project deleted successfully.";
    }

    @Override
    public String update(int index,String projectName) {
        projects.set(index,projectName);
        return index + "-(id)-" + projectName +" is successfully updated";
    }

    @Override
    public String getProjectById(int index) {
        return projects.get(index);
    }

}
