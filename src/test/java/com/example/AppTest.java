import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testFineCalculation_NoFine() {
        assertEquals(0.0, App.calculateFine(10, 14, 5.0), 0.001);
    }

    @Test
    public void testFineCalculation_WithFine() {
        // 16 days - 14 limit = 2 extra days * $5 = $10.0
        assertEquals(10.0, App.calculateFine(16, 14, 5.0), 0.001);
    }
}
