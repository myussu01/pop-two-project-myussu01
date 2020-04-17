package fraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionImplTest {
    Fraction x = new FractionImpl(3,4);
    Fraction y = new FractionImpl("1/4");
    Fraction i = new FractionImpl(4);
    Fraction b = new FractionImpl(-1, 8);
    Fraction a = new FractionImpl("1/18");

    @Test
    void add() {
        Fraction z = x.add(y);
        assertEquals("1", z.toString());
        assertEquals("5/8", x.add(b).toString());
    }

    @Test
    void subtract() {
        Fraction z = y.subtract(x);
        assertEquals("-1/2", z.toString());
    }

    @Test
    void multiply() {
        Fraction z = i.multiply(y);
        assertEquals("1",z.toString());
    }

    @Test
    void divide() {
        Fraction z = a.divide(y);
        assertEquals("2/9",z.toString());
    }

    @Test
    void abs() {
        Fraction z = b.abs();
        assertEquals("1/8",z.toString());
    }

    @Test
    void negate() {
        Fraction z = i.negate();
        assertEquals("-4",z.toString());
    }

    @Test
    void inverse() {
        Fraction z = i.inverse();
        assertEquals("1/4",z.toString());
    }

    @Test
    void compareTo() {
        Fraction z = new FractionImpl(4,16);
        Fraction c = new FractionImpl("1/8");
        int p = b.compareTo(x);
        int x = z.compareTo(y);
        assertEquals(0,x);
        assertEquals(-1,p);
    }

    @Test
    void testDivide() {
        Fraction div = new FractionImpl(1,0);
        Exception exception = assertThrows(ArithmeticException.class, () -> div.divide(x));
        assertEquals("Denominator cannot be zero\n", exception.getMessage());
    }
}