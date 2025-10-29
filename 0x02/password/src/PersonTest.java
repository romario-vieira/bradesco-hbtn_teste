import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;



public class PersonTest {
    
    private static Person person;

    @BeforeAll
    public void setUp() {
        person = new Person();
        assertNotNull(person);
    }

    @ParameterizedTest
    @ValueSource(strings = {"PaulMcCartney2", "NeilArms2"})
    public void check_user_valid(String valor) {
        boolean result = person.checkUser(valor);
        assert(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Paul#McCartney", "Neil@Arms"})
    public void check_user_not_valid(String valor) {
        boolean result = person.checkUser(valor);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"123456789", "#$%1234"})
    public void does_not_have_letters(String valor) {
        boolean result = person.checkPassword(valor);
        assert(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Abcabcdefgh@", "#hbtn@%tc"})
    public void does_not_have_numbers(String valor) {
        boolean result = person.checkPassword(valor);
        assert(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Abc@123", "12$@hbt"})
    public void does_not_have_eight_chars(String valor) {
        boolean result = person.checkPassword(valor);
        assert(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abC123456$", "Hbtn@1234", "Betty@1#2", "Hbtn@123"})
    public void check_password_valid(String valor) {
        boolean result = person.checkPassword(valor);
        assert(result);
    }
}
