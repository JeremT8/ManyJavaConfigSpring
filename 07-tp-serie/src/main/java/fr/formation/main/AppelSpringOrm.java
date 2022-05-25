package fr.formation.main;

import fr.formation.configuration.ApplicationConfiguration;
import fr.formation.controller.SerieController;
import fr.formation.controller.SerieControllerWebService;
import fr.formation.model.Acteur;
import fr.formation.model.Realisateur;
import fr.formation.model.Saison;
import fr.formation.model.Serie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AppelSpringOrm {

    public static void main(String[] args) {
        ApplicationContext ac =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);





        /**
         * Création des Realisateurs !
         */
        Realisateur r1 = new Realisateur("Steven", "Spielberg");
        Realisateur r2 = new Realisateur("David", "Lynch");
        Realisateur r3 = new Realisateur("David", "Fincher");
        Realisateur r4 = new Realisateur("Ridley", "Scott");
        Realisateur r5 = new Realisateur("Alan", "Taylor");



        /**
         * Création des Acteurs !
         */
        Acteur a1 = new Acteur("Tom", "Ellis", "Lucifer");
        Acteur a2 = new Acteur("Bryan", "Cranston", "Walter White");
        Acteur a3 = new Acteur("Matthew", "Perry", "Chandler");
        Acteur a4 = new Acteur("Kit", "Harington", "Jon Snow");
        Acteur a5 = new Acteur("Kit", "Harington", "Jon Snow");
        List<Acteur> listeActeur1 = List.of(a4);
        List<Acteur> listeActeur2 = List.of(a2);
        List<Acteur> listeActeur3 = List.of(a3);
        List<Acteur> listeActeur4 = List.of(a1);
        List<Acteur> listeActeur5 = List.of(a5);




        /**
         * Creation saisons
         */
        Saison ss1 = new Saison(1, 2011, 10, r5, listeActeur1);
        Saison ss2 = new Saison(2, 2012, 5, r3, listeActeur2);
        Saison ss3 = new Saison(3, 2013, 8, r2, listeActeur3);
        Saison ss4 = new Saison(4, 2014, 19, r1, listeActeur4);
        Saison ss5 = new Saison(1, 2019, 19, r4, listeActeur5);
        List<Saison> listeSs1 = List.of(ss1, ss2);
        List<Saison> listeSs2 = List.of(ss3, ss4);
        List<Saison> listeSs3 = List.of(ss5);



        /**
         * Création d'une serie
         */
        SerieControllerWebService sc = ac.getBean(SerieControllerWebService.class);

        Serie s1 = new Serie("Game Of Thrones", listeSs1);
        Serie s2 = new Serie("American Dad", listeSs2);
        Serie s3 = new Serie("Futurama", listeSs3);

        sc.ajoutSerie(s1);
        sc.ajoutSerie(s2);
        sc.ajoutSerie(s3);



        List<Serie> listeS = sc.trouveTout();

        // Triés par ordre alphabétique croissant du titre de la serie
        System.out.println("Triés par ordre alphabétique croissant du titre");
        listeS = sc.titreSerieParAsc();
        listeS.forEach(System.out::println);

        // Triés par ordre alphabétique décroissant du titre de la serie
        System.out.println("Triés par ordre alphabétique décroissant du titre");
        listeS = sc.titreSerieParDesc();
        listeS.forEach(System.out::println);


        // Triés par ordre chronologique depuis la premiere saison
//        System.out.println();

        // Triés par ordre chronologique depuis la derniere saison
//        System.out.println();

        // Triés par nombre total d'épisodes croissant
//        System.out.println();

        // Triés par nombre total d'épisodes décroissant
//        System.out.println();

        // Triés selon un réalisateur
        System.out.println("Triés par realisateur");
        listeS = sc.chercheParRealisateur("Lynch");
        listeS.forEach(System.out::println);
//        // Triés selon un acteur
        System.out.println("Triés par acteurs");
        listeS = sc.chercheParActeur("Harington");
        listeS.forEach(System.out::println);
        // Recherché selon un titre
            Serie serie =  sc.chercheParTitre("Game Of Thrones");
           System.out.println("\nSerie avec le titre 'Game Of Thrones' : " + serie);


//
//
//        List<Personne> listeP = pDao.findAll();
//        System.out.println("Liste des personne en base : ");
//        listeP.forEach(System.out::println);
//
//
//        p2.getAdresse().setCodePostal("56000");
//        p2.getAdresse().setVille("Vannes");
//
//        pDao.save(p2);
//
//        listeP = pDao.findAll();
//        System.out.println("\nListe des personne en base après modif : ");
//        listeP.forEach(System.out::println);
//
//
//        System.out.println("\nPersonne dont l'id est 1 : " + pDao.findOne(1));
//        System.out.println("\nPersonne dont l'id est 111 : " + pDao.findOne(111));
//
//
//        listeP = pDao.findByNom("Tillet");
//        System.out.println("\nListe des Tillet : ");
//        listeP.forEach(System.out::println);
//
//
//
//        listeP = pDao.findByNomEndingWith("t");
//        System.out.println("\nListe des personne dont le nom finis par 't' : ");
//        listeP.forEach(System.out::println);
//
//
//        listeP = pDao.findByAdresseCodePostalStartingWith("56");
//        System.out.println("\nListe des personne dont le code postale commence par 56 : ");
//        listeP.forEach(System.out::println);
//
//
//        listeP = pDao.findByOrderByNomAscPrenomAsc();
//        System.out.println("\nListe des personnes avec nom et prenom dans l'ordre croissant : ");
//        listeP.forEach(System.out::println);
//
//
//        listeP = pDao.findByOrderByNomDescPrenomDesc();
//        System.out.println("\nListe des personnes avec nom et prenom dans l'ordre décroissant : ");
//        listeP.forEach(System.out::println);
//
//        listeP = pDao.trouverTousTriPasCP();
//        System.out.println("\nListe des personnes trier par code postal : ");
//        listeP.forEach(System.out::println);
//
//
//        listeP = pDao.trouverTous();
//        System.out.println("\nListe des personnes natif SQL : ");
//        listeP.forEach(System.out::println);
//




    }
}
