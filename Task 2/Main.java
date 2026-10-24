import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long evenCount = 0;
        long oddCount = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter integers (enter 0 to stop):");
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number == 0) {
                    break;
                }

                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
