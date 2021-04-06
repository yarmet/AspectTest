package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MyClass2 {


    public int getTest() {
        return 10;
    }


    public int testMethod() {
        return 20;
    }


    public int testMethod(int temp) {
        return temp + 10;
    }

    public int testMethod(String temp) {
        System.out.println("in tst");
        return Integer.parseInt(temp);
    }

    public int testMethod(Integer temp2) {
        System.out.println("in tst");
        return temp2;
    }



    public int testMethod(String temp, String temp2) {
        return Integer.parseInt(temp) + Integer.parseInt(temp2);
    }


}
