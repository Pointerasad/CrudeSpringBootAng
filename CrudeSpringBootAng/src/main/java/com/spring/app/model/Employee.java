package com.spring.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Employee {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "id",nullable = false)
        private Long id;
	  //  @NotBlank(message="Please enter your name")
        private String name ;
	   // @NotBlank(message="Please enter your password")
        private String password;
	   // @NotBlank(message="Please enter your email")
        private String email;
	   // @NotBlank(message="Please enter your salary")
        private Double salary ;
        
		public Employee() {
			//super();
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Double getSalary() {
			return salary;
		}
		public void setSalary(Double salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", salary="
					+ salary + "]";
		}  
		
		
        
}
