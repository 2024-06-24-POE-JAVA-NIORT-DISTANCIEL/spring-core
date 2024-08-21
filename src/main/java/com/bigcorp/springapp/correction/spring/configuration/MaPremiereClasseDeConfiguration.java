package com.bigcorp.springapp.correction.spring.configuration;

import com.bigcorp.springapp.correction.spring.autrebean.UnAutreBean;
import com.bigcorp.springapp.correction.spring.autrebean.UnBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.bigcorp.springapp.correction.spring.service")
@PropertySource("classpath:example-application.properties")
public class MaPremiereClasseDeConfiguration {

    @Value("${valeur.configuree}")
    private Integer valeurConfiguree;

    @Value("${login}")
    private String login;

    @Value("${motdepasse}")
    private String motDePasse;

    @Bean
    public UnBean genereBean(){
        System.out.println("genereBean a été appelée");
        System.out.println("La valeur qui vient du fichier de configuration vaut : " + valeurConfiguree);
        return new UnBean();
    }

    @Bean
    public UnAutreBean genereAutreBean(){
        System.out.println("genereAutreBean a été appelée");
        return new UnAutreBean();
    }

    @Bean
    public ConnexionBase connexionBase(){
        ConnexionBase connexionBase = new ConnexionBase(this.login, this.motDePasse);
        return connexionBase;
    }

}