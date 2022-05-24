package fr.formation.dal;

import fr.formation.entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonneDao extends JpaRepository<Personne, Integer> {

    List<Personne> findByNom(String nom);

    List<Personne> findByNomEndingWith(String nom);

    List<Personne> findByAdresseCodePostalStartingWith(String dep);

    List<Personne> findByOrderByNomAscPrenomAsc();

    List<Personne> findByOrderByNomDescPrenomDesc();


    @Query("SELECT Object(p) FROM Personne p Order By p.adresse.codePostal")
    List<Personne> trouverTousTriPasCP();


    @Query(value = "SELECT * FROM Personne", nativeQuery = true)
    List<Personne> trouverTous();

}
