package fr.formation.main;

import fr.formation.config.MusicienConfiguration;
import fr.formation.config.MusiqueConfiguration;
import fr.formation.model.Musicien;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainPlusieursFichiersConfiguration
{
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(MusicienConfiguration.class);

        Musicien m = ac.getBean(Musicien.class);
        m.jouerMorceau();
    }
}
