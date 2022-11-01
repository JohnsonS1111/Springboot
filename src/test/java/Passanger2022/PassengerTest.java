package Passanger2022;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    @AfterEach
    void tearDown() {
    }
}