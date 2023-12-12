import java.util.Scanner;

public class TestLibary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Library System Menu:");
            System.out.println("1. Borrow a Book");
            System.out.println("2. Return a Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Code to borrow: ");
                    String borrowCode = scanner.nextLine();
                    // Implement borrowing logic here
                    System.out.println("Borrowing book with code: " + borrowCode);
                    break;

                case 2:
                    System.out.print("Enter Book Code to return: ");
                    String returnCode = scanner.nextLine();
                    // Implement returning logic here
                    System.out.println("Returning book with code: " + returnCode);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }
}
