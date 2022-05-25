package fr.formation.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Saison {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int numero;

    @Column(name = "Annee", length = 4)
    private int annee;

    @Column(name = "nombre_episode")
    private int nbEpisode;


    @OneToOne(cascade = CascadeType.ALL)
    private Realisateur realisateur;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Acteur> acteurs;

    public Saison() {
    }

    public Saison(int numero, int annee, int nbEpisode, Realisateur realisateur, List<Acteur> acteurs) {
        this.numero = numero;
        this.annee = annee;
        this.nbEpisode = nbEpisode;
        this.realisateur = realisateur;
        this.acteurs = acteurs;
    }

    public Saison(int id, int numero, int annee, int nbEpisode, Realisateur realisateur, List<Acteur> acteurs) {
        this.id = id;
        this.numero = numero;
        this.annee = annee;
        this.nbEpisode = nbEpisode;
        this.realisateur = realisateur;
        this.acteurs = acteurs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getNbEpisode() {
        return nbEpisode;
    }

    public void setNbEpisode(int nbEpisode) {
        this.nbEpisode = nbEpisode;
    }

    public Realisateur getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Realisateur realisateur) {
        this.realisateur = realisateur;
    }

    public List<Acteur> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Acteur>  acteurs) {
        this.acteurs = acteurs;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Saison : ");
        sb.append("\n Numero : ").append(numero);
        sb.append(" Annee  : ").append(annee);
        sb.append(" Nombre d'épisode : ").append(nbEpisode);
        sb.append("\n ").append(realisateur);
        sb.append("\n ").append(acteurs);
        sb.append('\n');
        return sb.toString();
    }
}
