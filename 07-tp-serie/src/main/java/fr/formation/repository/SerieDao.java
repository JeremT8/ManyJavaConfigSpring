package fr.formation.repository;

import fr.formation.model.Saison;
import fr.formation.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SerieDao extends JpaRepository<Serie, Integer> {


    Serie findByTitre(String titre);

    List<Serie> findByOrderByTitreAsc();

    List<Serie> findByOrderByTitreDesc();

    List<Serie> findDistinctBySaisonsRealisateurLastName(String nom);

    List<Serie> findDistinctBySaisonsActeursLastName(String nom);





}
