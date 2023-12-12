public class Book {
    private String bookCode;
    private String bookType;
    private String bookName;
    private String authorName;
    private String publisherName;
    private int yearOfPublication;
    private int numberOfBooks;
    
    public String getBookCode() {
        return bookCode;
    }

    public String getBookName() {
        return bookName;
    }
    

    // คอนสตรักเตอร์ที่รับพารามิเตอร์
    public Book(String bookCode, String bookType, String bookName, String authorName, String publisherName, int yearOfPublication, int numberOfBooks) {
        this.bookCode = bookCode;
        this.bookType = bookType;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.yearOfPublication = yearOfPublication;
        this.numberOfBooks = numberOfBooks;
    }

    public String toString() {
        return "Book{" +
                "bookCode='" + bookCode + '\'' +
                ", bookType='" + bookType + '\'' +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publisherName='" + publisherName + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", numberOfBooks=" + numberOfBooks +
                '}';
    }
}
