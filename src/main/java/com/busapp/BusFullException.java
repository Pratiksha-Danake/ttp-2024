package com.busapp;

public class BusFullException extends Exception{
    BusFullException(String exceptionMessage){
            super(exceptionMessage);
    }
}
