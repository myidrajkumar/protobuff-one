package com.rajkumar;

import java.util.Map;

import com.rajkumar.model.enumeration.BodyStyle;
import com.rajkumar.model.enumeration.CarThree;
import com.rajkumar.model.enumeration.DealerOne;

public class EnumDemo {

    public static void main(String[] args) {

        CarThree hondaAccord = CarThree.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setBodyStyle(BodyStyle.COUPE)
                .setYear(2020)
                .build();
        
        CarThree hondaCivic = CarThree.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setBodyStyle(BodyStyle.SUV)
                .setYear(2005)
                .build();
        
        DealerOne dealer = DealerOne.newBuilder()
                .putAllModel(Map.of(2020, hondaAccord, 2005, hondaCivic))
                .build();
        
        System.out.println(dealer);
    }

}
