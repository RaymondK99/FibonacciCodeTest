import java.util.Comparator;
import java.util.stream.IntStream;

public class Fibonacci {

    public static String solve(String input) {
        return IntStream.range(0, input.length())
                .mapToObj(input::substring)
                .map(Fibonacci::getFibonacciString)
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }

    public static String getFibonacciString(String input) {
        int fibonacciSum = 0;
        int prevPrev = 0;
        int prev = 0;
        int currentFibonacciNumber = 1;
        int index = 0;
        while(true) {
            int numberOfConsecutiveChars = getConsecutiveCount(input.substring(index));
            if (currentFibonacciNumber == numberOfConsecutiveChars) {
                // Expected number of chars
                fibonacciSum += currentFibonacciNumber;
            } else if (currentFibonacciNumber < numberOfConsecutiveChars) {
                // Too many, end here
                fibonacciSum += currentFibonacciNumber;
                break;
            } else {
                // Unexpected number of chars, stop
                break;
            }

            // Prepare next fibonacci number and keep track of sum
            prevPrev = prev;
            prev = currentFibonacciNumber;
            currentFibonacciNumber = prev + prevPrev;
            index += numberOfConsecutiveChars;
        }

        return input.substring(0, fibonacciSum);
    }

    public static int getConsecutiveCount(String input) {
        if (input.isEmpty()) return 0;
        int i = 1;
        for(;i<input.length();i++) {
            if (input.charAt(i-1) != input.charAt(i)) {
                break;
            }
        }

        return i;
    }

}
