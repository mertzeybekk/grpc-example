package com.mert.protobuf;

import com.mert.models.Address;
import com.mert.models.Car;
import com.mert.models.Person;

import java.util.ArrayList;
import java.util.List;

public class CompositionDemo {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Address address = Address.newBuilder()
                .setPostbox(1243)
                .setStreet("main street")
                .setCity("Atlanta")
                .build();
        Car car = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setYear(2019)
                .build();
        Car car1 = Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setYear(2015)
                .build();
        cars.add(car);
        cars.add(car1);
        Person person = Person.newBuilder()
                .setAge(12)
                .setName("mert")
                .setAddress(address)
                .addAllCar(cars)
                .build();
        System.out.println(person);
    }
}
