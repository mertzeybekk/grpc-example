package com.mert.protobuf;

import com.mert.models.Person;

public class DefaultValueDemo {
    public static void main(String[] args) {
        Person person = Person.newBuilder().build();
        System.out.println(
                "City :" + person.getAddress().getCity()
        );
    }
}
