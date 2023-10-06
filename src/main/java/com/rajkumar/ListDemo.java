package com.rajkumar;

import java.util.List;

import com.rajkumar.model.list.AddressOne;
import com.rajkumar.model.list.CarOne;
import com.rajkumar.model.list.PersonWithList;

public class ListDemo {

    public static void main(String[] args) {

        AddressOne bangalore = AddressOne.newBuilder()
                .setPostbox(123)
                .setStreet("Gandhi Street")
                .setCity("Bangalore")
                .build();

        CarOne hondaAccord = CarOne.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setYear(2020)
                .build();
        
        CarOne hondaCivic = CarOne.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setYear(2005)
                .build();
        
        
        PersonWithList raj = PersonWithList.newBuilder()
        .setName("Raj")
        .setAge(40)
        .addAllCar(List.of(hondaAccord, hondaCivic))
        .setAddress(bangalore)
        .build();
        
        System.out.println(raj);

    }

}
