package fr.formation.model;

public class Violon implements Instrument{

    public Violon() {
        System.out.println("Constructeur de Violon");
    }

    @Override
    public void afficher() {
        System.out.println("Je suis un violon...");
    }

    @Override
    public void jouer() {
        System.out.println("ZIN ZIN ZIN");
    }
}
