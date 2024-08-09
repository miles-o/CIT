/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evelyn Zhao
 */
public class Bank {
    private BankAccount[] bankAccs = new BankAccount[3];
    
    public Bank(BankAccount inBankAcc1, BankAccount inBankAcc2, BankAccount inBankAcc3){
        bankAccs[0]=inBankAcc1;
        bankAccs[1]=inBankAcc2;
        bankAccs[2]=inBankAcc3;
    }
    
    public void getTotalBalance(){
        double totalBalance = 0;
        for(BankAccount ba: bankAccs){
            totalBalance+=ba.getBalance();
        }
        
        System.out.println("The total balance is "+totalBalance);
    }
    
    public void printAllBalances(){
        for(BankAccount ba: bankAccs){
            System.out.println(ba);
        }
    }
}
