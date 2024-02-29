package com.busapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("************  Welcome to MSRTC  ************");

        System.out.println("Enter capacity of bus:");
        int capacity = sc.nextInt();
        int vaccancies = capacity;
        Bus bus = new Bus(capacity,vaccancies);
         int ch = 0;
         do{
             System.out.println("Choose :\n1.Onboard com.busapp.Passenger\n2.List of com.busapp.Passenger\n4.Exit");
             ch = sc.nextInt();

             switch (ch){
                 case 1:
                     System.out.println("Enter passenger details");

                     System.out.println("Enter com.busapp.Passenger ID:");
                     int id = sc.nextInt();

                     System.out.println("Enter com.busapp.Passenger Name:");
                     String name = sc.next();

                     System.out.println("Enter seat number to allocate:");
                     int seatNo = sc.nextInt();

                     System.out.println("Enter com.busapp.Passenger fares");
                     double fares = sc.nextDouble();

                     bus.onboardPassenger(id, name, seatNo, fares);

                     break;
                 case 2:
                     System.out.println(bus.displayNamesOfPassengers());

                     break;
                 case 3:
                     break;
                 case 4:
                     System.exit(0);
                     break;
                 default:
                     System.out.println("Please choose valid choice..!");
             }

         }while(ch!=5);
    }
}
