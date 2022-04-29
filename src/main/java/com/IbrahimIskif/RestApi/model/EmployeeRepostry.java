package com.IbrahimIskif.RestApi.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepostry extends JpaRepository<Employee,Long> {

    public List<Employee> findByFirstName (String firstName);
}
