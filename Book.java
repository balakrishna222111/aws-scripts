// Book class represents a book with title and author
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

// Library class manages books
class Library {
    private Book[] books;
    private int numberOfBooks;

    public Library(int capacity) {
        books = new Book[capacity];
        numberOfBooks = 0;
    }

    public void addBook(Book book) {
        if (numberOfBooks < books.length) {
            books[numberOfBooks] = book;
            numberOfBooks++;
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    public Book[] getBooks() {
        return books;
    }
}

// LibraryPrinter class is responsible for printing information about books
class LibraryPrinter {
    public void printBooks(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
            }
        }
    }
}

// Main class to demonstrate the Single Responsibility Principle
public class Main {
    public static void main(String[] args) {
        Library library = new Library(3);

        Book book1 = new Book("Book 1", "Author 1");
        Book book2 = new Book("Book 2", "Author 2");
        Book book3 = new Book("Book 3", "Author 3");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        LibraryPrinter printer = new LibraryPrinter();
        printer.printBooks(library.getBooks());
    }
}
