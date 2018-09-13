package core.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 13.09.2018
 **/
@Configuration
@Profile("prod")
public class ProdConfig {

    @Bean("AnnotatedBean")
    public Object getMessage() {
        return "Hello annotated prod";
    }

}
