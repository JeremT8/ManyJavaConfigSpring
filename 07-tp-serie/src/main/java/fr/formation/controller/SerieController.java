package fr.formation.controller;

import fr.formation.model.Serie;

import java.util.List;

public interface SerieController {

    Serie ajoutSerie(Serie s);


    Serie appelRecupSerie(int id);

    List<Serie> trouveTout();


    List<Serie> titreSerieParAsc();

    List<Serie> titreSerieParDesc();

    Serie chercheParTitre(String titre);

    List<Serie> chercheParRealisateur(String nom);

    List<Serie> chercheParActeur(String nom);

}
