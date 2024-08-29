## Creating objects
#### What happens when an object is initialised?
 - The constructor of class is called
 - Each attribute will be initialised with a value. This value is called 'state'.
 - Each method will become a Behaviour, this behaviour can be called from this object.
#### Constructor
 - A special method (same as a normal method as defined in [[Java Session 2 - Creating a class]]) used to initialise objects.
	 - A constructor method has no return type
	 - A constructor has the same name as the class name
 - Each class has a default constructor if none is specified
	 - Default constructor is non-parametric 
Non-parametric:
```java
public Employee() {
	...
}
```
Parametric:
```java
public Employee(String name, String email, String department, String position) {
	...
}
```
 - Parametric constructors allow you to set values for the object inside the constructor
 - If no values specified, the object will inherit them from the parent class
	 - If the parent class has not specified values for attributes, then they will fall back to the default value
	 - A couple important default values:
		 - numbers = 0
		 - bool = false
		 - object/non-primitive data type = null value
			 - Strings are also non-primitive data types, will not create empty string
Assign values like this:
```java
public Employee(String name, String email, String department, String position) {
	this.name = name;
	this.email = email;
	this.department = department;
	this.position = position;
}
```
Or initialise the value without receiving values from the constructor:
```java
public Employee(String name, String email, String department, String position) {
	this.name = name;
	this.email = email;
	this.department = department;
	this.position = position;
	age = 20;
	employeeID = "CIT000000";
}
```
 - Values initialised without receiving values from the constructor are the same for every object created using this method.
Syntax for creating an object:
```java
[dataType] variableName = new [dataType](parameters);
```
Call the method like this for non parametric constructors:
```java
Employee emp1 = new Employee();
```
And like this for parametric constructors:
```java
Employee emp2 = new Employee("Evelyn", "Evelyn.Zhao@cit.edu.au", "ICT", "teacher");
```
#### The main method
 - The main method is the entry point in any java program
 - It can be in any class, but there should only be one in any one program
Syntax of main method:
```java
public static void main(String[] args) {
	...
}
```
## Manual Testing
 - Just print to the command line lol
Chuck this one into Employee as a method
```java
public void printDetails() {
	System.out.println(name + " is " + age + " and works in " + department + " as " + position);
}
```
 - If you just print the object, java will automatically call toString() in the parent class
 - there is a default toString which prints the memory address but we can overwrite it so it is more useful
```java
public void toString() {
	return name + " is " + age + " and works in " + department + " as " + position;
}
```
## Exercises
[[Java Session 3 exercise 1 - Create student object]]