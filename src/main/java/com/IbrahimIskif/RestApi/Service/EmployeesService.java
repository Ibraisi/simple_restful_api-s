package com.IbrahimIskif.RestApi.Service;

import com.IbrahimIskif.RestApi.model.Employee;
import com.IbrahimIskif.RestApi.Repositeries.EmployeeRepostry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesService {
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
    public void deleteAllEmp(){
        employeeRepostry.deleteAll();
    }
    public List<Employee> getAllEmpUnderDep(Long depId){
        return employeeRepostry.findByDepartmentId(depId);
    }
}
