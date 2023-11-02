package com.mert.protobuf;

import com.mert.models.Credentials;
import com.mert.models.EmailCredentials;
import com.mert.models.PhoneOTP;

public class OneOfDemo {

    private static EmailCredentials credentials;

    public static void main(String[] args) {

        EmailCredentials emailCredentials = EmailCredentials.newBuilder()
                .setEmail("mert@gmail.com")
                .setPassword("3232332")
                .build();
        PhoneOTP phoneOTP = PhoneOTP.newBuilder()
                .setNumber(1123223)
                .setCode(2112121)
                .build();
        Credentials credentials = Credentials
                .newBuilder()
                .setEmailMode(emailCredentials)
                .build();
        login(credentials);

    }
    private static  void login(Credentials credentials){

        System.out.println(
                credentials.getEmailMode()
        );
    }
}
