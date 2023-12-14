public class Employee extends Member{
    private String employeeID;
    private String employeeName;
    private String phoneNumber;

    public Employee() {
    }

    public Employee(String memberID,String employeeID, String employeeName, String phoneNumber) {
        super(memberID);
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.phoneNumber = phoneNumber;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return  super.toString()+
                "employeeID : " + employeeID +
                "\nemployeeName :" + employeeName  +
                "\nphoneNumber : " + phoneNumber ;
    }
}
