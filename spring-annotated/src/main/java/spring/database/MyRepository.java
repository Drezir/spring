package spring.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertPerson(Person person) {
        jdbcTemplate.update(
                "insert into dev(name,surname) values(?,?)",
                person.getName(), person.getSurename()
        );
    }
}
