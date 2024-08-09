### Revision
All in notes [[Java Session 1 - Introduction]], [[Java Session 2 - Creating a class]], [[Java Session 3 - From Design to Code]].
[[Java Session 4 - Revision exercise]]
## Accessibility of objects
 - if an access modifier is public, the attribute can be accessed from anywhere
 - if the access modifier is private, the attribute **cannot** be accessed from objects
	 - if you dont want the attribute changed without validation, it should be private
- best practice is to keep them private and use methods to get/set the attribute
	- these methods are called getter/setter methods
![[Pasted image 20240804160604.png]]
Setter method example:
```java
public void setAcctName(String newName) {
	accName = newName;
}
```
Getter method example:
```java
public String getAcctName() {
	return accName;
}
```
Withdraw method:
```java
public void withdraw(double witAmount) {
	if (witAmount <= accBalance) {
		accBalance -= witAmount;
	} else {
		System.out.println("account balance too low");
	}
}
```
E
### Exercises
[[Java Session 4 - Exercise 1]]
[[Java Session 4 - Exercise 2]]