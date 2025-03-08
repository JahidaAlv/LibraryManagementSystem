

public class LibrarayManager extends Library {


    @Override
    void addBook(Book book) {
        books.add(book);
        System.out.println("Books Added Successfully");
    }

    @Override
    void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No book Available");
        } else {
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }
    }

    @Override
    Book searchBook(int id) {
//        boolean available = books.contains(id);
//        System.out.println("available");

        for (Book book : books) {
            if (book.getId() == id) {
//                System.out.println(book);
                return book;
            }
        }
        return null;
    }
}
