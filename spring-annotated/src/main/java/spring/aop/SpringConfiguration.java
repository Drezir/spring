package spring.aop;

import spring.model.api.Performer;
import spring.model.impl.Juggler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
    @Bean(name = "duke")
    public Performer duke() {
        return new Juggler();
    }
}
