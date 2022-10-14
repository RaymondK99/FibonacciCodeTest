import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFibonacci {


    @Test
    public void testBuildIntegerArray1() {
        assertEquals(0, Arrays.compare(new Integer[]{1}, Fibonacci.getSequence("A")));
        assertEquals(0, Arrays.compare(new Integer[]{1,1}, Fibonacci.getSequence("AB")));
        assertEquals(0, Arrays.compare(new Integer[]{1,1,1}, Fibonacci.getSequence("ABC")));
    }

    @Test
    public void testBuildIntegerArray2() {
        assertEquals(0, Arrays.compare(new Integer[]{}, Fibonacci.getSequence("")));
        assertEquals(0, Arrays.compare(new Integer[]{3}, Fibonacci.getSequence("AAA")));
        assertEquals(0, Arrays.compare(new Integer[]{1,3,1}, Fibonacci.getSequence("ABBBA")));
        assertEquals(0, Arrays.compare(new Integer[]{1,1,1,4,4,2}, Fibonacci.getSequence("ABCNNNNXXXXAA")));
    }


    @Test
    public void testCalcFibbLength() {
        assertEquals(0, Fibonacci.getFibonacciSequenceSum(new Integer[]{}));
        assertEquals(1, Fibonacci.getFibonacciSequenceSum(new Integer[]{1}));
        assertEquals(2, Fibonacci.getFibonacciSequenceSum(new Integer[]{1,1}));
        assertEquals(4, Fibonacci.getFibonacciSequenceSum(new Integer[]{1,1,2}));
        assertEquals(4, Fibonacci.getFibonacciSequenceSum(new Integer[]{1,1,2,1}));
        assertEquals(0, Fibonacci.getFibonacciSequenceSum(new Integer[]{0,1,1,2,1}));
        assertEquals(1, Fibonacci.getFibonacciSequenceSum(new Integer[]{1,3,1,2,1}));

    }

    @Test
    public void testSolve() {
        assertEquals("A", Fibonacci.solve("A"));
        assertEquals("A", Fibonacci.solve("ACCCCC"));

        assertEquals("AB", Fibonacci.solve("ABCCCC"));
        assertEquals("ABCCDDD", Fibonacci.solve("rABCCDDDdgdgdfg"));

    }
}
