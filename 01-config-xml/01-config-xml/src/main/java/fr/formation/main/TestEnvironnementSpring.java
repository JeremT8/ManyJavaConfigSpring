package fr.formation.main;

import fr.formation.model.Piano;
import fr.formation.model.Violon;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEnvironnementSpring {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Piano p1 = (Piano) ac.getBean("piano1");
        p1.afficher();


        Piano p2 = ac.getBean("piano2", Piano.class);
        p2.afficher();


        System.out.println("Au revoir");

    }
}
