package fr.formation.repository;

import fr.formation.model.Musicien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MusicienDAOBdd implements MusicienDAO{

    @Autowired
    private Musicien m;



    public MusicienDAOBdd() {
        System.out.println("Constructeur de MusicienDAOBdd");
    }

    @Override
    public Musicien findById(int id) {
        return m;
    }
}
