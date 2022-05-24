package fr.formation.config;

import fr.formation.model.Musicien;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("ApplicationContext.xml")
public class MusicienAvecXmlConfiguration {


    @Bean
    public Musicien getMusicien() {
        return new Musicien();
    }

}
