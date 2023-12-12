public class Member {
    private String memberID;

    public Member() {
    }

    public Member(String memberID) {
        this.memberID = memberID;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String toString() {
        return "MemberID : "+getMemberID()+"\n";
    }
}