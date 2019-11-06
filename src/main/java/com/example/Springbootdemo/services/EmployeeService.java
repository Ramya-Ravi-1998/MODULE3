package com.example.Springbootdemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Springbootdemo.EmployeeDAO;
import com.example.Springbootdemo.models.Employee;

@Service
public class EmployeeService {

	private EmployeeDAO empdao;
	
	@Autowired
	public EmployeeService(EmployeeDAO empdao) {
		super();
		this.empdao = empdao;
	}

	
	public List<Employee> getSortedEmp(){
		
		List<Employee> emplist= empdao.findAll();
		
		return emplist;
	}
	
	 public Employee saveNewEmployee(Employee emp) {  
		 return empdao.save(emp);    
		 }
	 
	 
	 public boolean removeEmployee(int empId) {  
		 return empdao.deleteById(empId); }
	 
	 
	 public Employee getEmp(int empId) {  
		 return empdao.findById(empId); }
	 
	 

	public Employee updEmployee(int empId) {
		// TODO Auto-generated method stub
		 return empdao.updById(empId);
	}
}
