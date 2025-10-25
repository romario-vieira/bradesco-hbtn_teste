package mei.src;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PersonTest {
    static Person person;

    @BeforeAll
    public static void setUp() {
        person = new Person("Paul", "McCartney", new Date(2000), true, false, true);
    }

    @Test
    public void show_full_name() {
        Assertions.assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    public void test_calculateYearlySalary() {
        person.setSalary(1200);
        Assertions.assertEquals(14400, person.calculateYearlySalary());
    }

    @Test
    public void person_is_MEI() {
        person = new Person("Pedro", "José", new Date(2000), false, false, false);
        Assertions.assertTrue(person.isMEI());
    }

    @Test
    public void person_is_not_MEI() {
        person = new Person("Ana", "Maria", new Date(2000), true, false, false);
        Assertions.assertFalse(person.isMEI());
    }

}