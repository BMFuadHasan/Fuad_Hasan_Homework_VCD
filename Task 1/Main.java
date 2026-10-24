import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the laptop price (p): ");
        long price = scanner.nextLong();
        System.out.print("Enter the amount already saved (s): ");
        long saved = scanner.nextLong();
        System.out.print("Enter the amount saved each week (m): ");
        long weeklySaving = scanner.nextLong();

        if (price <= saved) {
            System.out.println("k = 0");
        } else if (weeklySaving <= 0) {
            System.out.println("It is not possible to save enough money.");
        } else {
            long remaining = price - saved;
            long weeks = remaining / weeklySaving;
            if (remaining % weeklySaving != 0) {
                weeks++;
            }
            System.out.println("k = " + weeks);
        }
        scanner.close();
    }
}
