## Defining the class
When defining a class you need to include the access modifier and class name
```java
[access modifier] class [ClassName] {
	...
}
```
The access modifier defines the accessibility of the class
* can be public or private
	* public can be accessed by other classes
	* private cannot be accessed by other classes
* Start ClassName with a capital
## Claiming an attribute in a class
```java
[access modifier][data type][attributeName];
public int id;
```
Access modifier can be public/protected/private
* private can only be accessed within the class
* public can be accessed anywhere within the program
* protected is not explained
Data type defines the data type
* can be a primitive data type
	* specifies the size and type of the value
	* no additional methods
	* byte
	* short
	* long
	* int
	* float
	* double
	* boolean
	* char
* non-primitive data types
	* non primitive data type is a class
		* string 
		* date
		* etc.
	* provides methods from within the pre defined class
Attribute name
* start with lower case
### Syntax for UML diagram
[[Java Session 1 - Introduction#Unified Modelling Language (UML)]]




| Employee                                                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| +employeeID: String<br>+name: String<br>+age: int<br>+address: String<br>+contactNumber: String<br>+email: String<br>+department: String<br>+position: Sting |
| changeInformation<br>createProfile                                                                                                                           |

## Claiming a method
* like a function
```java
[access modifier] [return type] [methodName] ([parameters]) {
	...
}
public int sumOfTwoNumbers (int num1, int num2) {
	...
}
```
Access modifier
* define the accessibility of the method
* can be public/protected/private
Return type
* defines the data type of the returned value
* can be primitive or non-primitive
* if no return type is provided it will return void
Method name
* start with lowercase
Parameters
* define datatype and name that will be used inside the method
* seperated by a comma
### Syntax for UML diagram
More on UML diagrams in [[Java Session 1 - Introduction]]

| Employee                                                                                                                                                             |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| + employeeID: String<br>+ name: String<br>+ age: int<br>+ address: String<br>+ contactNumber: String<br>+ email: String<br>+ department: String<br>+ position: Sting |
| + changeInformation(String info): void<br>+ Employee(String name, String email, <br>String department, String position)                                              |
### UML diagram in action
```java
public class Employee {
	public String employeeID;
	public String name;
	public int age;
	public String address;
	public String contactNumber;
	public String email;
	public String department;
	public String position;
	
	public void changeInformation(String info) {
		...
	}
	
	public Employee(String name, String email, String department, String position) {
		...
	}
}
```

#### Code written in this class
all code and UML diagrams from this session can be found at [[Java Session 2 - Code]]

### Exercises
[[Java Session 2 exercise 1 - Create student UML diagram]]
[[Java Session 2 exercise 2 - Create student class]]