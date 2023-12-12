
import java.util.*;
public class Testuser {
    public static void main(String[] args) {

    Date expirationDate = new Date();


    ArrayList<Student> member = new ArrayList<Student>();
    member.add(new Student("00000","11111","Jimmy"));
    member.add(new Student("00000","11111","Jimmy"));
    member.add(new Student("00000","11111","Jimmy"));
    for(Student x:member){
       System.out.println( x.toString());
    }

    }
    }
