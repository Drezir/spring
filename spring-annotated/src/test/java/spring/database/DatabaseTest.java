package spring.database;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@Import(MyConfiguration.class)
@ContextConfiguration("classpath:application-datasource-context.xml")
public class DatabaseTest {

    @Autowired
    private MyRepository myRepository;

    @Test
    @Ignore
    public void testInsert() {
        myRepository.insertPerson(new Person(1, "Adam", "Ostrožlík"));
    }

    @Test
    public void testGetPerson() {
        System.out.println(myRepository.findUserById(1));
    }
}
