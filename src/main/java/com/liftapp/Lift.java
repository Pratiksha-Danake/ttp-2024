package com.liftapp;

public class Lift {
    private int currentFloor = 0;
    private boolean isDoorOpen;
    private int maxFloor=5;

    private int ding = 0;
    private Direction direction;

    public void openDoor() {
        this.isDoorOpen=true;
    }

    public void closeDoor() {
        this.isDoorOpen = false;
    }

    public enum Direction{UP,DOWN,NONE};

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    public void setDoorOpen(boolean doorOpen) {
        isDoorOpen = doorOpen;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }


    public void moveToFloor(int currentFloor, int destFloor,Direction requested) throws InvalidFloorException {
        if (destFloor < 1 || destFloor > maxFloor )
            throw new InvalidFloorException("Invalid floor.. can't reach here");
        if (requested == Direction.UP && destFloor > currentFloor){
            ding = 2;
            this.currentFloor = destFloor;
        } else if (requested == Direction.DOWN && destFloor < currentFloor) {
            ding = 1;
            this.currentFloor = destFloor;
        } else if (requested == Direction.NONE) {
            this.currentFloor = destFloor;
        }else {
            throw new InvalidFloorException("invalid direction");
        }
    }
}
