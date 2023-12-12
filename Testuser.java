
import java.util.*;
public class Testuser {
    public static void main(String[] args) {

    ArrayList<Member> member = new ArrayList<Member>();
    member.add(new Student("00000","11111","Jimmy"));
    member.add(new Student("00000","11111","Jimmy"));
    member.add(new Student("00000","11111","Jimmy"));
    member.add(new Employee("111111","22222","AAAAAAA","0623502630"));
    for(Member x:member){
       System.out.println( x.toString());
    }

    }
}
