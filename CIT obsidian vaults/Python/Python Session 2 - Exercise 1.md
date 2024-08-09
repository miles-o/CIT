### Inserting the Docstring

The very first thing that should appear in main.py is the Docstring (or Documentation string) to explain the purpose of the program. We’re going to make a program that will ask the user to enter their name, and then greet them.

1. On **line 1** of **main.py**, enter three quotation marks ("""), then press Enter to go down a line.
2. On **line 2**, enter a summary of what the program will do.
3. Leave **line 3 blank**. This blank line will separate information about the program from information about the program’s creation.
4. On **line 4**, enter **Created by:** followed by your name (for example, Created by: Declan Hester)
5. On **line 5**, enter **Created on:** followed by the current date (for example, Created on: 1/02/2022)
6. On **line 6**, enter **Last edited:** followed by the current date. Any time that you work on this file, you should update this date.
7. On **line 7**, close your docstring by entering another three quotation marks (""").
8. Leave **line 8 blank**.

This docstring tells other developers what they can expect the program to do, who made the program, when the program was created, and when the program was last edited. This information is useful because it can give a contact point if there are issues in the code, and it can help developers identify if the code they’re looking at is outdated or not.
### Requesting data from the user

To create a variable, the basic syntax is variable_name = value.

1. On **line 9**, create a variable called **input_**, and assign it a value of **''** (two apostrophes/single quotes). This will create the variable and let the developer know that it will be used to store a string – text data.  
    Note: We must include _ at the end of the variable name because input is a reserved word.  
    To request input from the user, we use a basic function called input. Remember from this week’s reading that we should include a message that will be shown to the user so that they know they must do something.  
      
    
2. On line 9, replace the value being assigned to input_ with **input('What is your name?> ')  
      
    **
3. Open the **Run** menu, then click **Run Module** (or simply press **F5**).  
      
    
4. If you’re asked **OK** **to** **Save?**, click **OK**.
### Showing output to the user

Great! So, we can see that the shell will ask us what our name is, but after we type our name and press enter, nothing happens. Why?

Because all we’ve done is assign the response we gave to a variable. We’ve not done anything with the variable yet. To show something on the screen, we use the print function.

1. Because we ran our code, we’ve been taken to the shell. Click in the **main.py** window or hold down the **ALT** key while you press the **TAB** key. Keep holding the ALT key and pressing the TAB key until the main.py window is highlighted.
2. On line 10, type enter **print('Hello, ')**
3. On line 11, type enter **print(input_)**
4. **Save** your program and **run** it again.  
    Fantastic! We can see that the program will say Hello, and it will include our name. But it’s done it over two lines. That’s because we’ve used the print function twice. How can we put our code on one line?  
    There are two ways that we can do it. The first way is by using an expression to concatenate (join) our two strings together, and the second way is by passing multiple arguments to the print function.
5. Return to main.py
6. **Delete line 11**.
7. On **line 10**, update your code to be **print('Hello, ' + input_)**
8. **Save** your program and **run** it again.  
    This creates an expression where the result of input_ is added to the end of the string 'Hello, '
9. Return to **main.py**
10. On **line 10**, update your code to be **print('Hello,',input_)**
11. **Save** your program and **run** it again.

When passing multiple arguments into the print function (in this case, our 'Hello,' string and our input_ variable), the print function will automatically concatenate the arguments when possible. Also note that even though we removed the space in our string, there’s still a space in ‘Hello, name’. When passing multiple arguments to the print function, the print function will automatically separate them with a space.
### Challenge questions

Each of your practical activities will have challenge questions where you can test the skills and knowledge that you have learned this session and in the previous sessions while being given minimal direction.

Challenge 1: Ask the user what course they are studying.

Challenge 2: Tell the user what course they are studying.

Challenge 3: Complete Challenge 1 and Challenge 2 using a single line of code.

```python 
"""  
Summary of what the program will do  
  
Created by: Miles O'Hara-Dewhurst  
Created on: 5/8/2024  
Last edited: 5/8/2024  
"""  
  
name = input("What is your name> ")  
print(f"hello {name}")  
  
print("You are studying " + input("What course are you studying "))
```