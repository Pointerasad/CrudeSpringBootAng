package com.spring.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.model.Employee;
import com.spring.app.repository.EmpRepository;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class EmpController {
   
	@Autowired
	private EmpRepository empRepository;
	
	@GetMapping("/Emps")
	public List<Employee> getEmpAll(){
		return empRepository.findAll();
	}
	@GetMapping("/Emp/{id}")
	public Employee getEmp(@PathVariable Long id){
		return empRepository.findOne(id);
	}
	@DeleteMapping("/Emp/{id}")
	public boolean deleteEmp(@PathVariable Long id){
		 empRepository.delete(id);
		 return true;
	}
	@PostMapping("/Emp")
	public Employee createEmp(@RequestBody Employee emp){
		return empRepository.save(emp);
	}
	@PutMapping("/Emp")
	public Employee updateEmp(@RequestBody Employee emp){
		return empRepository.save(emp);
	}
//	@PutMapping("/Emp/{id}")
//	public Employee updateEmp(@PathVariable Long id ,@RequestBody Map<String,String> map){
//		  // getting blog 
//		  Employee emp = empRepository.findOne(id); 
//	           emp.setName(map.get("name"));
//	           emp.setEmail(map.get("email"));
//	           emp.setPassword(map.get("password"));
//	           emp.setSalary(map.get("salary"));
//		return empRepository.save(emp);
//	}
}
