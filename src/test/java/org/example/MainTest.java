package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testCountWellFormedParenthesis() {
        assertEquals(1, Main.countWellFormedParenthesis(1));
        assertEquals(2, Main.countWellFormedParenthesis(2));
        assertEquals(5, Main.countWellFormedParenthesis(3));
        assertEquals(14, Main.countWellFormedParenthesis(4));
        assertEquals(42, Main.countWellFormedParenthesis(5));
        assertEquals(132, Main.countWellFormedParenthesis(6));
        assertEquals(429, Main.countWellFormedParenthesis(7));
    }
}
