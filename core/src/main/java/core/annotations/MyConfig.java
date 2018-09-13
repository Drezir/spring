package core.annotations;

import core.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Profile;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 12.09.2018
 **/
@Configuration
public class MyConfig {

    @Bean(value="Unknown")
    @Description("Bean for unknown user in dev")
    public User getUnknownUser() {
        User user = new User(-1);;
        user.setUsername("Dev invalid");
        return user;
    }
}
