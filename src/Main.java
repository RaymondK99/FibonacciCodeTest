import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        if (args.length == 1) {
            String fileName = args[0];

            try {
                List<String> lines = fileName.strip().equals("-") ?
                        new BufferedReader(new InputStreamReader(System.in)).lines().toList() :
                        Files.readAllLines(Path.of(fileName));

                lines.forEach(line -> System.out.println(Fibonacci.solve(line)));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else {
            System.err.println("Supply filename or '-' for stdin");
        }
    }
}