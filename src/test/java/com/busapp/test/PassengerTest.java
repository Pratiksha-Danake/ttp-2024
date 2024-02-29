package com.busapp.test;

import com.busapp.Passenger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    @Test
    void shouldCreateClassWithNameIdAndFare() {
        Passenger passenger = new Passenger( 1, "Sanket",10);
        assertEquals("Sanket", passenger.getName());
        assertEquals(1, passenger.getPassengerId());
    }

    //TO-DO
    @Test
    void shouldThrowExceptionForInvalidInputs() {

    }
}
