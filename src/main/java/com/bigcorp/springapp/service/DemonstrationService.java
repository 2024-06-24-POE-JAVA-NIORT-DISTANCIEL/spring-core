package com.bigcorp.springapp.service;

import org.springframework.stereotype.Component;

@Component
public class DemonstrationService {

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void sayHello() {
		System.out.println("hello de DemonstrationService" + this.value);
	}

}
