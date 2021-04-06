package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(MockitoExtension.class)

class DemoApplicationTests {

    @Autowired
    MyClass2 myClass;


    @Test
    void contextLoads() {
        int test = myClass.testMethod("5");
        assertEquals(5, test);
    }


}
