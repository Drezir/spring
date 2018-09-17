package core.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 17.09.2018
 **/
public class Person {

    private final String name, surname;
    private final int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public static class PersonValidator implements Validator {

        @Override
        public boolean supports(Class<?> aClass) {
            return Person.class.equals(aClass);
        }

        @Override
        public void validate(Object o, Errors errors) {
            ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
            Person person = (Person)o;
            if (person.age < 0) {
                errors.rejectValue("age", "negative value");
            } else if (person.age > 110) {
                errors.rejectValue("age", "too old");
            }
        }
    }
}
