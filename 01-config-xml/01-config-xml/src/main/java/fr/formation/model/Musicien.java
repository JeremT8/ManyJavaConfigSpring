package fr.formation.model;

public class Musicien {

    private String morceau;
    private Instrument instrument;


    public Musicien() {
        System.out.println("Constructeur de base de Musicien");
    }

    public Musicien(String morceau, Instrument instrument) {
        System.out.println("Constructeur avec 2 paramètres de Musicien");
        this.morceau = morceau;
        this.instrument = instrument;
    }

    public String getMorceau() {
        return morceau;
    }

    public void setMorceau(String morceau) {
        this.morceau = morceau;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Musicien{");
        sb.append("morceau='").append(morceau).append('\'');
        sb.append(", instrument=").append(instrument);
        sb.append('}');
        return sb.toString();
    }

    public void jouerMorceau() {
        instrument.afficher();
        System.out.println(" et je joue le morceau " + this.morceau);
        instrument.jouer();
    }
}
