package com.bigcorp.springapp.service;

import com.bigcorp.springapp.correction.spring.autrebean.UnBean;
import com.bigcorp.springapp.correction.spring.configuration.MaPremiereClasseDeConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(MaPremiereClasseDeConfiguration.class)
class DemonstrationServiceTest {

	@Autowired
	private UnBean unBean;

	@Test
	public void test() {
		Assertions.assertNotNull(this.unBean);
		unBean.sayHello();
	}

}
