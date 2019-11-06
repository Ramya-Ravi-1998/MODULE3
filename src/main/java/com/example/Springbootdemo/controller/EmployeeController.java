package com.example.Springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Springbootdemo.models.Employee;
import com.example.Springbootdemo.services.EmployeeService;
 

@RestController
public class EmployeeController {
        
    private EmployeeService empser;
    
       @Autowired
       public EmployeeController(EmployeeService empser) {
		super();
		this.empser = empser;
	}

       @GetMapping(value="/employees")
      
	   public List<Employee> getEmp(){
    	   return empser.getSortedEmp();
       }
       
       
       @PostMapping(value="/employees")     
       public Employee createEmployee(@RequestBody Employee emp) 
       {       
    	   return empser.saveNewEmployee(emp);             
       }    
       
       
       @PutMapping(value="/employees/{empId}")
       public Employee updateEmployee(@PathVariable int empId)
       {
    	   return empser.updEmployee(empId);
       }
       
      
       @GetMapping("/employees/{empId}")  
       public Employee getEmployee(@PathVariable int empId) {   
    	   return empser.getEmp(empId); 
    	   }  
       
       
       @DeleteMapping("/employees/{empId}")  
       public String removeEmployee(@PathVariable int empId) {    
    	   Employee emp =  empser.getEmp(empId);   
    	   if(emp!=null) {       
    		   if(empser.removeEmployee(empId)) {        
    			   return "Employee Deleted Successfully"; 
    			   }       
    		   else        
    	        throw new RuntimeException("could not find the employee ");  
    		   }     
    	   else         
    		   throw new RuntimeException("could not find the employee with id");     
    	   }
}