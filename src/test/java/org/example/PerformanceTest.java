package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PerformanceTest {
    @Test
    void performanceTest() {
        long start = System.currentTimeMillis();
        int result = Main.countWellFormedParenthesis(15);
        long end = System.currentTimeMillis();
        System.out.println("n=15: " + result + ", Time: " + (end - start) + " ms");
        assertTrue((end - start) < 1000);
    }
}
