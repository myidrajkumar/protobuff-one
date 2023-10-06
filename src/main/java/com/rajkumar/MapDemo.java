package com.rajkumar;

import java.util.Map;

import com.rajkumar.model.map.CarTwo;
import com.rajkumar.model.map.Dealer;

public class MapDemo {

    public static void main(String[] args) {

        CarTwo hondaAccord = CarTwo.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setYear(2020)
                .build();
        
        CarTwo hondaCivic = CarTwo.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setYear(2005)
                .build();
        
        Dealer dealer = Dealer.newBuilder()
                .putAllModel(Map.of(2020, hondaAccord, 2005, hondaCivic))
                .build();
        
        System.out.println(dealer);
    }

}
