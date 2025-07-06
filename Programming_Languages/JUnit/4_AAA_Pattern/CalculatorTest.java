package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    // Setup: runs before each test
    @Before
    public void setUp() {
        System.out.println("Setting up...");
        calc = new Calculator();  // Arrange
    }

    // Teardown: runs after each test
    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        calc = null;
    }

    @Test
    public void testAdd() {
        // Act
        int result = calc.add(10, 5);
        
        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        // Act
        int result = calc.subtract(10, 5);
        
        // Assert
        assertEquals(5, result);
    }
}
