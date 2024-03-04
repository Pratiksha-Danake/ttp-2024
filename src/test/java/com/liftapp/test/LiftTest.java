package com.liftapp.test;

import com.liftapp.InvalidFloorException;
import com.liftapp.Lift;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LiftTest {
    @Test
    void shouldCreateInstanceOfLift(){
        Lift lift = new Lift();
        assertTrue(lift instanceof Lift);
    }

    @Test
    void shouldReturnCurrentFloor(){
        Lift lift = new Lift();
        assertEquals(0,lift.getCurrentFloor());
    }

    @Test
    void shouldCallLiftOnDesiredFloor() throws InvalidFloorException {
        Lift lift = new Lift();
        lift.moveToFloor(1,4,Lift.Direction.NONE);
        assertEquals(4,lift.getCurrentFloor());
    }

    @Test
    void shouldCallLiftOnDesiredFloorWithUpDirection() throws InvalidFloorException {
        Lift lift = new Lift();
        lift.moveToFloor(3,5,Lift.Direction.UP);
        assertEquals(5,lift.getCurrentFloor());
        assertThrows(InvalidFloorException.class,()->{
            lift.moveToFloor(4,3, Lift.Direction.UP);
        });
    }

    @Test
    void shouldCallLiftOnDesiredFloorWithDownDirection() throws InvalidFloorException {
        Lift lift = new Lift();
        lift.moveToFloor(3,1,Lift.Direction.DOWN);
        assertEquals(1,lift.getCurrentFloor());
        assertThrows(InvalidFloorException.class,()->{
            lift.moveToFloor(3,4, Lift.Direction.DOWN);
        });
    }


    @Test
    void shouldOpenTheDoor(){
        Lift lift = new Lift();
        lift.openDoor();
        assertTrue(lift.isDoorOpen());
    }

    @Test
    void shouldCloseTheDoor(){
        Lift lift = new Lift();
        lift.closeDoor();
        assertFalse(lift.isDoorOpen());
    }


}
