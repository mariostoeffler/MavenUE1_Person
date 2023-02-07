import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person = new Person();

    @BeforeEach
    void setUp() {
        person.setName("Manfred");
        person.setGeschlecht("männlich");
        person.setAlter(34);

    }

    @org.junit.jupiter.api.Test
    void alterErhoehen() {
        int excpected = 35;
        person.alterErhoehen();
        assertEquals(excpected, person.getAlter());
    }


    @Test
    void setName() {
        String expected = "Manfred";
        assertEquals(expected, person.getName());
    }
}