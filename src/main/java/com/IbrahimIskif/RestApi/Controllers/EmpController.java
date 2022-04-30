package com.IbrahimIskif.RestApi.Controllers;

import com.IbrahimIskif.RestApi.Service.EmployeesService;
import com.IbrahimIskif.RestApi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmpController {
    @Autowired
    private EmployeesService employeesService;
    @GetMapping("/")
    public String springWelcome(){
        return "hello world!";
    }

    public List<Employee> getEmpsByDep(long depId){
        return employeesService.getEmpsByDep(depId);
    }
    @GetMapping("/EmployeeById")
    public Employee getEmpById(@RequestParam long id){
        return employeesService.getEmpById(id);
    }

    @GetMapping("/Employees")
    public List<Employee> getAllEmployees(){
        return employeesService.getAllEmp();
    }
    @GetMapping("/EmployeeByName")
    public List<Employee> getEmpByName(@RequestParam String name){
        return employeesService.findByFirstOrLastName(name);
    }
    @PostMapping("/Employees")
    public String addEmp(@RequestBody Employee newEmp){
         employeesService.addEmp(newEmp);
         return "Emp created";
    }
    @DeleteMapping("/EmpDeleteById")
    public String deleteEmpByID(@RequestParam long id){
        employeesService.deleteEmpbyId(id);
        return "Emp deleted";
    }
    @DeleteMapping
    public String deleteAll(){
        employeesService.deleteAllEmp();
        return "All Emp's Deleted";
    }
    @PutMapping("/Employees")
    public String deleteEmpByID(@RequestBody Employee emp){
        employeesService.updateEmp(emp);
        return "Emp updated";
    }

}
