package com.busapp;

public class Passenger {
    int passengerId;
    String name;
    double fare;

    public Passenger(int passengerId, String name, double fare){
        this.passengerId = passengerId;
        this.name = name;
        this.fare = fare;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
