package com.Eduzeny.day04;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.Locale;

public class FakerExample {

    @Test
    public void fakerPractice() {
        //Faker sahte = new Faker();
        Faker sahte = new Faker(new Locale("tr"));


        System.out.println("sahte.name().firstName() = " + sahte.name().firstName());
        System.out.println("sahte.name().lastName() = " + sahte.name().lastName());

        System.out.println("sahte.address().fullAddress() = " + sahte.address().fullAddress());

        System.out.println("sahte.finance().creditCard() = " + sahte.finance().creditCard());

        System.out.println("sahte.numerify(\"#######\") = " + sahte.numerify("#######"));

        System.out.println("sahte.letterify(\"?????\") = " + sahte.letterify("?????"));

        System.out.println("sahte.bothify(\"###???##\") = " + sahte.bothify("###???##"));


        //Faker faker = new Faker(new Locale("YOUR_LOCALE"));



    }

}
