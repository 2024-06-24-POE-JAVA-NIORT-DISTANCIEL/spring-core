package com.bigcorp.springapp.service;

import com.bigcorp.springapp.service.separated.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CompanyService {

	@Autowired
	private EmployeeService employeeService;

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void sayHello() {
		System.out.println("hello de CompanyService" + this.value);
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
}
