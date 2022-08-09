package com.rksight;

import org.testng.annotations.Test;

public class Test1 {
    @Test(priority = 1)
    void setup(){
        System.out.println("I am inside setup");
    }

    @Test(priority = 3)
    void testStep(){
        System.out.println("I am inside teststep");
    }

    @Test(priority = 4)
    void tearDown(){
        System.out.println("I am inside tearDown");
    }
}
