package fr.formation.service;

import fr.formation.model.Serie;
import fr.formation.repository.SerieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SerieServiceImpl implements SerieService{

    @Autowired
    private SerieDao sDao;

    @Override
    public Serie ajouterSerie(Serie s) {
        return sDao.save(s);
    }

    @Override
    public List<Serie> trouveTout() {
        List<Serie> listeS = new ArrayList<>();
        listeS = sDao.findAll();
        return listeS;
    }

    @Override
    public Serie trouverSerie(int id) {
        id = 1;
        return sDao.findOne(id);
    }

    @Override
    public List<Serie> listerLesSeriesAsc() {
        return sDao.findByOrderByTitreAsc();
    }

    @Override
    public List<Serie> listerLesSeriesDesc() {
        return sDao.findByOrderByTitreDesc();
    }

    @Override
    public Serie chercheSerieParTitre(String titre) {
        return sDao.findByTitre(titre);
    }

    @Override
    public List<Serie> chercherSerieParRealisateur(String nom) {
        return sDao.findDistinctBySaisonsRealisateurLastName(nom);
    }

    @Override
    public List<Serie> chercherSerieParActeur(String nom) {
        return sDao.findDistinctBySaisonsActeursLastName(nom);
    }


}
