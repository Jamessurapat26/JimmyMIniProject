// import java.util.Calendar;
// import java.util.Date;
public class Student extends Member {
    private String studentID;
    private String studentName;
    // private Date expirationDate;
    // private Date applicationDate;

    public Student() {
    }

    public Student(String memberID,String studentID, String studentName) {
        // super(memberID);
        // Date exDate = new Date();
        this.studentID = studentID;
        this.studentName = studentName;
        // this.expirationDate = exDate;
        // this.applicationDate = addDate(exDate, 5);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // public Date getExpirationDate() {
    //     return expirationDate;
    // }

    // public void setExpirationDate(Date expirationDate) {
    //     this.expirationDate = expirationDate;
    // }

    // public Date getApplicationDate() {
    //     return applicationDate;
    // }

    // public void setApplicationDate(Date applicationDate) {
    //     this.applicationDate = applicationDate;
    // }

    // private Date addDate(Date date,int days){
    //     Calendar calendar = Calendar.getInstance();
    //     calendar.setTime(date);
    //     calendar.add(Calendar.DATE, days);
    //     return calendar.getTime();
    // }

    public String toString() {
        return super.toString()+
                "StudentID : "+studentID+
                "\nStudentName : " + studentName;
                // "\nExpirationDate : "+ expirationDate+
                // "\nAplicationDate : "+ applicationDate;
    }
}