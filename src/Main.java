import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**Book book1 = new Book(101, 320, "The Silent Forest", "Alice Monroe", "HarperCollins", true);
        Book book2 = new Book(102, 250, "Winds of Tomorrow", "David King", "Penguin Books", false);
        Book book3 = new Book(103, 410, "Echoes of the Past", "Maria Evans", "Random House", true);
        Book book4 = new Book(104, 180, "Journey to the West", "Chen Li", "Oxford Press", true);
        Book book5 = new Book(105, 290, "Crimson Horizon", "Jake Turner", "Bloomsbury", false);
        Book book6 = new Book(106, 365, "Shadows of Eternity", "Lena Cross", "Macmillan", true);
        Book book7 = new Book(107, 210, "The Glass Kingdom", "Robert Hughes", "Simon & Schuster", false);
        Book book8 = new Book(108, 480, "Ocean's Whisper", "Nina Patel", "Hachette", true);
        Book book9 = new Book(109, 275, "Through the Ember Gate", "Carlos Rivera", "Vintage Books", true);
        Book book10 = new Book(110, 330, "Fragments of Time", "Sophie Laurent", "Doubleday", false);

        //task 1
        System.out.println("============================");

        Library library = new Library();

        Library.books.add(book1);
        Library.books.add(book2);
        Library.books.add(book3);
        Library.books.add(book4);
        Library.books.add(book5);
        Library.books.add(book6);
        Library.books.add(book7);
        Library.books.add(book8);
        Library.books.add(book9);
        Library.books.add(book10);

        Iterator<Book> itr = Library.books.iterator();

        while (itr.hasNext()){
            Book book = itr.next();
            System.out.println(book.title);
        }

        //task 2
        System.out.println("============================");

        Customer customer1 = new Customer(1, "Anderson", "Emily");
        Customer customer2 = new Customer(2, "Patel", "Ravi");
        Customer customer3 = new Customer(3, "Garcia", "Sofia");
        Customer customer4 = new Customer(4, "Thompson", "Liam");
        Customer customer5 = new Customer(5, "Kowalski", "Marta");

        customer1.borrowBook(book1);
        customer1.borrowBook(book2);
        customer1.borrowBook(book3);
        customer1.borrowBook(book4);
        customer1.borrowBook(book5);
        customer1.borrowBook(book6);

        System.out.println("Number of borrowed books by "+customer1.lastName+" is "+customer1.numberOfBorrowedBooks);

        customer1.recenltyBorrowedBooks();

        System.out.println("Number of borrowed books by "+customer1.lastName+" is "+customer1.numberOfBorrowedBooks);

        //task 3
        System.out.println("============================");

        book2.addToWaitingList(customer1);
        book2.addToWaitingList(customer2);
        book2.addToWaitingList(customer3);

        book3.addToWaitingList(customer1);
        book3.addToWaitingList(customer5);
        book3.addToWaitingList(customer4);

        book1.addToWaitingList(customer2);
        book1.addToWaitingList(customer1);
        book1.addToWaitingList(customer5);

        System.out.println("Waiting list size: "+Book.waitingList.size());
        Book.nextInList();
        System.out.println("Waiting list size: "+Book.waitingList.size());

        //task 4
        System.out.println("============================");

        customer1.returnBook(book2);
        customer1.returnBook(book3);

        library.reserveBook(book1);
        customer3.borrowBook(book1);
    **/
    }
}