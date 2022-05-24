package fr.formation.config;

import fr.formation.model.Instrument;
import fr.formation.model.Musicien;
import fr.formation.model.Piano;
import fr.formation.model.Violon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MusiqueConfiguration {

    @Bean
    public Instrument getInstrument() {
        return new Violon();
    }

    @Bean
    public Musicien getMusicien() {
        return new Musicien();
    }

}
