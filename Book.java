public class Book {
    private String bookCode;
    private String bookType;
    protected int numberOfBooks;

    
    public String getBookCode() {
        return bookCode;
    }

    public String getBookType(){
        return bookType;
    }
    
    // คอนสตรักเตอร์ที่รับพารามิเตอร์
    public Book(String bookCode, String bookType, int numberOfBooks) {
        this.bookCode = bookCode;
        this.bookType =bookType;
        this.numberOfBooks = numberOfBooks;
    }

    public int getNumberOfBooks() {
        return this.numberOfBooks;
    }

    public void decreaseNumberOfBooks() {
        this.numberOfBooks--;
    }

    public void borrowingBook(int num){
        this.numberOfBooks = numberOfBooks - 1;
    }

    public String toString() {
        return 
                "bookCode : " + bookCode +
                "\nbookType : " + bookType+
                "\nnumberOfBooks : " + numberOfBooks;
    }
}
