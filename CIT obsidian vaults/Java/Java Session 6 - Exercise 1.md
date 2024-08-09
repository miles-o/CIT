### Library class

You wrote a Book class in the last week exercise. This week, you need to add a library class to your library system.

![[Library class.png]]

The Library class should match the UML class diagram below


1. Initialise numBooks to zero when it is declared.
2. As the library constructor does nothing (no initialisation), delete it from the code – the implicit constructor will be used.
3. The getTotalBorrowings() method should add up and print the total number of borrowings by calling the getBorrowedCount() method of each Book object using a "for" loop with index values from zero up to but not including numBooks.
4. The printAllBooks() method should print out a heading and then display the details of all books by calling each Book objects display() method using a "for" loop with index values from zero up to but not including numBooks.
```java
public class App {  
    public static void main(String[] args) {  
        Book book1 = new Book("Dune", "Frank Herbert");  
        Book book2 = new Book("Dune Messiah", "Frank Herbert");  
        Library library = new Library();  
        library.addBook(book1);  
        library.addBook(book2);  
  
        book1.borrowBook();  
        book1.returnBook();  
        book1.borrowBook();  
        book2.borrowBook();  
        library.getTotalBorrowings();  
        library.printAllBooks();  
    }  
}

public class Library {  
    private int numBooks = 0;  
    private final int MAX_BOOKS = 4;  
    private Book[] books = new Book[MAX_BOOKS];  
  
    public void addBook(Book inBook) {  
        if (numBooks < MAX_BOOKS) {  
            books[numBooks] = inBook;  
            numBooks++;  
        } else {  
            System.out.println("Error - Library is full");  
        }  
  
    }  
  
    public void getTotalBorrowings() {  
        int totalBorrowings = 0;  
        for (int i = 0; i < numBooks; i++) {  
            totalBorrowings += books[i].getBorrowedCount();  
        }  
        System.out.println("There has been a total of " + totalBorrowings + " borrowings");  
    }  
  
    public void printAllBooks() {  
        System.out.println("All books currently in library:\n");  
        for (int i = 0; i < numBooks; i++) {  
            books[i].display();  
        }  
    }  
}

public class Book {  
    private String title;  
    private String author;  
    private Boolean borrowed;  
    private int borrowedCount;  
  
    public Book(String inTitle, String inAuthor) {  
        this.title = inTitle;  
        this.author = inAuthor;  
        this.borrowed = Boolean.FALSE;  
        this.borrowedCount = 0;  
    }  
  
    public void display() {  
        System.out.println(title + " by " + author + "\nThis book has been borrowed " + borrowedCount + " times");  
        if (borrowed){  
            System.out.println("Book is currently borrowed\n");  
        } else {  
            System.out.println("Book is not currently borrowed\n");  
        }  
    }  
  
    public int getBorrowedCount() {  
        return  borrowedCount;  
    }  
  
    public boolean borrowBook() {  
        if (borrowed) {  
            System.out.println("Book is already borrowed\n");  
            return Boolean.FALSE;  
        } else {  
            borrowedCount++;  
            borrowed = Boolean.TRUE;  
            System.out.println("Book borrowed successfully\n");  
            return Boolean.TRUE;  
        }  
    }  
  
    public void returnBook() {  
        if (borrowed) {  
            borrowed = Boolean.FALSE;  
            System.out.println("Returned successfully\n");  
        } else {  
            System.out.println("Book is not borrowed\n");  
        }  
    }  
}
```