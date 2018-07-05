package beans.runtime;

import beans.api.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Performer performer = (Performer)context.getBean("duke");
        performer.perform();
    }

}
