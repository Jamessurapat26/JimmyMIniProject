import java.util.Date;

public class BookDetail {
    private String bookId;
    private String bookName;
    private String authorName;
    private String typeOfBook;
    private int numberOfBooks;
    private Date borrowingDate;
    private Date returnDate;

    public BookDetail(String bookId, String bookName, String authorName, String typeOfBook, int numberOfBooks) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.typeOfBook = typeOfBook;
        this.numberOfBooks = numberOfBooks;
    }

    public void setBorrowingDate(Date borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void decreaseNumberOfBooks() {
        numberOfBooks--;
    }

    public void increaseNumberOfBooks() {
        numberOfBooks++;
    }

    public boolean isAvailableForBorrowing() {
        return numberOfBooks > 0;
    }

    public String getTypeOfBook() {
        return typeOfBook;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    @Override
    public String toString() {
        return "BookID : " + bookId +
                "\nBookName : " + bookName +
                "\nAuthorName : " + authorName +
                "\nTypeOfBook : " + typeOfBook +
                "\nNumberBook : " + numberOfBooks;
    }
}
