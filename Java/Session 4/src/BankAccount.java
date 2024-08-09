public class BankAccount {
    private String accId;
    private String accName;
    private double accBalance;
    private double[] withdrawals = new double[5];
    private int index = 0;

    public BankAccount(String inAccId, String inAccName) {
        this.accId = inAccId;
        this.accName = inAccName;
        this.accBalance = 0;
    }

    public String toString() {
        return accName + " with account id " + accId + " has a balance of " + accBalance;
    }

    public void setAccName(String newName) {
        accName = newName;
    }

    public void withdraw(double witAmount) {
        if (witAmount > 0) {
            if (witAmount <= accBalance) {
                accBalance -= witAmount;
                System.out.println("Withdrawal successful - Current balance: " + accBalance);
                if (index <= 4){
                    withdrawals[index] = witAmount;
                    index++;
                }
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

    public String getAcctId() {
        return accId;
    }

    public String getAccName() {
        return accName;
    }

    public double getAccBalance() {
        return accBalance;
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
}
