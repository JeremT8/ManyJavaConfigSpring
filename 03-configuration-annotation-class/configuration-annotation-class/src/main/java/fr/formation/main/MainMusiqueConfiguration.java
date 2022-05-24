package fr.formation.main;

import fr.formation.config.MusiqueConfiguration;
import fr.formation.model.Musicien;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainMusiqueConfiguration
{
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(MusiqueConfiguration.class);

        Musicien m = ac.getBean(Musicien.class);
        m.jouerMorceau();
    }
}
