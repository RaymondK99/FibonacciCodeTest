import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFibonacci {


    @Test
    public void testGetFibonacciString() {
        assertEquals("", Fibonacci.getFibonacciString(""));
        assertEquals("A", Fibonacci.getFibonacciString("A"));


        assertEquals("A", Fibonacci.getFibonacciString("AA"));
        assertEquals("AB", Fibonacci.getFibonacciString("AB"));

        assertEquals("AB", Fibonacci.getFibonacciString("ABC"));
        assertEquals("ABCC", Fibonacci.getFibonacciString("ABCC"));
        assertEquals("ABCC", Fibonacci.getFibonacciString("ABCCC"));
        assertEquals("ABCC", Fibonacci.getFibonacciString("ABCCCDDDDDDD"));

        assertEquals("ABCCDDD", Fibonacci.getFibonacciString("ABCCDDDDDDD"));

    }

    @Test
    public void testSolve() {
        assertEquals("A", Fibonacci.solve("A"));
        assertEquals("AC", Fibonacci.solve("ACCCCC"));
        assertEquals("ABCC", Fibonacci.solve("ABCCCC"));
        assertEquals("ABCCDDD", Fibonacci.solve("rABCCDDDDDDdgdgdfg"));

        assertEquals("", Fibonacci.solve(""));
        assertEquals("a", Fibonacci.solve("aaa"));
        assertEquals("AB", Fibonacci.solve("ABBB"));
        assertEquals("ABCC", Fibonacci.solve("ABCCC"));
    }


}
