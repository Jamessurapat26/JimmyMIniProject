import java.util.Calendar;
import java.util.Date;
public class BorrowingBooks extends Book{
    private String borrowingCode;
    private Date borrowingDate;
    private Date dateOfReturn; 
    private String bookName;
    private String bookType;
    private String type; 

    public BorrowingBooks(String bookCode, String bookType, int numberOfBooks) {
        super(bookCode, bookType, numberOfBooks);
        this.bookType = bookType; // กำหนดค่า bookType ในคลาส BorrowingBooks
        Date exDate = new Date();
        this.borrowingDate = exDate;
        this.dateOfReturn = addDate(exDate, 5);
    }
    
    public BorrowingBooks(String bookCode, String bookType, String bookName, int numberOfBooks) {
        super(bookCode, bookType, numberOfBooks);
        this.bookType = bookType; // กำหนดค่า bookType ในคลาส BorrowingBooks
        this.bookName = bookName; // กำหนดค่าชื่อหนังสือ
        Date exDate = new Date();
        this.borrowingDate = exDate;
        this.dateOfReturn = addDate(exDate, 5);
    }

    // เมทอดสำหรับดึงชื่อหนังสือ
    public String getBookName() {
        return bookName;
    }

    public String getType() {
        return this.type;
    }

    
    public String getBorrowingCode() {
        return borrowingCode;
    }

    public void setBorrowingCode(String borrowingCode) {
        this.borrowingCode = borrowingCode;
    }

    public Date getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(Date borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public void setDateOfReturn(Date dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public Date getDateOfReturn() {
        return dateOfReturn;
    }

    private Date addDate(Date date,int days){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, days);
        return calendar.getTime();
    }

    public String toString() {
        return  super.toString()+
                "\nborrowingDate : " + borrowingDate +
                "\nReturnBook : " + dateOfReturn ;
    }
}
