package com.example.Springbootdemo;

import java.util.List;

import com.example.Springbootdemo.models.Employee;

public interface EmployeeDAO {

	
	public Employee findById(int empId);
	public List<Employee> findAll(); 
	public Employee save(Employee emp); 
	public boolean deleteById(int empId);
	public Employee updById(int empId);

	 
}
