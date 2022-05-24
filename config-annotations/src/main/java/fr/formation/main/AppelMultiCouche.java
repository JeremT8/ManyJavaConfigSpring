package fr.formation.main;

import fr.formation.controller.MusicienController;
import fr.formation.model.Musicien;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class AppelMultiCouche {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        MusicienController mc = ac.getBean(MusicienController.class);
        Musicien trouve = mc.appelRecupMusicien();
        trouve.jouerMorceau();
    }




}
