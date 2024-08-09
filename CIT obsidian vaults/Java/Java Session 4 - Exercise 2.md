Open the BankAccount class that you wrote. See what happens if you try to deposit or withdraw a negative amount. This should not be allowed to happen. Use if statements to make the following improvements:

1. In the deposit(double depAmount) method test that depAmount is greater than zero. If it is, do the deposit, if not, print out an error message.
2. In the withdraw(double witAmount) method test that withAmount is greater than zero.  If it is, do the withdrawal, if not, print out an error message.
```java
public void withdraw(double witAmount) {  
    if (witAmount > 0) {  
        if (witAmount <= accBalance) {  
            accBalance -= witAmount;  
            System.out.println("Withdrawal successful - Current balance: " + accBalance);  
        } else {  
            System.out.println("Account balance too low");  
        }  
    } else {  
        System.out.println("Withdrawal amount cannot be negative");  
    }  
}  
  
public void deposit(double depAmount) {  
    if (depAmount > 0) {  
        accBalance += depAmount;  
        System.out.println("Deposit successful - Current balance: " + accBalance);  
    } else {  
        System.out.println("Deposit amount cannot be negative");  
    }  
}
```