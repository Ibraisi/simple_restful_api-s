package com.IbrahimIskif.RestApi.EployeeService;

import com.IbrahimIskif.RestApi.model.Employee;
import com.IbrahimIskif.RestApi.model.EmployeeRepostry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpmloyeesService {
    @Autowired
    EmployeeRepostry employeeRepostry;

    public List<Employee> getAllEmp(){
        return employeeRepostry.findAll();
    }
    public Employee getEmpById(long id){
        return employeeRepostry.findById(id).orElseThrow(null);
    }

    public List<Employee> findByFirstOrLastName(String firstName){
        return employeeRepostry.findByFirstName(firstName);
    }
    public void addEmp(Employee emp){
        employeeRepostry.save(emp);
    }
    public void deleteEmpbyId(long id){
        employeeRepostry.deleteById(id);
    }
    public void updateEmp(Employee emp){
        employeeRepostry.save(emp);
    }
}
