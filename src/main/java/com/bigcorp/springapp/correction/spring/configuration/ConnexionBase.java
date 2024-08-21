package com.bigcorp.springapp.correction.spring.configuration;

public class ConnexionBase {

    private String login;
    private String motDePasse;

    public ConnexionBase(String login, String motDePasse) {
        this.login = login;
        this.motDePasse = motDePasse;
    }

    public void connexion(){
        System.out.println("Je me connecte avec le login : " + login + " et le mot de passe : " + motDePasse);
    }
}
