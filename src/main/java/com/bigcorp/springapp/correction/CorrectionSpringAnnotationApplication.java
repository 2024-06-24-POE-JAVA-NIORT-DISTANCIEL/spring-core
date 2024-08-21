package com.bigcorp.springapp.correction;


import com.bigcorp.springapp.correction.spring.configuration.ConnexionBase;
import com.bigcorp.springapp.correction.spring.configuration.MaPremiereClasseDeConfiguration;
import com.bigcorp.springapp.correction.spring.autrebean.UnBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Exemple d'une classe initialisation un ApplicationContext Spring 
 * avec du code Java, et des beans annotés.
 */
public class CorrectionSpringAnnotationApplication {

	public static void main(String[] args) {
		// Récupération du contexte Spring
		// Et dans un try-with-resources
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext()) {
			//Ajout dans le contexte de toutes les classes du package 
			//com.bigcorp.springapp.service (et de leurs enfants).
			appContext.register(MaPremiereClasseDeConfiguration.class);
			appContext.refresh();

			UnBean unBeanQuiVientDuContexteSpring = appContext.getBean(UnBean.class);
			unBeanQuiVientDuContexteSpring.sayHello();


			appContext.getBean(ConnexionBase.class).connexion();
		}


	}

}
