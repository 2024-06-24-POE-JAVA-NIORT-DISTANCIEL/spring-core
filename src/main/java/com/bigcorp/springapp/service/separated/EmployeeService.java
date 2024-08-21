package com.bigcorp.springapp.service.separated;

import com.bigcorp.springapp.service.DemonstrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

	@Autowired
	private DemonstrationService demonstrationService;
	
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
