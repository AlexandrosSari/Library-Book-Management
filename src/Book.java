import java.util.Collections;
import java.util.Stack;

public class Book {

    int pages, rentCost;
    String title, writer, publisher;
    boolean isPopular, isReserved=false;

    public static Stack<Customer> waitingList = new Stack<>();

    public Book(){}

    public Book(int pages, int rentCost, String title, String writer, String publisher, boolean isPopular) {
        this.pages = pages;
        this.rentCost = rentCost;
        this.title = title;
        this.writer = writer;
        this.publisher = publisher;
        this.isPopular = isPopular;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getRentCost() {
        return rentCost;
    }

    public void setRentCost(int rentCost) {
        this.rentCost = rentCost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public boolean isPopular() {
        return isPopular;
    }

    public void setPopular(boolean popular) {
        isPopular = popular;
    }


    public void addToWaitingList(Customer customer){
        if(isPopular) waitingList.push(customer);
    }

    //Reversing the stack so I get last in last served requirement.
    public static Customer nextInList(){
        if (!waitingList.empty()) {
            Collections.reverse(waitingList);
            System.out.println("Next in line is "+waitingList.peek().lastName);
            Customer customer = waitingList.pop();
            Collections.reverse(waitingList);
            return customer;
        }
        System.out.println("List is empty.");
        return null;
    }

}
