package fr.formation.controller;

import fr.formation.model.Musicien;
import fr.formation.service.MusicienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MusicienControllerWebServiceRest implements MusicienController{

    private MusicienService ms;

    @Autowired
    public MusicienControllerWebServiceRest(MusicienService ms) {
        this.ms = ms;
        System.out.println("Constructeur de MusicienControllerWebServiceRest avec Params");
    }

    @Override
    public Musicien appelRecupMusicien() {
        int id = 1;
        return ms.trouverMusicien(id);
    }
}
