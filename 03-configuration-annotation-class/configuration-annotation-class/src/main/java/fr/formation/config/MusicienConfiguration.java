package fr.formation.config;

import fr.formation.model.Musicien;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(InstrumentConfiguration.class)
public class MusicienConfiguration {


    @Bean
    public Musicien getMusicien() {
        return new Musicien();
    }

}
