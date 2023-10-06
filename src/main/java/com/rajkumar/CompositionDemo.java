package com.rajkumar;

import com.rajkumar.model.composite.Address;
import com.rajkumar.model.composite.Car;
import com.rajkumar.model.composite.CompositePerson;

public class CompositionDemo {

    public static void main(String[] args) {

        Address bangalore = Address.newBuilder()
                .setPostbox(123)
                .setStreet("Gandhi Street")
                .setCity("Bangalore")
                .build();

        Car hondaAccord = Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setYear(2020)
                .build();
        
        CompositePerson raj = CompositePerson.newBuilder()
        .setName("Raj")
        .setAge(40)
        .setCar(hondaAccord)
        .setAddress(bangalore)
        .build();
        
        System.out.println(raj);

    }

}
