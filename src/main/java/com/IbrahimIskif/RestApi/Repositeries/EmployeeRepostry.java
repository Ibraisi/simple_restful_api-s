package com.IbrahimIskif.RestApi.Repositeries;

import com.IbrahimIskif.RestApi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepostry extends JpaRepository<Employee,Long> {

    public List<Employee> findByFirstName (String firstName);

    public List<Employee> findByDepartmentId (long departmentId );

}
