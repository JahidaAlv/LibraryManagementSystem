import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LibrarayManager manager = new LibrarayManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Adding a book
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine();

                    Book book = new Book(id, title, author);
                    manager.addBook(book);
                    break;

                case 2:
                    // Viewing books
                    manager.viewBooks();
                    break;

                case 3:
                    // Searching for a book
                    System.out.print("Enter Book ID to Search: ");
                    int searchId = scanner.nextInt();
                    Book foundBook = manager.searchBook(searchId);

                    if (foundBook != null) {
                        System.out.println("Book Found:");
                        foundBook.toString();
                    } else {
                        System.out.println("Book Not Found!");
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting the Library System. Goodbye!");

                    return;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}