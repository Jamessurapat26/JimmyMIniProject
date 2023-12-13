import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Testbook {
    public static void main(String[] args) {
        ArrayList<BookDetail> books = new ArrayList<BookDetail>();
        books.add(new BookDetail("10001", "To Kill a Mockingbird",  "Harper Lee", "Novels and literature", 20));
        books.add(new BookDetail("20001", "The Innovators",  "Walter Isaacson", "Technology", 20));
        books.add(new BookDetail("30001", "The Death and Life of the Great American School System",  "Diane Ravitch", "Education", 20));
        books.add(new BookDetail("40001", "Sapiens: A Brief History of Humankind",  " Yuval Noah Harari ", "Business", 20));
        books.add(new BookDetail("50001", "Being Mortal: Medicine and What Matters in the End",  "Atul Gawande ", "Health", 20));
        displayAllBook(books);
        Scanner scanner = new Scanner(System.in);
        char choice;
        int num;

        do {
            System.out.println("==========================================");
            System.out.println("Select search book type ");
            System.out.println("1: Novels");
            System.out.println("2: Technology");
            System.out.println("3: Education");
            System.out.println("4: Business");
            System.out.println("5: Health");
            System.out.println("==========================================");
            System.out.print("Select search book type : ");
            num = scanner.nextInt();
            scanner.nextLine();

            switch (num) {
                case 1:
                    System.out.println("====== Novels ======");
                    for (BookDetail book : books) {
                        if (book.getBookType().equals("Novels and literature")) {
                            System.out.println(book.toString());
                            book.decreaseNumberOfBooks();
                            if (book.getNumberOfBooks() <= 0) {
                                System.out.println("No more books available for borrowing in this category.");
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("====== Technology Books ======");
                    for (BookDetail book : books) {
                        if (book.getBookType().equals("Technology")) {
                            System.out.println(book.toString() + "\nBorrowingDate : " + book.getBorrowingDate() + "\nReturnDate : " + book.getReturnDate());
                            book.decreaseNumberOfBooks();
                            if (book.getNumberOfBooks() <= 0) {
                                System.out.println("No more books available for borrowing in this category.");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("====== Education Books ======");
                    for (BookDetail book : books) {
                        if (book.getBookType().equals("Education")) {
                            System.out.println(book.toString() + "\nBorrowingDate : " + book.getBorrowingDate() + "\nReturnDate : " + book.getReturnDate());
                            book.decreaseNumberOfBooks();
                            if (book.getNumberOfBooks() <= 0) {
                                System.out.println("No more books available for borrowing in this category.");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("====== Business Books ======");
                    for (BookDetail book : books) {
                        if (book.getBookType().equals("Business")) {
                            System.out.println(book.toString() + "\nBorrowingDate : " + book.getBorrowingDate() + "\nReturnDate : " + book.getReturnDate());
                            book.decreaseNumberOfBooks();
                            if (book.getNumberOfBooks() <= 0) {
                                System.out.println("No more books available for borrowing in this category.");
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("====== Health Books ======");
                    for (BookDetail book : books) {
                        if (book.getBookType().equals("Health")) {
                            System.out.println(book.toString() + "\nBorrowingDate : " + book.getBorrowingDate() + "\nReturnDate : " + book.getReturnDate());
                            book.decreaseNumberOfBooks();
                            if (book.getNumberOfBooks() <= 0) {
                                System.out.println("No more books available for borrowing in this category.");
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("====== Invalid choice ======");
                    break;
            }

            System.out.print("Continue [y/n]: ");
            choice = scanner.next().charAt(0);
            scanner.nextLine();

        } while (choice == 'y' || choice == 'Y');
        
        System.out.println("Thanks for using");
    }
  
    public static void displayAllBook(ArrayList<BookDetail> books){
        for (BookDetail b : books){
            System.out.println(b.toString());
        }
    }
}
