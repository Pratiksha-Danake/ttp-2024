package com.busapp.test;

import com.busapp.Bus;
import com.busapp.Passenger;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusTest {
//    int busCapacity
//    int vaccancies
//    int totalPaidFares
//    List<com.busapp.Passenger> passengerList

//1.  should get initialized with a capacity
//2.  bus should starts out with vacancies equal to the capacity.
//3.  allows you to board a passenger(id and name) with the seat number.
//4.  allows you to see full names of passenger names/ids (in the order they were added).
//5.  allows you to get the total of all paid fares.
    Bus bus;
    List<Passenger> passengerList = new ArrayList<>();
    @Test
    void isInitializedWithTheCapacity(){

        bus = new Bus(20,20);
        assertEquals(20,bus.getCapacity());
    }

    @Test
    void shouldStartsOutWithVacanciesEqualToTheCapacity(){
        bus = new Bus(20,20);
        assertEquals(bus.getCapacity(),bus.getVaccancies());
    }

    @Test
    void shouldAllowsYouToonboardPassengerWithIdNameAndTheSeatNumber() {
        bus = new Bus(20,20);
        bus.onboardPassenger(1, "Alice", 1, 10.0);
        assertEquals(1,bus.getPassengers().size());
    }

    @Test
    void shouldDisplayFullNameOfPassengerWithIdInTheOrderTheyWereAdded(){
        bus = new Bus(20,20);
        List<String> names = new ArrayList<>();
        String arrName[] = {"Alice","Bob","Charlie","David"};
        names.addAll(Arrays.asList(arrName));

        bus.onboardPassenger(1, "Alice", 1, 10.0);
        bus.onboardPassenger(2, "Bob", 2, 15.0);
        bus.onboardPassenger(3, "Charlie", 3, 12.0);
        bus.onboardPassenger(4, "David", 4, 8.0);

        assertEquals(names,bus.displayNamesOfPassengers());
    }

    @Test
    void shouldAllowsYouToGetTheTotalOfAllPaidFares(){
        bus = new Bus(20,20);
        bus.onboardPassenger(1, "Alice", 1, 10.0);
        bus.onboardPassenger(2, "Bob", 2, 15.0);
        bus.onboardPassenger(3, "Charlie", 3, 12.0);
        bus.onboardPassenger(4, "David", 4, 8.0);
        assertEquals(45.0,bus.getTotalOfAllpaidFares());
    }

    @Test
    void shouldAllowToCheckVaccantSeats(){
        bus = new Bus(20,20);
        bus.onboardPassenger(1, "Alice", 1, 10.0);
        bus.onboardPassenger(2, "Bob", 2, 15.0);
        bus.onboardPassenger(3, "Charlie", 3, 12.0);
        bus.onboardPassenger(4, "David", 4, 8.0);
        assertEquals(16,bus.getVaccancies());
    }
}
