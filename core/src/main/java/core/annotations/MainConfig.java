package core.annotations;

import core.beans.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 12.09.2018
 **/
@Configuration
public class MainConfig {

    @Bean("Unknown")
    public static User getUnknownUser() {
        User user = new User(-1);;
        user.setUsername("Unknown");
        return user;
    }
}
