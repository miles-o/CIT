/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evelyn Zhao
 */
public class MyApp {
    
    public static void main(String[] args){
        BankAccount bankAcc1 = new BankAccount("ID000001", "Evelyn Zhao");
        System.out.println(bankAcc1);
        
        bankAcc1.setAccName("Wanqi Zhao");
        System.out.println(bankAcc1);
        System.out.println("The name of bankAcc1 is " + bankAcc1.getAccName());
        
        bankAcc1.withdraw(10);
        bankAcc1.deposit(100.4);
        bankAcc1.withdraw(10);
        System.out.println(bankAcc1);
        
        bankAcc1.sumOfWithdraws();
        
        BankAccount bankAcc2 = new BankAccount("ID000002", "David"); 
        
        bankAcc2.deposit(30);
        BankAccount bankAcc3 = new BankAccount("ID000003", "Peter");
        bankAcc3.deposit(50);
        
        Bank bank1 = new Bank(bankAcc1, bankAcc2, bankAcc3);
        bank1.getTotalBalance();
        bank1.printAllBalances();
        
    }
    
}
