import java.util.Date;
public class BorrowingBooks {
    private String borrowingCode;
    private String bookCode;
    private Date borrowingDate;
    private Date dateOfReturn;
    private String memberID;

    public BorrowingBooks() {
    }

    public BorrowingBooks(String borrowingCode, String bookCode, Date borrowingDate, Date dateOfReturn, String memberID) {
        this.borrowingCode = borrowingCode;
        this.bookCode = bookCode;
        this.borrowingDate = borrowingDate;
        this.dateOfReturn = dateOfReturn;
        this.memberID = memberID;
    }

    public String getBorrowingCode() {
        return borrowingCode;
    }

    public void setBorrowingCode(String borrowingCode) {
        this.borrowingCode = borrowingCode;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public Date getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(Date borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public Date getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(Date dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    @Override
    public String toString() {
        return "BorrowingBooks{" +
                "borrowingCode='" + borrowingCode + '\'' +
                ", bookCode='" + bookCode + '\'' +
                ", borrowingDate=" + borrowingDate +
                ", dateOfReturn=" + dateOfReturn +
                ", memberID='" + memberID + '\'' +
                '}';
    }
}
