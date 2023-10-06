package com.rajkumar;

import com.rajkumar.model.Person;

public class EqualsDemo {

    public static void main(String[] args) {
        Person raj = Person.newBuilder()
                .setName("Raj")
                .setAge(40)
                .build();
        Person sameRaj = Person.newBuilder()
                .setName("Raj")
                .setAge(40)
                .build();
        Person rajAgeChange = Person.newBuilder()
                .setName("Raj")
                .setAge(42)
                .build();
        Person rajNameLower = Person.newBuilder()
                .setName("raj")
                .setAge(40)
                .build();
        Person ragav = Person.newBuilder()
                .setName("Ragav")
                .setAge(40)
                .build();
        System.out.println("Are 'Ragav' and 'Raj' same? : " + raj.equals(ragav));
        System.out.println("Are 'Raj' and 'Raj' same? : " + raj.equals(sameRaj));
        System.out.println("Are 'Ragav' and 'AgeChangedRaj' same? : " + raj.equals(rajAgeChange));
        System.out.println("Are 'Ragav' and 'LoweredNameRaj' same? : " + raj.equals(rajNameLower));
    }

}
