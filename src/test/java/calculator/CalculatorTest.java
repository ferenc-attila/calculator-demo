package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTest() {
        assertEquals(11, new Calculator().add(5, 6));
    }

    @Test
    void subtractTest() {
        assertEquals(4, new Calculator().subtract(12, 8));
    }

    @Test
    void multipplyTest() {
        assertEquals(20, new Calculator().multiply(5, 4));
    }

    @Test
    void divideWithZeroTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Calculator().divide(5,0));
    }
}