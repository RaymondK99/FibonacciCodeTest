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
        int fibonacciSum = 0, prevPrev = 0, prev = 0, currentFibonacciNumber = 1, index = 0;

        while(true) {
            int numberOfConsecutiveChars = getConsecutiveCount(input, index);
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

    public static int getConsecutiveCount(String input, int offset) {
        if (input.isEmpty() || offset >= input.length()) return 0;
        int index = offset, nextIndex = index+1;
        while(nextIndex < input.length() && input.charAt(index) == input.charAt(nextIndex)) {
            nextIndex++;
            index++;
        }
        return nextIndex - offset;
    }
}
