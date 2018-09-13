package core.profiles;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 13.09.2018
 **/
@Configuration
@Profile("test")
public class TestObject {

    private String message;

    public String getMessage() {
        return message;
    }

    @Required
    public void setMessage(String message) {
        this.message = message;
    }
}
