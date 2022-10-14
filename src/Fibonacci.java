import java.util.LinkedList;
import java.util.List;

public class Fibonacci {


    public static String solve(String input) {
        if (input.length() == 0) {
            return input;
        }

        int maxFibonacciSum = -1;
        int startIndex = -1;
        for(int i=0;i<input.length();i++) {
            Integer[] sequence = getSequence(input.substring(i));
            int fibonacciSum = Fibonacci.getFibonacciSequenceSum(sequence);
            if (fibonacciSum > maxFibonacciSum) {
                maxFibonacciSum = fibonacciSum;
                startIndex = i;
            }
        }

        return input.substring(startIndex, startIndex+maxFibonacciSum);
    }

    public static Integer[] getSequence(String input) {
        List<Integer> output = new LinkedList<>();

        int lastChar = -1;
        int acc = 0;
        int i = 0;
        for(;i<input.length();i++) {
            int ch = input.charAt(i);

            if (i == 0) {
                acc = 1;
            } else if (lastChar != ch) {
                output.add(acc);
                acc = 1;
            } else {
                acc++;
            }

            lastChar = ch;
        }

        if (i>0) {
            output.add(acc);
        }

        return output.toArray(Integer[]::new);
    }

    public static int getFibonacciSequenceSum(Integer[] array) {
        int acc = 0;
        if (array.length == 1 && array[0] == 1) {
            acc = 1;
        } else if (array.length >= 2 && array[0] == 1 && array[1] == 1) {
            acc = 2;
            for(int i=2;i<array.length;i++) {
                if (array[i] == array[i-1] + array[i-2]) {
                    acc += array[i];
                } else {
                    break;
                }
            }
        } else if (array.length > 0 && array[0] == 1) {
            acc = 1;
        }

        return acc;
    }

}
