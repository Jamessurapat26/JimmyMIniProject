import java.util.*;

public class Mylibary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BookDetail> book = new ArrayList<BookDetail>();
        book.add(new BookDetail("10001", "To Kill a Mockingbird",  "Harper Lee", "Novels and literature",20));
        book.add(new BookDetail("20001", "The Innovators",  "Walter Isaacson", "Technology",20));
        book.add(new BookDetail("30001", "The Death and Life of the Great American School System",  "Diane Ravitch", "Education",20));
        book.add(new BookDetail("40001", "Sapiens: A Brief History of Humankind",  " Yuval Noah Harari ", "Business",20));
        book.add(new BookDetail("50001", "Being Mortal: Medicine and What Matters in the End",  "Atul Gawande ", "Health",20));
        displayAllBook(book);
        char c ;
        do {
            displayMenu1();
            // int choice ;
            // switch (choice) {
            //     case 1:System.out.println("UserID");
                    
            //         break;
            
            //     default:
            //         break;
            // }



            System.out.print("You want to continue [y/n] : ");
            c = sc.next().charAt(0);

        } while (c == 'y'||c == 'Y');
    
    
    }

    public static void displayAllBook(ArrayList<BookDetail> book){
        for (BookDetail b : book){
            System.out.println(b.toString());
        }
    }

    public static void displayMenu1(){
        System.out.println("1.Check Member");
        System.out.println("2.Borowwing Book");
        System.out.println("3.Employee");
    }
}
