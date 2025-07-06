package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert that 2 + 3 equals 5
        assertEquals(5, 2 + 3);

        // Assert that 5 is greater than 3
        assertTrue(5 > 3);

        // Assert that 5 is NOT less than 3
        assertFalse(5 < 3);

        // Assert that a null value is indeed null
        assertNull(null);

        // Assert that a new object is not null
        assertNotNull(new Object());
    }
}
