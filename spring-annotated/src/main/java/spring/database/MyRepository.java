package spring.database;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Repository
// hibernate
@EnableTransactionManagement
@Transactional
public class MyRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired //hibernate
    private SessionFactory sessionFactory;

    public void insertPerson(Person person) {
        jdbcTemplate.update(
                "insert into persons(name,surname) values(?,?)",
                person.getName(), person.getSurname()
        );
    }

    public Person findUserById(int id) {
        return sessionFactory.getCurrentSession().get(Person.class, id);
    }
}
