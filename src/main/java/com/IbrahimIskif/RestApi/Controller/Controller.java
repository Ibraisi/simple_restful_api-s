package com.IbrahimIskif.RestApi.Controller;

import com.IbrahimIskif.RestApi.EployeeService.EpmloyeesService;
import com.IbrahimIskif.RestApi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Controller {
    @GetMapping("/")
    public String springWelcome(){
        return "hello world!";
    }
    @Autowired
    private EpmloyeesService empS;
    @GetMapping("/EmployeeById")
    public Employee getEmpById(@RequestParam long id){
        return empS.getEmpById(id);
    }

    @GetMapping("/Employees")
    public List<Employee> getAllEmployees(){
        return empS.getAllEmp();
    }
    @GetMapping("/EmployeeByName")
    public List<Employee> getEmpByName(@RequestParam String name){
        return empS.findByFirstOrLastName(name);
    }
    @PostMapping("/Employees")
    public String addEmp(@RequestBody Employee newEmp){
         empS.addEmp(newEmp);
         return "Emp created";
    }
    @DeleteMapping("/EmpDeleteById")
    public String deleteEmpByID(@RequestParam long id){
        empS.deleteEmpbyId(id);
        return "Emp deleted";
    }
    @PutMapping("/Employees")
    public String deleteEmpByID(@RequestBody Employee emp){
        empS.updateEmp(emp);
        return "Emp updated";
    }
}
