public class MyApp {
    public static void main(String[] args) {
        BankAccount bankAcc1 = new BankAccount("74586", "Miles_O");
        System.out.println(bankAcc1);

        bankAcc1.setAccName("Miles O'Hara-Dewhurst");
        System.out.println(bankAcc1);
        System.out.println("The name of bank account is " + bankAcc1.getAccName());

        bankAcc1.withdraw(14.5);
        bankAcc1.deposit(105);
        bankAcc1.withdraw(14.5);
        bankAcc1.withdraw(1);
        bankAcc1.deposit(-100);
        bankAcc1.withdraw(-200);
        System.out.println(bankAcc1);
        bankAcc1.sumOfWithdrawals();
    }
}
