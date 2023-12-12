import java.util.*;
public class Testbook {
    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<Book>();

        book.add(new BorrowingBooks("111111","Novel",20));
        System.out.println(book.get(0).toString());
    }
}
