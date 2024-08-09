##### **Part A.**  

 Write a **Book** class for a library system. The **Book** class should match the class diagram below:

![[Untitled.png]]

**Book** objects have as attributes the title and author of the book, they have a boolean value to record if they are currently borrowed, and they have a count of how many times they have been borrowed. 

The constructor for the **Book** has parameters to set title and author, and it sets borrowed to false and borrowedCount to zero.

The **display(  )** method should use **System.out.println(  )** statements to print out the attributes of the book in a nicely formatted way. Use the following code snippet (or something similar) to display whether the book has been borrowed or not:

if (borrowed)  
{  
	System.out.println("Book is currently borrowed");  
}  
else  
{  
	System.out.println("Book is currently not borrowed");  
}

  

 The **getBorrowedCount(  )** method should return the value in the attribute borrowedCount.

The logic for the other two methods is shown in the following diagrams.

**public boolean borrowBook(  )**  

![[Capture4 (1).png]]
 

**public void returnBook(  )**

![[Capture5.png]]

##### **Part B (Testing).**

1.       Create a **Book** object giving it a title and author.  Run the **display(  )** method and it should tell you that it is has been borrowed 0 times and is not borrowed. 

2.       Run the **borrowBook(  )** method and you should get a return value of true.

3.       Run the **borrowBook(  )** method again and you should be told that the book has already been borrowed and get a return value of false.

4.       Run the **returnBook(  )** method. 

5.       Run the **display(  )** method and you should be told that the book has been borrowed once and is not currently borrowed.

6.       Run the **borrowBook(  )** method and you should get a return value of true.

7.       Run the **display(  )** method and you should be told that the book has been borrowed twice and is currently borrowed.

8.       Run the **getBorrowedCount(  )** method and a value of 2 should be returned.

9.       Create a second **Book** object with a different title and author.

10.   Run the **display(  )** method on the second book and make sure that it prints out the second books title and author.

##### **Part C (Debugging).**

Set a break point in your code at the beginning of the **borrowBook()** method.  Run the method twice for the second book and watch how it takes a different path through the if test on each occasion.

```java
public class App {  
    public static void main(String[] args) {  
        Book book1 = new Book("Dune", "Frank Herbert");  
  
        book1.display();  
  
        book1.borrowBook();  
  
        book1.borrowBook();  
  
        book1.returnBook();  
  
        book1.display();  
  
        book1.borrowBook();  
  
        book1.display();  
  
        System.out.println(book1.getBorrowedCount() + "\n");  
  
        Book book2 = new Book("Dune Messiah", "Frank Herbert");  
  
        book2.display();  
    }  
}
```

```java
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
        System.out.println("Displaying info on: " + title + " by " + author + "\nThis book has been borrowed " + borrowedCount + " times");  
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