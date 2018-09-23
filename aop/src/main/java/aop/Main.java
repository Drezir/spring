package aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 23.09.2018
 **/
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:application-config.xml");
        SomeClass someClass = applicationContext.getBean(SomeClass.class);
        someClass.invokeCall(1);
    }
}
