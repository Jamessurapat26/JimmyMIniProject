import java.util.*;

public class Mylibary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Book> borrowingBooks = new ArrayList<Book>();

        ArrayList<BookDetail> book = new ArrayList<BookDetail>();
        book.add(new BookDetail("10001", "To Kill a Mockingbird",  "Harper Lee", "Novels and literature",20));
        book.add(new BookDetail("20001", "The Innovators",  "Walter Isaacson", "Technology",20));
        book.add(new BookDetail("30001", "The Death and Life of the Great American School System",  "Diane Ravitch", "Education",20));
        book.add(new BookDetail("40001", "Sapiens: A Brief History of Humankind",  " Yuval Noah Harari ", "Business",20));
        book.add(new BookDetail("50001", "Being Mortal: Medicine and What Matters in the End",  "Atul Gawande ", "Health",20));
        
        // displayAllBook(book);
        ArrayList<Member> member = new ArrayList<Member>();
        member.add(new Student("10001","65100001","AAAAA")) ;
        member.add(new Student("10002","65100002","BBBBB")) ;
        member.add(new Student("10003","65100003","CCCCC")) ;
        member.add(new Student("10004","65100004","DDDDD")) ;
        member.add(new Employee("10005", "500001", "EEEEE", "062-0000001"));
        member.add(new Employee("10006", "500002", "FFFFF", "062-0000002"));
        member.add(new Employee("10007", "500003", "GGGGG", "062-0000003"));
        member.add(new Employee("10008", "500004", "HHHHH", "062-0000004"));
        // displayMember(member.get(0));
        char c ;
        String memberID;
        Member checkMember = null ;
  
        do {
            displayMenu1();
            System.out.print("Select Choice");
            int choice = sc.nextInt() ;
            switch (choice) {
                case 1:
                    System.out.print("MemberID : ");
                    memberID = sc.next();
                    checkMember = checkMemberId(memberID, member);
                    displayUserDetail(checkMember);
                    break;

                case 2 ://borrowing book 
                    displayAllBook(book);
                    System.out.print("Choose BookID : ");
                    String bookid = sc.next();
                    BookDetail mybookID = compareBookID(bookid,book);
                   displayBook(mybookID);
                   borrowing(mybookID, borrowingBooks);
                   displayBorrowing(borrowingBooks);
                   displayBook(mybookID);

            
                default:
                    break;
            }



            System.out.print("You want to continue [y/n] : ");
            c = sc.next().charAt(0);

        } while (c == 'y'||c == 'Y');
    
        sc.close();
    }

    public static void displayBorrowing(ArrayList<Book> boo){
        System.out.println(boo.toString());

    }

    public static void displayAllBook(ArrayList<BookDetail> book){
        for (BookDetail b : book){
            System.out.println(b.toString());
        }
        System.out.println("==========================");
    }
    public static void displayBook(BookDetail b){
        System.out.println(b.toString());
    }

    public static void displayMenu1(){
        System.out.println("1.Check Member");
        System.out.println("2.Borowwing Book");
    }

    public static Member checkMemberId(String m ,ArrayList<Member> mem){
        for(int i = 0 ; i < mem.size() ; i++){
            if(m.equals(mem.get(i).getMemberID())){
                return mem.get(i);
            }
            // if(mem.get(i)instanceof Student){
            //     if (m.equals(mem.get(i).getMemberID())) {
            //         return mem.get(i);
            //     }
            // }
            // if(mem.get(i)instanceof Employee){
            //     if (m.equals(mem.get(i).getMemberID())) {
            //         return mem.get(i);
            //     }
            // }
        }

        return null;
    }

    public static void displayUserDetail(Member m){
        if(m instanceof Student){
            System.out.println("==========================");
            System.out.println(m.toString());
        }
        if(m instanceof Employee){
            System.out.println("==========================");
            System.out.println(m.toString());
        }
    }

    public static void displayMember(Member m){
        System.out.println(m.toString());
    }

    public static BookDetail compareBookID(String id,ArrayList<BookDetail> book){
        for(BookDetail b : book){
            if(id.equals(b.getBookId())){
                return b;
            }
        }
        return null;
    }

    public static void borrowing(BookDetail bookDetail ,ArrayList<Book> boo){
        boo.add(new BorrowingBooks(bookDetail.getBookId(), bookDetail.getTypeOfBook(), bookDetail.getNumberOfBooks()-1));
        bookDetail.setNumberOfBooks(bookDetail.getNumberOfBooks()-1);


    }
}
