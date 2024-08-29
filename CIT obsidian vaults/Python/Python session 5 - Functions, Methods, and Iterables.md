# Functions
- allow you to break up your program into reusable blocks of code
- extremely versatile
- some will return a result, some will just perform a task
- to call a function:
```python
functionName()
```
 - if additional info is expected put the arguments in the brackets
# Methods
- method is like a function but contained by an object
- will typically only affect the object in question
Syntax:
```python
identifier.methodName()
```
# Indexing
- sometimes we want to refer to a specific instance in an iterable, called an element
- use the index to reference it
- indexes start at 0
To reference index
```python
identifier[index]
```
- python allows negative indexing
	- instead of counting from the left negative indexes will count back from the right
	- negative indexes start at -1
# Slices
- let you look at specific elements within an indexed iterable
```python
variable[start:stop:increment]
```
- stop and increment are optional
```python
var[0:3]
```
- will count starting at 0 and count up until but not including index 3
```python
var[0:3:2]
```
- will start at 0 and count every second value until position 3
- you can use negative indexes to count backwards from the end of the iterable
```python
var[::-1]
```
- will return each element of the car in reverse order
```python 
var[:-4]
```
- will return everything but the last 4 elements
```python
var[-2::1]
```
- will return only the last 2 elements
## Strings
- a sequence of characters
Methods for strings:
![[Screenshot 2024-08-12 at 7.20.15 pm.jpg]]
## Lists
- a sequence of logically related items
- items in a list dont have to be the same datatype
List methods:
![[Screenshot 2024-08-12 at 7.22.07 pm.jpg]]
## Tuples
- like a list, but it is **immutable** 
- this means you cannot modify the tuple after it is created
Methods:
![[Screenshot 2024-08-12 at 7.23.17 pm.jpg]]
## Sets
- like a list but unordered and unindexed
- you cannot have duplicate items
Methods:
![[Screenshot 2024-08-12 at 7.24.12 pm.jpg]]
## Range
- a set of integers
- there are 3 ways to create a range
![[Screenshot 2024-08-12 at 7.25.10 pm.jpg]]
## Sorting
- iterables can be sorted using the sorted() method\
- to avoid issues with tuples and sets sorted() will copy these variables to a new list and sort that list
- list.sort() can be used to sort the original variable instead of copying it