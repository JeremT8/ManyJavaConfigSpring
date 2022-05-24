package fr.formation.main;

import fr.formation.model.Musicien;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjectionMusicienScopPrototype {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext-Musicien-ScopePrototype.xml");

        Musicien m1 = ac.getBean(Musicien.class);
        System.out.println("\n m1 joue pour la premiere fois");
        m1.jouerMorceau();


        m1.setMorceau("La macarena");
        System.out.println("\n m1 joue pour la seconde fois (changement de morceau)");
        m1.jouerMorceau();

        Musicien m2 = ac.getBean(Musicien.class);
        System.out.println("\n m2 joue pour la premiere fois");
        m2.jouerMorceau();
        

        System.out.println("Au revoir");

    }
}
