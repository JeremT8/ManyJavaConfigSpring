package fr.formation.main;

import fr.formation.model.Musicien;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Musicien mus = ac.getBean(Musicien.class);
        System.out.println(mus);
        mus.jouerMorceau();
    }


}
