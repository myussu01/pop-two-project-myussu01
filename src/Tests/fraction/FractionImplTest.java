package fraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionImplTest {
    Fraction x = new FractionImpl(1,4);
    Fraction y = new FractionImpl(1,4);
    Fraction i = new FractionImpl(4);

    @Test
    void add() {

        Fraction z = x.add(y);
        assertEquals("1/2", z.toString());
        assertEquals("4", i.toString());

    }

    @Test
    void subtract() {
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
    void testExceptions() {
        Fraction zero = new FractionImpl("1/0");
        ArithmeticException thrown = assertThrows(ArithmeticException.class,
                () -> {
                    Integer.parseInt("0");});


    }

}