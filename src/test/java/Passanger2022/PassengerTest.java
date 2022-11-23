package Passanger2022;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    Passenger myPassenger;

    @BeforeEach
    void setUp() {
        myPassenger = new Passenger("Mr", "Zachary", "G00389668J", "089222333", 23);
    }

    @Test
    void testTitleMr(){
        assertEquals("Mr", myPassenger.getTitle());
        myPassenger.setTitle("Mrs");
        assertEquals("Mrs", myPassenger.getTitle());
        myPassenger.setTitle("Ms");
        assertEquals("Ms", myPassenger.getTitle());
    }
    @Test
    void testName(){assertEquals("Zachary", myPassenger.getName());}
    @Test
    void testID(){assertEquals("G00389668J", myPassenger.getID());}
    @Test
    void testPhone(){assertEquals("089222333", myPassenger.getPhone());}
    @Test
    void testAge(){assertEquals(23, myPassenger.getAge());}


    @Test
    void testTitleFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myPassenger.setTitle("xyz");});
        assertEquals("Incorrect Title. Please enter 'Mr', 'Mrs', or 'Ms'.", exMessage.getMessage());
    }
    @Test
    void testNameFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myPassenger.setName("Ti");});
        assertEquals("Incorrect Entry, Name must contain at least 3 characters", exMessage.getMessage());
    }
    @Test
    void testIDFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myPassenger.setID("J00324");});
        assertEquals("Incorrect Entry, ID must contain at least 10 characters", exMessage.getMessage());
    }
    @Test
    void testPhoneFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myPassenger.setPhone("12345");});
        assertEquals("Incorrect Entry, Phone No. must contain at least 7 digits", exMessage.getMessage());
    }
    @Test
    void testAgeFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myPassenger.setAge(12);});
        assertEquals("Passenger is too young to fly", exMessage.getMessage());

    }
}