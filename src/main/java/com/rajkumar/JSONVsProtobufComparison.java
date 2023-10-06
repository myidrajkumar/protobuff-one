package com.rajkumar;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.stream.IntStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;
import com.rajkumar.json.model.JsonPerson;
import com.rajkumar.model.Person;

public class JSONVsProtobufComparison {

    public static void main(String[] args) {

        JsonPerson jsonRaj = new JsonPerson("Raj", 40);
        Person protoRaj = Person.newBuilder()
                .setName("Raj")
                .setAge(40)
                .build();
        
        ObjectMapper mapper = new ObjectMapper();
        Runnable jsonRunnable = () -> {
            try {
                byte[] rajBytes = mapper.writeValueAsBytes(jsonRaj);
                mapper.readValue(rajBytes, JsonPerson.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        
        Runnable protoRunnable = () -> {
            byte[] rajBytes = protoRaj.toByteArray();
            try {
                Person.parseFrom(rajBytes);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        };
        
        IntStream.rangeClosed(1, 10).forEach(num -> {
            doPerformanceTest(jsonRunnable, "Json");
            doPerformanceTest(protoRunnable, "Proto");
        });
    }
    
    private static void doPerformanceTest(Runnable runnable, String method) {
        LocalDateTime startTime = LocalDateTime.now();
        IntStream.rangeClosed(1, 5_000_000).forEach( num -> runnable.run());
        System.out.println("Method: " + method + " took " + Duration.between(startTime, LocalDateTime.now()).toMillis() + " ms");
    }

}
