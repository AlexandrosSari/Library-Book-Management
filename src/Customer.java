import java.util.LinkedList;

public class Customer {
    String name, lastName;
    int numberOfBorrowedBooks;
    final int id;

    LinkedList<Book> borrowedBooks = new LinkedList<>();

    public Customer(){
        this.id = Integer.parseInt(null);
    }

    public Customer(int id, String lastName, String name) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        numberOfBorrowedBooks = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfBorrowedBooks() {
        return numberOfBorrowedBooks;
    }

    public int getId() {
        return id;
    }

    public void borrowBook(Book book){
        if (Library.borrowedBook(book)) {
            numberOfBorrowedBooks++;
            borrowedBooks.add(book);
            System.out.println(book.title+" is borrowed");
        }
    }

    public void returnBook(Book book){
        if (borrowedBooks.contains(book)){
            borrowedBooks.remove(book);
            Library.returnedBook(book);
            System.out.println("Book returned.");
        }else System.out.println("Book could not be returned.");
    }

    public void recenltyBorrowedBooks(){
        if (numberOfBorrowedBooks>=5){
            for (int i=0;i<5;i++){
                numberOfBorrowedBooks--;
                borrowedBooks.remove();
            }
        }else System.out.println("Limit of 5 books have not been reached yet.");
    }

}
