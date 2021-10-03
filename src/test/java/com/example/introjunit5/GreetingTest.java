package com.example.introjunit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    Greeting greeting;
    @BeforeEach
    void setUp() {
        greeting=new Greeting();
    }

    @Test
    void helloWorld() {
        assertEquals("hello world",greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        assertEquals("hello sharon",greeting.helloWorld("sharon"));
    }
}