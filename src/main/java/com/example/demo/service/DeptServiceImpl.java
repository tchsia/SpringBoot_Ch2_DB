package com.example.demo.service;

import com.example.demo.entiry.Department;
import com.example.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public void delete(Long id) {
        departmentRepository.delete(id);
        return;
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }
}
