### Identifiers
- variable names
- cant use reserved words 
- start them with lowercase
#### Underscores in identifiers
- Single starting underscore is a suggestion to developers that the object is for internal use and should not be used outside of the code the identifier belongs to. 
	- Like private in java? maybe?
- Double starting underscore, or dunder, will cause the interpreter to change the name of the variable to avoid collisions
- Dunders at the beginning and end will prevent the name changing, but are reserved for special uses.
- Single ending underscore is used to create a variable with a reserved word when they are the best fit while avoiding conflicts.
### Comments
- Like comments in any programming language
- Use # to make them, or just press ctrl+/ in any ide
### Docstrings
- documentation strings (docstrings) are lines that are used for understanding the functionality of modules or functions
- should be the first statement in your module, or the first statement after an object definition
- at least your modules should have docstrings, as well as any functions or classes that are designed to be used by other modules
Docstring example
```python
'''Docstring'''
```
- doctrings act as a comment, but are also an attribute of the module/functinon/class they are a part of
```python
def square(n):
    '''Takes in a number n, returns the square of n'''
    return n**2

print(square.__doc__)
```
Output:
```
Takes in a number n, returns the square of n
```
### Variables
- well named variables should unambiguously identify the data being stored in the variable.
- Variables with a limited life span dont have to be well named.
	- you can use a single character to indicate it is irrelevant
	- dont name them l (lowercase L), O (uppercase o), or I (uppercase i), due to potential confusion.
- should be lowercase
- use underscores for python
### Constants
- a type of variable, except its not variable
- a variable can be declared anywhere, but constants should be declared in a separate module
- names should be uppercase, separated by underscores
- you can actually reassign a constant, python wont stop you, but dont its silly
### Data types
- python is a **strongly typed** programming language
	- this means that the variables have a data type
	- this data type affects how the variable is handled
- python is also a **dynamically typed** programming language
	- you dont have to specify the data type of variables, python can do this automatically
- strange combination to be honest
- data types of note
	- set
		- unordered collection of values that cannot be modified and does not allow duplicate entries
	- complex
		- a number with a real and imaginary component, like 2x
### Syntax
- Each line is a new statement
- statement can be broken over multiple lines using a backslash at the breakpoint
- you can break lines in a list tuple or dictionary with no backslash
- indentation defines blocks of code
### Request user input
- use the input() function
```python
username = input("please enter your name> ")
```
### Display program output
- use the print() function
```python
print("hello, ", username)
```
Or use f string to include variables
```python
print(f"hello, {username}")
```
### Exercise
[[Python Session 2 - Exercise 1]]