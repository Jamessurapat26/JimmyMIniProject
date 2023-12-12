public class Employee extends Member{
    private String employeeID;
    private String employeeName;
    private String address;
    private String phoneNumber;

    public Employee() {
    }

    public Employee(String memberID,String employeeID, String employeeName, String address, String phoneNumber) {
        super(memberID);
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return  super.toString()+
                "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
