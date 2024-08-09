## UML diagrams
More on UML diagrams in [[Java Session 1 - Introduction]]

| Employee                                                                                                                                                             |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| + employeeID: String<br>+ name: String<br>+ age: int<br>+ address: String<br>+ contactNumber: String<br>+ email: String<br>+ department: String<br>+ position: Sting |
| + changeInformation(String info): void<br>+ createProfile(String name, String email, <br>String department, String position): void                                   |
From [[Java Session 2 exercise 1 - Create student UML diagram]]:
![[Pasted image 20240804004837.png]]
## Syntax templates
#### Defining a class
```java
[access modifier] class [ClassName] {
	...
}
```
#### Claiming an attribute in a class
```java 
[access modifier][data type][attributeName];
public int id;
```
#### Claiming a method in a class
```java
[access modifier] [return type] [methodName] ([parameters]) {
	...
}
public int sumOfTwoNumbers (int num1, int num2) {
	...
}
```
## Code using UML diagram as template
### Employee class
From [[Java Session 2 - Creating a class]]
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
       //implementation of the method  
    }  
  
    public void createProfile(String name, String email, String department, String position) {  
       //implementation of the method  
    }  
}
```
### Student class
From [[Java Session 2 exercise 2 - Create student class]]
```java
public class Student {  
    public String studentID;  
    public String firstName;  
    public String lastName;  
    public String email;  
    public String certificate;  
    public Boolean partTime;  
 
    public Boolean checkStudyStatus() {  
        return partTime;  
    }  
}
```
### Full notes for session 2 at [[Java Session 2 - Creating a class]]
