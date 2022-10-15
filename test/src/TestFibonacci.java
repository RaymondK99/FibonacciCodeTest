import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

    @Test
    public void testSolve2() {
        assertEquals(0, Fibonacci.getConsecutiveCount("", 0));
        assertEquals(1, Fibonacci.getConsecutiveCount("A", 0));
        assertEquals(3, Fibonacci.getConsecutiveCount("AAA", 0));
        assertEquals(3, Fibonacci.getConsecutiveCount("AAAB", 0));
        assertEquals(1, Fibonacci.getConsecutiveCount("AAABB", 2));
        assertEquals(2, Fibonacci.getConsecutiveCount("AAABB", 3));
        assertEquals(1, Fibonacci.getConsecutiveCount("AAABB", 4));
        assertEquals(0, Fibonacci.getConsecutiveCount("AAABB", 5));

    }

}
