package ie.gmit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentsTest {
    @Test
    void testConstructor()
    {
        Students myStudents = new Students("Cathal", "cathal.walsh@gmit.ie");
        assertEquals("Cathal", myStudents.getName());
    }

    @Test
    void testConstructorNoName()
    {
        //Students myStudents = new Students("", "cathal.walsh@gmit.ie");
        assertThrows(IllegalArgumentException.class, ()->  new Students("", "cathal.walsh@gmit.ie"));
    }

    @Test
    void testConstructorNoEmail()
    {
        //Students myStudents = new Students("Cathal", "");
        assertThrows(IllegalArgumentException.class, ()->  new Students("Cathal", ""));
    }

}
