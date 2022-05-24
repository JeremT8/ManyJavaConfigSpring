package fr.formation.config;

import fr.formation.model.Instrument;
import fr.formation.model.Piano;
import fr.formation.model.Violon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InstrumentConfiguration {

    @Bean
    public Instrument getInstrument() {
        return new Piano();
    }



}
