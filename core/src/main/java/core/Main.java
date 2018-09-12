package core;

import core.beans.LifecycleBean;
import core.beans.Shop;
import core.beans.Singleton;
import core.beans.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 11.09.2018
 **/
public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

        User user = (User)applicationContext.getBean("userAlias");
        LOGGER.info(user.toString());

        Shop shop = (Shop)applicationContext.getBean("shop1");
        shop.getUsers().forEach(usr -> LOGGER.info(usr.toString()));

        ((Singleton)applicationContext.getBean("singleton1")).sayHello();

        User user3 = applicationContext.getBean(User.class);
        LOGGER.info("Invalid user has id[{}]", user3.getId());

        LifecycleBean lifecycleBean = (LifecycleBean)applicationContext.getBean("lifecycle");

        User unknown = (User)applicationContext.getBean("Unknown");
        LOGGER.info(unknown.toString());
    }

}
