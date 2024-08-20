package com.bigcorp.springapp.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bigcorp.springapp.service.DemonstrationService;

/**
 * Exemple d'une classe initialisation un ApplicationContext Spring 
 * avec du code Java, et des beans annotés.
 */
public class SpringExampleJavaAnnotationApplication {

	public static void main(String[] args) {
		// Récupération du contexte Spring
		// Et dans un try-with-resources
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext()) {
			//Ajout dans le contexte de toutes les classes du package 
			//com.bigcorp.nftapp.oldservice (et de leurs enfants).
			appContext.scan("com.bigcorp.springapp.service");
			appContext.refresh();

			//Récupération d'un bean via son nom
			DemonstrationService demonstrationService = (DemonstrationService) appContext.getBean("demonstrationService");
			demonstrationService.sayHello();
			
		}
	}

}
