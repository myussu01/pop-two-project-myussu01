package fraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionImplTest {
    Fraction x = new FractionImpl(3,4);
    Fraction y = new FractionImpl(1,4);
    Fraction i = new FractionImpl(4);
    Fraction minus = new FractionImpl(-1, 8);

    @Test
    void add() {
        Fraction z = x.add(y);
        assertEquals("1", z.toString());
        assertEquals("5/8", x.add(minus).toString());
    }

    @Test
    void subtract() {

        assertEquals("1/2", 6);
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }

    @Test
    void abs() {
    }

    @Test
    void negate() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void inverse() {
    }

    @Test
    void compareTo() {
    }

    @Test
    void testToString() {
    }

    @Test
    void testDivide() {
        Fraction div = new FractionImpl(1,2);
        Fraction s = new FractionImpl("0");
        assertThrows( ArithmeticException.class, () -> div.divide(s), "Denominator cannot be zero");
    }
}