package Passanger2022;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    Passenger myPassenger;

    @BeforeEach
    void setUp() {
        myPassenger = new Passenger(null, null, null, null, 0);
    }

    @Test
    void testTitleMr(){
        myPassenger.setTitle("Mr");
        assertEquals("Mr", myPassenger.getTitle());

    }

   @Test
    void testTitleMrs(){
        myPassenger.setTitle("Mrs");
        assertEquals("Mrs", myPassenger.getTitle());
    }

    @Test
    void testTitleMs(){
        myPassenger.setTitle("Ms");
        assertEquals("Ms", myPassenger.getTitle());
    }

    @Test
    void testTitleFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myPassenger.setTitle("xyz");});
        assertEquals("Incorrect Title. Please enter 'Mr', 'Mrs', or 'Ms'.", exMessage.getMessage());
    }

    @Test
    void testName(){
        myPassenger.setName("Zachary");
        assertEquals("Zachary", myPassenger.getName());
    }

    @Test
    void testNameFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myPassenger.setName("Ti");});
        assertEquals("Incorrect Entry, Name must contain at least 3 characters", exMessage.getMessage());
    }

    @Test
    void testID(){
        myPassenger.setID("G00389668J");
        assertEquals("G00389668J", myPassenger.getID());
    }

    @Test
    void testIDFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myPassenger.setID("J00324");});
        assertEquals("Incorrect Entry, ID must contain at least 10 characters", exMessage.getMessage());
    }

    @Test
    void testPhone(){
        myPassenger.setPhone("089222333");
        assertEquals("089222333", myPassenger.getPhone());
    }

    @Test
    void testPhoneFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myPassenger.setPhone("12345");});
        assertEquals("Incorrect Entry, Phone No. must contain at least 7 digits", exMessage.getMessage());
    }

    @Test
    void testAge(){
        myPassenger.setAge(23);
        assertEquals(23, myPassenger.getAge());
    }

    @Test
    void testAgeFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myPassenger.setAge(12);});
        assertEquals("Passenger is too young to fly", exMessage.getMessage());

    }

    @AfterEach
    void tearDown() {
    }
}