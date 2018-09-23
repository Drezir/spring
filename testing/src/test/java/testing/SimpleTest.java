package testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 23.09.2018
 **/
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:application-context.xml")
@ActiveProfiles("default")
public class SimpleTest {

    @Autowired
    private SimpleObject simpleObject;

    @Test
    public void testSomeObjectInit() {
        System.out.println(simpleObject.getDesc());
    }

}
