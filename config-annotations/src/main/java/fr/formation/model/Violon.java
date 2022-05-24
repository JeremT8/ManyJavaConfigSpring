package fr.formation.model;

import org.springframework.stereotype.Component;

@Component
public class Violon implements Instrument{
    @Override
    public void Afficher() {
        System.out.println("Je suis un violon ...");
    }

    @Override
    public void jouer() {
        System.out.println("Zin Zin Zin");
    }

    public Violon() {
        System.out.println("Constructeur de Violon");
    }
}
