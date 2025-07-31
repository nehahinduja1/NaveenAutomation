package Java_InterviewQ;

import java.util.Scanner;

public class Email {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter your email: ");
        String email = scanner.nextLine(); // Read input from user

        // Check if email is empty
        if (email.equals("")) {
            System.out.println("Email is required.");
        }
        // Check if email is too long
        else if (email.length() > 50) {
            System.out.println("Email should not be more than 50 characters.");
        }
        // Check if email contains "@" and "."
        else if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Email format is not correct.");
        }
        // If all checks passed
        else {
            System.out.println("Email is valid.");
        }
} }