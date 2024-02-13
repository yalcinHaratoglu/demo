package com.archisacademy.demo.service;

import java.util.List;

public interface ProjectService {
    List<String> getAllProject();
    String addProject(String projectName);
    String delete(int index);
    String update(int index,String projectName);
    String getProjectById(int index);
}
