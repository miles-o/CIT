```java
public class MyApp {
	public static void main(String[] args) { 
		// ^ Program entry, no object is created yet
		BankAccount bankAcc1 = new BankAccount("ID000001", "Your Name");
		// ^ BankAccount object - bankAcc1 is created
		bankAcc1.setAccName("New Account Name");
		// ^ bankAcct1 calls setAccName()
		bankAcc1.withdraw(14.5);
		// ^ bankAcc1 calls withdraw()
		bankAcc1.deposit(105);
		// ^ bankAcc1 calls deposit()
		bankAcc1.withdraw(14.5);
		// ^ bankAcc1 calls withdraw()
	}
//  ^ Program exists, bankAcc1 is destroyed
}
```
## Variables
### Instance variables
- an instance variable is declared inside the class but outside the body of the method
- instance variables are specific to instances, not shared between instances
- Examples
	- accId
	- accName
	- accBalance
### Local variables
- declared inside the body of the method
- can only be used in the method, variable is destroyed after the method is executed
- Examples
	- newName
	- witAmount
	- depAmount
## Debugging and testing
- Debugging is the routine process of locating and removing bugs, errors, or abnormalities from programs
- Testing is the process to prove that a program meets all its requirements at a particular stage of its development
- Debugging only happens **after** testing
### Testing
- One of the requirements of the bank account class is to have the right balance after withdrawal and deposit
- By printing the object we can test the value
### Debugging
- If an error is identified while testing we will debug
#### Steps to debug
- set a breakpoint in the code
	- this will temporarily suspend the program
- use step over/step into/step out to execute the following code
## Array
- A new requirement asks us to store the last 5 withdrawals from the bank account and calculate the sum of these withdrawals
- An array is a data structure that allows a variable to store a fixed number of values.
Empty array syntax:
```java
AccessModifier datatype[] variableName = new datatype[lengthOfArray];
```
Example of array with 10 integers:
```java
private int[] numbers = new int[10];
```
To crate an array with values:
```java
AccessModifier datatype[] variableName = new datatype[]{value1, value2, ...};
```
Example of array with integers:
```java
private int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
```
- you can reference a value in an array by its index
- The index starts at 0 and increments by 1 for the next value
Example assigning 3 to the first value of an array(index 0):
```java
numbers[0] = 3;
```
- you can also fetch a value inside an array using its index
```java
value = numbers[0]
```
Using an array to find sum of withdrawals:
```java
private int index = 0;
// ^ new variable

public void withdraw(double witAmount) {  
    if (witAmount > 0) {  
        if (witAmount <= accBalance) {  
            accBalance -= witAmount;  
            System.out.println("Withdrawal successful - Current balance: " + accBalance);  
            if (index <= 4){  
                withdrawals[index] = witAmount;  
                index++;  
            }  
            // ^ add to array
        } else {  
            System.out.println("Account balance too low");  
        }  
    } else {  
        System.out.println("Withdrawal amount cannot be negative");  
    }  
}

public void sumOfWithdrawals() {  
    double sum = 0;  
    int i = 0;  
    while (i < 4) {  
        if (withdrawals[i] != 0.0) {  
            sum += withdrawals[i];  
            i++;  
        } else {  
            System.out.println("Warning: only " + i + " withdrawals have been taken");  
            break;  
        }  
    }  
    System.out.println(sum);  
}
```
## Exercises
[[Java Session 5 Exercise 1 - Library system]]