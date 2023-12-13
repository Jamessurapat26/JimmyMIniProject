import java.util.ArrayList;
import java.util.Scanner;

public class Testbook {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new BorrowingBooks("11111", "Novel", "The Great Gatsby - F. Scott Fitzgerald (1925)", 20));
        books.add(new BorrowingBooks("21112", "Technology", "The Innovators - Walter Isaacson (2014)", 20));
        books.add(new BorrowingBooks("31113", "Education", "The Elements of Style - Strunk & White (1918)", 20));
        books.add(new BorrowingBooks("41114", "Business", "Rich Dad Poor Dad - Robert T. Kiyosaki (1997)", 20));
        books.add(new BorrowingBooks("51114", "Health", "The Power of Now - Eckhart Tolle (1997)", 20));

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
                    for (Book book : books) {
                        if (book instanceof BorrowingBooks && book.getBookCode().startsWith("1")) {
                            System.out.println("bookCode : " + book.getBookCode());
                            System.out.println("bookType : " + book.getBookType());
                            System.out.println("borrowingDate : " + ((BorrowingBooks) book).getBorrowingDate());
                            System.out.println("ReturnBook : " + ((BorrowingBooks) book).getDateOfReturn());
                            System.out.println(((BorrowingBooks) book).getBookName());
                            // ลดจำนวนหนังสือที่ยืม
                            book.decreaseNumberOfBooks();
                            System.out.println("Number of remaining books: " + book.getNumberOfBooks());
                            if (book.getNumberOfBooks() <= 0) {
                                System.out.println("No more books available for borrowing in this category.");
                            }
                        }
                    }
                    break;
                    case 2:
                    System.out.println("====== Technology Books ======");
                    for (Book book : books) {
                        if (book instanceof BorrowingBooks && ((BorrowingBooks) book).getBookCode().startsWith("2")) {
                            System.out.println("bookCode : " + book.getBookCode());
                            System.out.println("bookType : " + book.getBookType());
                            System.out.println("borrowingDate : " + ((BorrowingBooks) book).getBorrowingDate());
                            System.out.println("ReturnBook : " + ((BorrowingBooks) book).getDateOfReturn());
                            System.out.println(((BorrowingBooks) book).getBookName());
                            // ลดจำนวนหนังสือที่ยืม
                            book.decreaseNumberOfBooks();
                            System.out.println("Number of remaining books: " + book.getNumberOfBooks());
                            if (book.getNumberOfBooks() <= 0) {
                                System.out.println("No more books available for borrowing in this category.");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("====== Education Books ======");
                    for (Book book : books) {
                        if (book instanceof BorrowingBooks && book.getBookCode().startsWith("3")) {
                           System.out.println("bookCode : " + book.getBookCode());
                            System.out.println("bookType : " + book.getBookType());
                            System.out.println("borrowingDate : " + ((BorrowingBooks) book).getBorrowingDate());
                            System.out.println("ReturnBook : " + ((BorrowingBooks) book).getDateOfReturn());
                            System.out.println(((BorrowingBooks) book).getBookName());
                            // ลดจำนวนหนังสือที่ยืม
                            book.decreaseNumberOfBooks();
                            System.out.println("Number of remaining books: " + book.getNumberOfBooks());
                            if (book.getNumberOfBooks() <= 0) {
                                System.out.println("No more books available for borrowing in this category.");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("====== Business Books ======");
                    for (Book book : books) {
                        if (book instanceof BorrowingBooks && book.getBookCode().startsWith("4")) {
                            System.out.println("bookCode : " + book.getBookCode());
                            System.out.println("bookType : " + book.getBookType());
                            System.out.println("borrowingDate : " + ((BorrowingBooks) book).getBorrowingDate());
                            System.out.println("ReturnBook : " + ((BorrowingBooks) book).getDateOfReturn());
                            System.out.println(((BorrowingBooks) book).getBookName());
                            // ลดจำนวนหนังสือที่ยืม
                            book.decreaseNumberOfBooks();
                            System.out.println("Number of remaining books: " + book.getNumberOfBooks());
                            if (book.getNumberOfBooks() <= 0) {
                                System.out.println("No more books available for borrowing in this category.");
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("====== Health Books ======");
                    for (Book book : books) {
                        if (book instanceof BorrowingBooks && book.getBookCode().startsWith("5")) {
                            System.out.println("bookCode : " + book.getBookCode());
                            System.out.println("bookType : " + book.getBookType());
                            System.out.println("borrowingDate : " + ((BorrowingBooks) book).getBorrowingDate());
                            System.out.println("ReturnBook : " + ((BorrowingBooks) book).getDateOfReturn());
                            System.out.println(((BorrowingBooks) book).getBookName());
                            // ลดจำนวนหนังสือที่ยืม
                            book.decreaseNumberOfBooks();
                            System.out.println("Number of remaining books: " + book.getNumberOfBooks());
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
}
