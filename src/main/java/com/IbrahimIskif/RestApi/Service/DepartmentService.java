package com.IbrahimIskif.RestApi.Service;

import com.IbrahimIskif.RestApi.Repositeries.DepartmentRepositry;
import com.IbrahimIskif.RestApi.model.Department;
import com.IbrahimIskif.RestApi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepositry departmentRepositry;


    public Department getDepById(long id) {
        return departmentRepositry.getById(id);
    }

    public List<Department> getAllDep() {
        return departmentRepositry.findAll();
    }

    public List<Department> getDepByName(String name) {
        return departmentRepositry.findByFirstName(name);
    }

    public void addDep(Department newDep) {
        departmentRepositry.save(newDep);
    }

    public void deleteDepById(long id) {
        departmentRepositry.deleteById(id);
    }

    public void deleteAllDep() {
        departmentRepositry.deleteAll();
    }

    public void updateDep(Department dep) {
        departmentRepositry.save(dep);
    }
}
