import core.profiles.TestObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 13.09.2018
 **/
public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-app.xml");
        applicationContext.getEnvironment().setActiveProfiles("dev"); // dev or prod
        applicationContext.refresh();
        LOGGER.info(applicationContext.getBean("AnnotatedBean").toString());
        LOGGER.info(((TestObject)applicationContext.getBean("TestObject")).getMessage());
    }

}
