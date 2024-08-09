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
