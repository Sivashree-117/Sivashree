package com.library;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testFineCalculation() {
        assertEquals(0.0, App.calculateFine(5), "No fine for 5 days");
        assertEquals(15.0, App.calculateFine(10), "Fine for 10 days (3 days extra * 5)");
    }
}
