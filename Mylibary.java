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
        member.add(new Student("123450","65123465","Jimmy")) ;

        // displayMember(member.get(0));
        char c ;
        String MemberID;
        Member checkMember = null ;
        int i = 0;
        do {
            displayMenu1();
            System.out.print("Select Choice");
            int choice = sc.nextInt() ;
            switch (choice) {
                case 1:
                    System.out.println("MemberID : ");
                    MemberID = sc.next();
                    checkMember = checkMemberId(MemberID, member);
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
    
    
    }

    public static void displayBorrowing(ArrayList<Book> boo){
        System.out.println(boo.toString());

    }

    public static void displayAllBook(ArrayList<BookDetail> book){
        for (BookDetail b : book){
            System.out.println(b.toString());
        }
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
            if(mem.get(i)instanceof Student){
                if (m.equals(mem.get(i).getMemberID())) {
                    return mem.get(i);
                }
            }
        }

        return null;
    }

    public static void displayUserDetail(Member m){
        if(m instanceof Student){
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
