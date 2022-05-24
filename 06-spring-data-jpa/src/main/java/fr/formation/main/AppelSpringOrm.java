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
        Adresse a1 = new Adresse("86800", "Pouillé");
        Personne p1 = new Personne("Tillet", "Jérémy", a1);
        Personne p2 = new Personne("Tillet", "Marie", new Adresse("86290", "Bellefonds"));
        Personne p3 = new Personne("Sacco", "Thibault", new Adresse("86350", "La chapelle Viviers"));
        Personne p4 = new Personne("Dupuis", "Romain", new Adresse("56000", "Vannes"));
        Personne p5 = new Personne("Pataf", "Maxime", new Adresse("56000", "Vannes"));
        Personne p6 = new Personne("Dmt", "Guillaume", new Adresse("86100", "Châtellerault"));

        pDao.save(p1);
        pDao.save(p2);
        pDao.save(p3);
        pDao.save(p4);
        pDao.save(p5);
        pDao.save(p6);

        List<Personne> listeP = pDao.findAll();
        System.out.println("Liste des personne en base : ");
        listeP.forEach(System.out::println);


        p2.getAdresse().setCodePostal("56000");
        p2.getAdresse().setVille("Vannes");

        pDao.save(p2);

        listeP = pDao.findAll();
        System.out.println("\nListe des personne en base après modif : ");
        listeP.forEach(System.out::println);


        System.out.println("\nPersonne dont l'id est 1 : " + pDao.findOne(1));
        System.out.println("\nPersonne dont l'id est 111 : " + pDao.findOne(111));


        listeP = pDao.findByNom("Tillet");
        System.out.println("\nListe des Tillet : ");
        listeP.forEach(System.out::println);



        listeP = pDao.findByNomEndingWith("t");
        System.out.println("\nListe des personne dont le nom finis par 't' : ");
        listeP.forEach(System.out::println);


        listeP = pDao.findByAdresseCodePostalStartingWith("56");
        System.out.println("\nListe des personne dont le code postale commence par 56 : ");
        listeP.forEach(System.out::println);


        listeP = pDao.findByOrderByNomAscPrenomAsc();
        System.out.println("\nListe des personnes avec nom et prenom dans l'ordre croissant : ");
        listeP.forEach(System.out::println);


        listeP = pDao.findByOrderByNomDescPrenomDesc();
        System.out.println("\nListe des personnes avec nom et prenom dans l'ordre décroissant : ");
        listeP.forEach(System.out::println);

        listeP = pDao.trouverTousTriPasCP();
        System.out.println("\nListe des personnes trier par code postal : ");
        listeP.forEach(System.out::println);


        listeP = pDao.trouverTous();
        System.out.println("\nListe des personnes natif SQL : ");
        listeP.forEach(System.out::println);





    }
}
