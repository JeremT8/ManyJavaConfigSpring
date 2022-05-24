package fr.formation.service;

import fr.formation.model.Musicien;
import fr.formation.repository.MusicienDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicienServicePasRegardant implements MusicienService {

    @Autowired
    private MusicienDAO mDao;

    public MusicienServicePasRegardant() {
        System.out.println("Constructeur de MusicienServicePasRegardant");
    }


    @Override
    public Musicien trouverMusicien(int id) {
        return mDao.findById(id);
    }
}
