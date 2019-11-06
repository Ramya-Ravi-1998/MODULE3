package com.example.Springbootdemo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Springbootdemo.models.Employee;


@Repository
@Transactional
public class EmployeeDAOImp implements EmployeeDAO {

	
	
	private EntityManager entityManager;
	
	 @Autowired    
	 public EmployeeDAOImp(EntityManager entityManager) {  
		  super();
		 this.entityManager = entityManager;
		 }
	 

	  @Override 
	    public Employee findById(int empId) {   
	    	//using entityManager find an employee    
	    	Employee emp = entityManager.find(Employee.class, empId);   
	    	return emp;   
	    	}
	    

	    @Override   
	    public List<Employee> findAll() {   
	    	// using entity  manager create a query to get all employees     
	    	TypedQuery<Employee> query = entityManager.createQuery("SELECT e from Employee e", Employee.class);  
	    	List<Employee> List = query.getResultList();       
	    	return List; 
	    	}
	    
	    @Override 
	    public Employee save(Employee emp) {    
	    	// TODO Auto-generated method stub  
	    	entityManager.persist(emp);      
	    	return entityManager.merge(emp);  
	    	}
	    
	    @Override 
	    public boolean deleteById(int empId) {     
	    	Employee emp = this.findById(empId);       
	    	if(emp!=null) {   
	    		entityManager.remove(emp);   
	    		return true;       
	    		} else       
	    			return false;         // TODO Auto-generated method stub    
	    	
	    }
	    
	    Employee emp = new Employee();
	    
	    @Override
	    public Employee updById(int empId)
	    {
	    	Employee emp = this.findById(empId);       
	    	if(emp!=null) {
	    		emp.setCity("bangalore");
	    		emp.setSalary(30000.0);
	    	
	    	    return emp;
	    	    }
	    	else 
	    		throw new RuntimeException("could not find the employee ");  
	    
	    
	    
} 
	    
	    
	    
}	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

