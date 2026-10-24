import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> values = new ArrayList<>();
        List<Integer> firstLineValues = new ArrayList<>();

        File inputFile = new File("duomenys.txt");
        if (!inputFile.isFile()) {
            inputFile = new File("Task 4/duomenys.txt");
        }

        try (Scanner scanner = new Scanner(inputFile)) {
            if (scanner.hasNextLine()) {
                Scanner firstLine = new Scanner(scanner.nextLine());
                while (firstLine.hasNextInt()) {
                    firstLineValues.add(firstLine.nextInt());
                }
                firstLine.close();
            }

            while (scanner.hasNextInt()) {
                values.add(scanner.nextInt());
            }
        }

        boolean firstLineIsCount = firstLineValues.size() == 1
                && firstLineValues.get(0) >= 0
                && values.size() == firstLineValues.get(0);
        if (!firstLineIsCount) {
            values.addAll(0, firstLineValues);
        }

        int decreasingCount = 0;
        int i = 1;
        while (i < values.size()) {
            if (values.get(i) < values.get(i - 1)) {
                decreasingCount++;
            }
            i++;
        }

        System.out.println(decreasingCount);
    }
}
