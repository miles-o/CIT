- Create BankAccount class from a UML class diagram, and create an BankAccount object named ‘bankAcc1’
![[Pasted image 20240804154122.png]]
```java
public class BankAccount {  
    public String accId;  
    public String accName;  
    public double accBalance;   
  
    public String toString() {  
        return accName + " with account id " + accId + " has a balance of " + accBalance;  
    }  
}
```
 - Overwrite toString() in BankAccount class and Print bankAcc1
``` java
public class BankAccount {  
    public String accId;  
    public String accName;  
    public double accBalance;  
  
    public BankAccount(String inAccId, String inAccName) {  
        this.accId = inAccId;  
        this.accName = inAccName;  
        this.accBalance = 0;  
    }  
  
    public String toString() {  
        return accName + " with account id " + accId + " has a balance of " + accBalance;  
    }  
}
```
```java
public class MyApp {  
    public static void main(String[] args) {  
        BankAccount bankAcct1 = new BankAccount("74586", "Miles_O");  
        System.out.println(bankAcct1);  
    }  
}
