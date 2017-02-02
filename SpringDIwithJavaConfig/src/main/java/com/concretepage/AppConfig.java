package com.concretepage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.concretepage.bean.Address;
import com.concretepage.bean.Company;
import com.concretepage.bean.Employee;
import com.concretepage.bean.Product;
@Configuration
public class AppConfig {
	@Bean(name="mycompany")
	
	
	
	public Company getCompany() {
		Company comp = new Company();
		comp.setCompId(100);
		comp.setCompName("ConcretePage");
		return comp;
	}
	@Bean(name="myaddress")
	public Address getAddress() {
		Address add = new Address(200, "Varanasi");
		return add;
	}
	@Bean(name="product")	
	public Product getProduct() {
		Product product = new Product();
		product.setAddress(getAddress());
		product.setCompany(getCompany());
		return product;
	}
	@Bean(name="employee")	
	public Employee getEmployee() {
		Employee employee = new Employee(getCompany(),getAddress());
		return employee;
	}
}
