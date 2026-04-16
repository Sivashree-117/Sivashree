import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter User Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();

        
        System.out.print("Enter number of books issued: ");
        int numBooks = scanner.nextInt();
        scanner.nextLine(); // consume newline

        List<String> books = new ArrayList<>();
        for (int i = 1; i <= numBooks; i++) {
            System.out.print("Enter name of book " + i + ": ");
            books.add(scanner.nextLine());
        }

        System.out.print("Enter number of days borrowed: ");
        int daysBorrowed = scanner.nextInt();


        final int ALLOWED_DAYS = 14;
        final double FINE_PER_DAY = 5.0;

   
        double totalFine = calculateFine(daysBorrowed, ALLOWED_DAYS, FINE_PER_DAY);

  
        System.out.println("\n--- Borrowing Status ---");
        System.out.println("User Name: " + name);
        System.out.println("User ID: " + userId);
        System.out.println("Books Issued: " + String.join(", ", books));
        System.out.println("Days Borrowed: " + daysBorrowed);
        System.out.println("Allowed Days: " + ALLOWED_DAYS);
        System.out.printf("Total Fine: $%.2f\n", totalFine);
        
        scanner.close();
    }

    public static double calculateFine(int days, int limit, double rate) {
        if (days > limit) {
            return (days - limit) * rate;
        }
        return 0.0;
    }
}
