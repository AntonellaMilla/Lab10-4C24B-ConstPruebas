package pe.edu.tecsup.lab10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import pe.edu.tecsup.Calculator;

class CalculatorTest {

    @Test
    void sub() {
        final int EXPECTED = 1;
        Calculator calc = new Calculator();
        int actual = calc.sub(4, 3);
        assertEquals(EXPECTED, actual);
    }

    @Test
    void add() {
        final int EXPECTED = 7;
        Calculator calc = new Calculator();
        int actual = calc.add(4, 3);
        assertEquals(EXPECTED, actual);
    }

    @Test
    void mul() {
        final int EXPECTED = 12;
        Calculator calc = new Calculator();
        int actual = calc.mul(4, 3);
        assertEquals(EXPECTED, actual);
    }

    @Test
    void div() {
        final int EXPECTED = 2;
        Calculator calc = new Calculator();
        int actual = calc.div(6, 3);
        assertEquals(EXPECTED, actual);
    }

    @Test
    void div_by_zero_should_throw() {
        Calculator calc = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.div(6, 0);
        });
        assertEquals("No se puede dividir por cero", exception.getMessage());
    }
}
