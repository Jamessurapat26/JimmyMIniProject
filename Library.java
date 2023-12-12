import java.util.ArrayList;

public class Library {
    private String libraryName;
    private String address;
    private String phoneNumber;
    private ArrayList<Book> books;

    public Library(String libraryName, String address, String phoneNumber) {
        this.libraryName = libraryName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    // Other methods...
}
