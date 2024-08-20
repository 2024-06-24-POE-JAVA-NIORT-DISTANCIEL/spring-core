package com.bigcorp.springapp.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bigcorp.springapp.service.DemonstrationService;

/**
 * Exemple d'un main initialisant un ApplicationContext Spring à partir d'un 
 * XML.
 */
public class SpringXmlApplication {

	public static void main(String[] args) throws InterruptedException {
		//Récupération du contexte Spring via XML
		//Et dans un try-with-resources
		try (ClassPathXmlApplicationContext appContext 
				= new ClassPathXmlApplicationContext("spring-context.xml")) {
			
			//Récupération d'un bean via son nom
			DemonstrationService demonstrationService 
				= (DemonstrationService) appContext.getBean("demonstrationService");
			demonstrationService.sayHello();

			//Récupération d'un bean via son nom et sa classe
			DemonstrationService demonstrationService2 
				=  appContext.getBean("demonstrationService", DemonstrationService.class);
			demonstrationService2.setValue(3);
			demonstrationService2.sayHello();
			
		}
	}

}
