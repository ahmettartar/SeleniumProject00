package com.Eduzeny.day03;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGGiris {

    @Test
    public void test1() {
        System.out.println("Test1 is starting.");
    }

    @Test(dependsOnMethods = "karsilastirma")
    public void test2() {
        System.out.println("Test2 is starting.");
    }

    @Test
    public void karsilastirma() {

        System.out.println("Karsilastirma testi");

        String actual = "Google";
        String expected = "Google";

        //daha once if -else yapiyorduk

        //Assert classi ile(TestNG den geliyor)
        // (actual, expected, op:" Message"(when failing)

        Assert.assertEquals(actual, expected);

//Tek bir durumun dogrulugunu sorgulariz. boolean dikkate alinir.
        Assert.assertTrue(actual.equals(expected));

    }







}
