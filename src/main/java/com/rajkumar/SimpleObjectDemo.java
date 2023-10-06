package com.rajkumar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.rajkumar.model.Person;

public class SimpleObjectDemo {

    public static void main(String[] args) throws IOException {
        Person raj = Person.newBuilder()
                .setName("Raj")
                .setAge(40)
                .build();
        System.out.println("Will be serializing the object: " + raj);
        
        Path rajSerializePath = Paths.get("raj.ser");
        Files.write(rajSerializePath, raj.toByteArray());
        System.out.println("File is serialized...");
        
        byte[] rajBytes = Files.readAllBytes(rajSerializePath);
        Person deserializedRaj = Person.parseFrom(rajBytes);
        System.out.println("Deserialized 'Raj': " + deserializedRaj);
    }

}
