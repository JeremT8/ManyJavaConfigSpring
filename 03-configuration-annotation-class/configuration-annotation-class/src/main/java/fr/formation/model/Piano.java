package fr.formation.model;

import org.springframework.stereotype.Component;


public class Piano implements Instrument{
    @Override
    public void Afficher() {
        System.out.println("Je suis un piano...");
    }

    @Override
    public void jouer() {
        System.out.println("lalala");
    }

    public Piano() {
        System.out.println("Constructeur de Piano");

    }
}
