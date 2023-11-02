package com.mert.protobuf;

import com.mert.models.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonDemo {
    public static void main(String[] args) throws IOException {
//        Person person = Person.newBuilder()
//                .setName("mert")
//                .setAge(10)
//                .build();
        Path path = Paths.get("mert.ser");
//        Files.write(path,person.toByteArray());
       byte[]bytes= Files.readAllBytes(path);
       Person newMert = Person.parseFrom(bytes);
        System.out.println(newMert);

    }
}
