package com.bigcorp.springapp.service.separated;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
	
	private int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void sayHello() {
		System.out.println("hello de EmployeeService" + this.value);
	}

}
