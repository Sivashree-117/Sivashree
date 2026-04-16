package com.library;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter User Name: ");
        String name = sc.nextLine();
        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();
        System.out.print("Enter number of books issued: ");
        int numBooks = sc.nextInt();
        System.out.print("Enter total days borrowed: ");
        int days = sc.nextInt();
        
        double totalFine = calculateFine(days);
        displayDetails(name, userId, numBooks, totalFine);
    }

    public static double calculateFine(int days) {
        int allowedLimit = 7; // Example limit
        double finePerDay = 5.0; // Example fine rate
        if (days > allowedLimit) {
            return (days - allowedLimit) * finePerDay;
        }
        return 0.0;
    }

    public static void displayDetails(String name, String id, int books, double fine) {
        System.out.println("\n--- Borrowing Status ---");
        System.out.println("User: " + name + " (ID: " + id + ")");
        System.out.println("Books Issued: " + books);
        System.out.println("Total Fine: Rs. " + fine);
    }
}

