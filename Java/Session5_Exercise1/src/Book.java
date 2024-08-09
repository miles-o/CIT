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
