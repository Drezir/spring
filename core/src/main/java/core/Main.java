package core;

import core.beans.*;
import core.conversion.Smartphone;
import core.spel.SpelExpressions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 11.09.2018
 **/
public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // AnnotationConfigApplicationContext for annotation only (without xml definitions)
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-app.xml");
        applicationContext.getEnvironment().acceptsProfiles("dev");

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

        ResourceBean resourceBean = (ResourceBean)applicationContext.getBean("resourceBean");
        LOGGER.info(resourceBean.getResource().getDescription());
        try (BufferedReader br = new BufferedReader(new FileReader(resourceBean.getResource().getFile()))) {
            String line;
            StringBuilder stringBuilder = new StringBuilder("\n");
            while((line = br.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            LOGGER.info(stringBuilder.toString());
        } catch (FileNotFoundException e) {
            LOGGER.error("File not found", e);
        } catch (IOException e) {
            LOGGER.error("Error opening file", e);
        }

        // conversion
        Smartphone smartphone = (Smartphone)applicationContext.getBean("smartphone");
        LOGGER.info(String.valueOf(smartphone.getAndroid()));

        SpelExpressions spelExpressions = (SpelExpressions)applicationContext.getBean(SpelExpressions.class);
        spelExpressions.init();
    }

}
