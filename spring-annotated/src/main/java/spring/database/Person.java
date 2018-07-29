package spring.database;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// lombok
@Getter
@Setter
@ToString
@AllArgsConstructor
// orm
@Entity
@Table(name = "persons")
public class Person {

    public static final Person DEFAULT = new Person();

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;

    private Person() {
        id = Integer.MIN_VALUE;
        name = surname = "Unknown";
    }
}
