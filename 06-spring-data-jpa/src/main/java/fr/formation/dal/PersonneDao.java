package fr.formation.dal;

import fr.formation.entity.Personne;

import java.util.List;

public interface PersonneDao {

    void add(Personne p);
    void delete(Personne p);
    void update(Personne p);

    List<Personne> findAll();
    Personne findById(int id);
}
