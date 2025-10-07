import java.util.ArrayList;
import java.util.Vector;

public class Library {
    ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();

    static Vector<String> eventLog = new Vector<>();

    public Library(){}

    //adds new book
    public void addBook(Book book){
        books.add(book);
    }
    //action return
    public static void returnedBook(Book book){
        eventLog.add(book.title+" returned.");
        books.add(book);
    }

    //action borrow
    public static boolean borrowedBook(Book book){
        if(books.contains(book) && !book.isReserved){
            Book toBeBorrowed = books.stream()
                    .filter(n->n.equals(book))
                    .findFirst()
                    .orElse(null);
            books.remove(toBeBorrowed);
            eventLog.add(book.title+" borrowed.");
            return true;
        }else {
            System.out.println("Book is not available for borrowing.");
            return false;}

    }

    //action reserve
    public void reserveBook(Book book){
        if (books.contains(book)){
            eventLog.add(book.title+" is reserved.");
            book.setReserved(true);
        }
    }

}
