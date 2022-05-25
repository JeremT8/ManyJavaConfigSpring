package fr.formation.service;

import fr.formation.model.Serie;
import fr.formation.repository.SerieDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface SerieService {


    Serie ajouterSerie(Serie s);

    List<Serie> trouveTout();

    Serie trouverSerie(int id);

    List<Serie> listerLesSeriesAsc();

    List<Serie> listerLesSeriesDesc();

    Serie chercheSerieParTitre(String titre);

    List<Serie> chercherSerieParRealisateur(String nom);


    List<Serie> chercherSerieParActeur(String nom);
}
