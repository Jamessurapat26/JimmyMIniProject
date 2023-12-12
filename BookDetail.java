public class BookDetail {
    private String bookId;
    private String bookName;
    private String typeOfBook;
    private int numberOfBooks;  

    public BookDetail(String bookId,String bookname , String typebook, int num){

        this.bookId = bookId;
        this.bookName = bookname;
        this.typeOfBook = typebook;
        this.numberOfBooks = num;

    }

    public String getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public String getTypeOfBook() {
        return typeOfBook;
    }

    
    public String toString() {
        return "BookID : "+bookId+
                "\nBookName : "+bookName+
                "\nTypeOfBook : "+typeOfBook+
                "\nNumberBook : "+numberOfBooks;
    }


}
