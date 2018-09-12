package core.beans;

import java.util.List;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 11.09.2018
 **/
public class Shop {

    private final List<User> users;

    public Shop(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }
}
