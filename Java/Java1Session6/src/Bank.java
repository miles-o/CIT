/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Evelyn Zhao
 */
public class Bank {
    private ArrayList<BankAccount> bankAccs = new ArrayList<>();

    public Bank(BankAccount inBankAcc1, BankAccount inBankAcc2, BankAccount inBankAcc3){
        bankAccs.add(inBankAcc1);
        bankAccs.add(inBankAcc2);
        bankAccs.add(inBankAcc3);
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
