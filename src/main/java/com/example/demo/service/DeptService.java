package com.example.demo.service;

import com.example.demo.entiry.Department;

import java.util.List;

public interface DeptService {
    Department save(Department department);
    List<Department> findAll();
    void delete(Long id);
}
