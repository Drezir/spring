package configuration;

import beans.api.Performer;
import beans.api.Poem;
import beans.xml.Sonet29;
import beans.xml.instruments.Instrumentalist;
import beans.xml.jugglers.Juggler;
import beans.xml.jugglers.PoeticJuggler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
    @Bean(name = "duke")
    public Performer duke() {
        return new Juggler(15);
    }

    @Bean
    public Performer kenny() {
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Jingle Bells");
        return kenny;
    }

    @Bean
    public Performer poeticDuke() {
        /*  sonet29() does not create new instance but instead of that
            it searches the SpringContext for the existing bean
        */
        return new PoeticJuggler(15, sonet29());
    }
    @Bean
    private Poem sonet29() {
        return new Sonet29();
    }
}
