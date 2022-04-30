package com.IbrahimIskif.RestApi.Repositeries;

import com.IbrahimIskif.RestApi.model.Department;
import com.IbrahimIskif.RestApi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepositry extends JpaRepository<Department,Long> {
    List<Department> findBydepartment (String department);
}
