/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evelyn Zhao
 */
public class BankAccount {
    
    private String accId;
    private String accName;
    private double accBalance;
    private double[] withdraws = new double[5];
    private int index;
    
    public BankAccount(String inAccId, String inAccName){
        accId = inAccId;
        accName = inAccName;
    }
   // @overwriting 
    public String toString(){
        return "The account ID is "+accId+" with name " + accName+ " and balance is " + accBalance;
    }
    
    public void setAccName(String newAccName){
        
        accName = newAccName;
    }
    
    public String getAccName(){
        return accName;
    }
    
    public void withdraw(double witAmount){
        if(witAmount<=accBalance){
            accBalance = accBalance - witAmount;
            
            //store the value of witAmount into withdraws array
            //if the withdraw is successful
            if(index<5){
                withdraws[index] = witAmount;
                index++;
            }
        }else{
            System.out.println("Declined - insufficient balance");
        }
    }
    
    public void deposit(double depAmount){
        
        accBalance = accBalance+depAmount;
    }
    
    public void sumOfWithdraws(){
        //double sum = withdraws[0]+withdraws[1]+withdraws[2]+withdraws[3]+withdraws[4];
        double sum = 0;
        for(int i=0; i<=4; i++){
            sum=sum+withdraws[i];
        }
        System.out.println("The sum of first five withdraws is "+sum);
    }
    
    public double getBalance(){
        return accBalance;
    }
}
