package com.bigcorp.springapp.spring;


import com.bigcorp.springapp.service.CompanyService;
import com.bigcorp.springapp.service.separated.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
			//com.bigcorp.springapp.service (et de leurs enfants).
			appContext.scan("com.bigcorp.springapp.service");
			appContext.refresh();

			//Récupération de CompanyService
			CompanyService CompanyService = appContext.getBean(CompanyService.class);
			CompanyService.setValue(59);
			CompanyService.sayHello();

			//Récupération de employeeService
			EmployeeService employeeService = appContext.getBean(EmployeeService.class);
			employeeService.sayHello();

			//Récupération de employeeService, attribut de CompanyService
			CompanyService.getEmployeeService().sayHello();
			
		}


	}

}
