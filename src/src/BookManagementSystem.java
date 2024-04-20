package Task3;
import java.util.Scanner;

class Book {
    private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

class Library {
    private Book[] books;
    private int size;
    private static final int MAX_CAPACITY = 5;

    public Library() {
        this.books = new Book[MAX_CAPACITY];
        this.size = 0;
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        if (size < MAX_CAPACITY) {
            books[size] = book;
            size++;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    //  remove
    public void removeBook(int bookID) {
        for (int i = 0; i < size; i++) {
            if (books[i].getBookID() == bookID) {
                for (int j = i; j < size - 1; j++) {
                    books[j] = books[j + 1];
                }
                size--;
                System.out.println("Book removed successfully!");
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    //  replace 
    public void replaceBook(int bookID, String newTitle, String newAuthor) {
        for (int i = 0; i < size; i++) {
            if (books[i].getBookID() == bookID) {
                books[i].setTitle(newTitle);
                books[i].setAuthor(newAuthor);
                System.out.println("Book replaced successfully!");
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    //  search 
    public void searchBook(int bookID) {
        for (int i = 0; i < size; i++) {
            if (books[i].getBookID() == bookID) {
                System.out.println("Book found:");
                System.out.println("Title: " + books[i].getTitle());
                System.out.println("Author: " + books[i].getAuthor());
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    //  display 
    public void displayBooks() {
        if (size == 0) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("Books in the library:");
        for (int i = 0; i < size; i++) {
            System.out.println("Book ID: " + books[i].getBookID());
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("Available: " + books[i].isAvailable());
            System.out.println();
        }
    }
}

public class BookManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Replace a book");
            System.out.println("4. Search for a book");
            System.out.println("5. Display all books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addBook(library, scanner);
                    break;
                case 2:
                    removeBook(library, scanner);
                    break;
                case 3:
                    replaceBook(library, scanner);
                    break;
                case 4:
                    searchBook(library, scanner);
                    break;
                case 5:
                    library.displayBooks();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }

  
    public static void addBook(Library library, Scanner scanner) {
        System.out.print("Enter book ID: ");
        int bookID = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        Book newBook = new Book(bookID, title, author);
        library.addBook(newBook);
    }
    public static void removeBook(Library library, Scanner scanner) {
        System.out.print("Enter book ID to remove: ");
        int removeID = scanner.nextInt();
        library.removeBook(removeID);
    }
    public static void replaceBook(Library library, Scanner scanner) {
        System.out.print("Enter book ID to replace: ");
        int replaceID = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter new title: ");
        String newTitle = scanner.nextLine();
        System.out.print("Enter new author: ");
        String newAuthor = scanner.nextLine();
        library.replaceBook(replaceID, newTitle, newAuthor);
    }
    public static void searchBook(Library library, Scanner scanner) {
        System.out.print("Enter book ID to search: ");
        int searchID = scanner.nextInt();
        library.searchBook(searchID);
    }
}
