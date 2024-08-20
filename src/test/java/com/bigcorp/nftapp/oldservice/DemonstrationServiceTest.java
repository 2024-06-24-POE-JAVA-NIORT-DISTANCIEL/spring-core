package com.bigcorp.nftapp.oldservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.bigcorp.springapp.service.DemonstrationService;

@SpringJUnitConfig(locations = "classpath:/spring-context-old.xml")
class DemonstrationServiceTest {

	@Autowired
	private DemonstrationService demonstrationService;

	@Test
	public void test() {
		Assertions.assertNotNull(this.demonstrationService);
		int value = 256;
		this.demonstrationService.setValue(value);
		Assertions.assertEquals(value, this.demonstrationService.getValue());
	}

}
