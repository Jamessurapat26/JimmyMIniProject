import java.util.Calendar;
import java.util.Date;
public class BorrowingBooks extends Book{
    private String borrowingCode;
    private Date borrowingDate;
    private Date dateOfReturn; 
    public BorrowingBooks(String bookCode, String bookType, int numberOfBooks) {
        super(bookCode, bookType, numberOfBooks);
        Date exDate = new Date();
        this.borrowingDate = exDate;
        this.dateOfReturn = addDate(exDate, 5);
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
