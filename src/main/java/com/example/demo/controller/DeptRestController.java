package com.example.demo.controller;

import com.example.demo.entiry.Department;
import com.example.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dept")
public class DeptRestController {
    @Autowired
    private DeptService deptService;
    private Department department = new Department();

    @RequestMapping(value = "/save")
    public Department saveDepartment() {
        department.setName("開發部");
        return deptService.save(department);
    }
}
