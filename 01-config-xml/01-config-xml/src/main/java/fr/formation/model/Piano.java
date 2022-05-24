package fr.formation.model;

@
public class Piano implements Instrument{

    public Piano() {
        System.out.println("Constructeur de Piano");
    }

    @Override
    public void afficher() {
        System.out.println("Je suis un piano...");
    }

    @Override
    public void jouer() {
        System.out.println("LA LA LA");
    }
}
