public class Book {
    private String bookCode;
    private String type;
    private int numberOfBooks;
    
    public String getBookCode() {
        return bookCode;
    }

    
    // คอนสตรักเตอร์ที่รับพารามิเตอร์
    public Book(String bookCode, String bookType, int numberOfBooks) {
        this.bookCode = bookCode;
        this.type=bookType;
        this.numberOfBooks = numberOfBooks;
    }

    public void borrowingBook(int num){
        this.numberOfBooks = numberOfBooks - 1;
    }

    public String toString() {
        return 
                "bookCode : " + bookCode +
                "\nbookType : " + type+
                "\nnumberOfBooks : " + numberOfBooks;
    }
}
