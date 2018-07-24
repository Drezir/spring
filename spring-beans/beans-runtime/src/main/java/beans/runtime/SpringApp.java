package beans.runtime;

import beans.api.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

    public static void main(String[] args) {
        /*
        ApplicationContext annotatedContext =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        annotatedContext.getBean(Performer.class).perform();
        */

        ApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");
        Performer performer = (Performer)context.getBean("duke");
        performer.perform();
        /*
        performer.perform();
        poeticPerformer.perform();
        kenny2.perform();
        */

    }

}
