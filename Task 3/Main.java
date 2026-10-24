import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File("duomenys.txt"))) {
            int days = scanner.nextInt();
            int negativeDays = 0;

            int i = 0;
            while (i < days) {
                if (scanner.nextInt() < 0) {
                    negativeDays++;
                }
                i++;
            }

            if (negativeDays == 0) {
                System.out.println("No negative temperatures recorded");
            } else {
                System.out.println(negativeDays);
            }
        }
    }
}
