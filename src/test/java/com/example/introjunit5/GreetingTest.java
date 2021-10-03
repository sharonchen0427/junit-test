package com.example.introjunit5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("before- I am only called once!!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("before each test....");
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

    @AfterEach
    void tearDown() {
        System.out.println("after each test....");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after- I am only called once!!!");
    }
}