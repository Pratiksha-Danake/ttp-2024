package com.busapp;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    private int capacity;
    private List<Passenger> passengers;
    private double totalFares;
    private int vaccancies;

    public Bus(int capacity, int vaccancies) {
        this.capacity = capacity;
        this.vaccancies = vaccancies;
        this.passengers = new ArrayList<>(capacity);
        this.totalFares = 0.0;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getVaccancies() {
        return vaccancies;
    }

    public void setVaccancies(int vaccancies) {
        this.vaccancies = vaccancies;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public double getTotalFares() {
        return totalFares;
    }

    public void setTotalFares(double totalFares) {
        this.totalFares = totalFares;
    }

//    TO-DO : BusFullException
    public void onboardPassenger(int id, String name, int seatNo, double fares) throws BusFullException {
//        if (passengers.size()<capacity)
        if (vaccancies > 0){
            Passenger passenger = new Passenger(id,name,fares);
            passengers.add(seatNo - 1,passenger);
            vaccancies --;
            totalFares += fares;
            System.out.println("com.busapp.Passenger " + name + " boarded at seat number " + seatNo);
        }else {
//            System.out.println("Bus is full. Cannot board passenger ..!");
            throw new BusFullException("Bus is full. Cannot board passenger ..!");
        }
    }

    public List<String> displayNamesOfPassengers(){
        List<String> names = new ArrayList<>();
        for(Passenger pass : passengers){
            names.add(pass.getName());
        }
        return names;
    }

    public double getTotalOfAllpaidFares() {
        return getTotalFares();
    }
}

