package fr.formation.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Musicien {

    @Value("La Carioca")
    private String morceau;
    @Autowired(required = false)
    private Instrument instrument;

    public void jouerMorceau(){
        instrument.Afficher();
        System.out.println("et je joue le morceau "+ this.morceau);
        instrument.jouer();
    }

    public Musicien() {
        System.out.println("Constructeur de base de musicien");
    }

    public Musicien(String morceau, Instrument instrument) {
        System.out.println("Constructeur avec 2 paramètres de Musicien");
        this.morceau = morceau;
        this.instrument = instrument;
    }

    public void setMorceau(String morceau) {
        this.morceau = morceau;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public String getMorceau() {
        return morceau;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    @Override
    public String toString() {
        return "Musicien{" +
                "morceau='" + morceau + '\'' +
                ", instrument=" + instrument +
                '}';
    }
}
