## Control Structures
- There are three ways your code can be executed
	- Sequentially
		- Statements are executed one after another
	- Selectively
		- Statements are executed only if certain conditions are met
	- Iteratively
		- Statements will executed repeatedly until the stop condition is met
### Match Case
Syntax
```python
match variable:
	case value:
		# statement
	case different_value:
		# statement
```
- match case will go through each case until a valid option is found, an underscore will match with anything, effectively acting as an else statement
```python
x = input("Please enter a menu option> ")
match x:
	case "1":
		print("You have selected option 1")
	case "2":
		print("You have selected option 2")
	case _:
		print("Please select from options 1 or 2")
```
### While loops
Syntax:
```python
while condition:
	# statements
```
### For loops
Syntax:
```python
for item in iterable:
	# statements
```
### Break statement
- break will break any loop instantly
Example:
```python
while True:
	if(input("Select a menu option> ").casefold() == "q"):
		break
print ("I will display if the user enters q/Q")
```
### Continue statement
- will force python to skip over that iteration of the loop 
Example:
```python
results = [50,62,82,92,12,49,100]
for result in results:
	if(result < 50):
		continue
	print (result)
print ("I will only display grades higher than 50")
```
### Practical
[[Python Session 3 - Practical]]