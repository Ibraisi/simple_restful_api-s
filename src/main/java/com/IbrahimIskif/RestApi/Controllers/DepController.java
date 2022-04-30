package com.IbrahimIskif.RestApi.Controllers;

import com.IbrahimIskif.RestApi.Service.DepartmentService;
import com.IbrahimIskif.RestApi.model.Department;
import com.IbrahimIskif.RestApi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DepController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/DepartmentById")
    public Department getEmpById(@RequestParam long id){
        return departmentService.getDepById(id);
    }
    @GetMapping("/Departments")
    public List<Department> getAAlldep(){
        return departmentService.getAllDep();
    }

    @GetMapping("/EmployeeByName")
    public List<Department> getDepByName(@RequestParam String name){
        return departmentService.getDepByName(name);
    }
    @PostMapping("/Departments")
    public String addEmp(@RequestBody Department newDep){
        departmentService.addDep(newDep);
        return "Dep created";
    }
    @DeleteMapping("/DepDeleteById")
    public String deleteEmpByID(@RequestParam long id){
        departmentService.deleteDepById(id);
        return "Dep deleted";
    }
    @DeleteMapping
    public String deleteAll(){
        departmentService.deleteAllDep();
        return "All dep's Deleted";
    }
    @PutMapping("/Employees")
    public String deleteEmpByID(@RequestBody Department dep){
        departmentService.updateDep(dep);
        return "Dep updated";
    }
}
