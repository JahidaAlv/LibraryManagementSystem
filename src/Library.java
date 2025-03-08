import java.util.ArrayList;

abstract class Library {

    protected ArrayList<Book> books = new ArrayList<>();

    abstract void addBook(Book book);

    abstract void viewBooks();

    abstract Book searchBook(int id);
}
