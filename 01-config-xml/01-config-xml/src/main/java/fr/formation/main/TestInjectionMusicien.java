package fr.formation.main;

import fr.formation.model.Musicien;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjectionMusicien {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContextMusicien.xml");

        Musicien m1 = ac.getBean(Musicien.class);
        m1.jouerMorceau();

        

        System.out.println("Au revoir");

    }
}
