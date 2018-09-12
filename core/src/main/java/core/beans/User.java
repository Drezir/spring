package core.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.support.MethodReplacer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.lang.reflect.Method;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 11.09.2018
 **/
public class User {

    private static final Logger LOGGER = LoggerFactory.getLogger(User.class);

    private final int id;
    private String username;
    private String password;

    public User(int id) {
        this.id = id;
    }

    @PostConstruct // or use init-method
    public void init() {
        LOGGER.info("User {} has been created", username);
    }
    @PreDestroy // or use destroy-method
    public void destroy() {
        LOGGER.info("User {} has been destroyed", username);
    }

    public static User createInstance() {
        return new User(2);
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return username;
    }

    public static class UserMethodReplacer implements MethodReplacer {

        @Override
        public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
            return -1;
        }
    }
}
