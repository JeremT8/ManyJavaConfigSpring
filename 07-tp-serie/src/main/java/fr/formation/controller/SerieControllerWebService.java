package fr.formation.controller;


import fr.formation.model.Serie;
import fr.formation.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class SerieControllerWebService implements SerieController {

    private SerieService ss;

    @Autowired
    public SerieControllerWebService(SerieService ss) {
        this.ss = ss;
        System.out.println("Constructeur de SerieControllerWebService");
    }


    @Override
    public Serie ajoutSerie(Serie s) {
        return ss.ajouterSerie(s);
    }

    @Override
    public Serie appelRecupSerie(int id) {
        id = 1;
        return ss.trouverSerie(id);
    }

    @Override
    public List<Serie> trouveTout() {
        return ss.trouveTout();
    }

    @Override
    public List<Serie> titreSerieParAsc() {
        return ss.listerLesSeriesAsc();
    }

    @Override
    public List<Serie> titreSerieParDesc() {
        return ss.listerLesSeriesDesc();
    }

    @Override
    public Serie chercheParTitre(String titre) {
        return ss.chercheSerieParTitre(titre);
    }

    @Override
    public List<Serie> chercheParRealisateur(String nom) {
        return ss.chercherSerieParRealisateur(nom);
    }

    @Override
    public List<Serie> chercheParActeur(String nom) {
        return ss.chercherSerieParActeur(nom);
    }


}
