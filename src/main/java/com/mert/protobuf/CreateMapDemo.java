package com.mert.protobuf;

import com.mert.models.BodyStyle;
import com.mert.models.Car;
import com.mert.models.Dealer;

public class CreateMapDemo {
    public static void main(String[] args) {
        Car car = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setYear(2019)
                .setBodyStyleValue(BodyStyle.COUPE_VALUE)
                .build();
        Car car1 = Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setYear(2015)
                .setBodyStyleValue(BodyStyle.SEDAN_VALUE)
                .build();
        Dealer dealer = Dealer.newBuilder()
                .putModel(2012,car)
                .putModel(2013,car1)
                .build();
        System.out.println(
                dealer.getModelOrThrow(2012).getBodyStyle()
        );

    }
}
