package fr.formation.main;

import fr.formation.conf.ApplicationConfiguration;
import fr.formation.dal.PersonneDao;
import fr.formation.entity.Adresse;
import fr.formation.entity.Personne;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.List;

public class AppelSpringOrm {

    public static void main(String[] args) {
        ApplicationContext ac =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);


        PersonneDao pDao = ac.getBean(PersonneDao.class);
        Adresse a1 = new Adresse("86000", "Poitiers");
        Personne p1 = new Personne("Tillet", "Jérémy", a1);
        Personne p2 = new Personne("Bastard", "Marie", new Adresse("86800", "Pouillé"));

        pDao.add(p1);
        pDao.add(p2);

        List<Personne> listeP = pDao.findAll();
        System.out.println("Liste des personne en base : ");
        listeP.forEach(p -> System.out.println(p));
        ;

    }
}
