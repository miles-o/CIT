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
