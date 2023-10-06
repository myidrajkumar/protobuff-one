package com.rajkumar;

import com.rajkumar.model.Person;

public class SerializationDeserializationDemo {

    public static void main(String[] args) {
        Person raj = Person.newBuilder()
                .setName("Raj")
                .setAge(40)
                .build();
        System.out.println(raj);
    }

}
