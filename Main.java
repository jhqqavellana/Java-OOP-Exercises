/**
 * Represents the main class.
 */
public class Main {
  /**
 * Represents the main class that tests the BankAccount and SavingsAccount classes.
 */
  public static void main(String[] args) {

    

    //Initialize a new SavingsAccount object with the owner's name
    BankAccount account1 = new SavingsAccount("Test0");
    account1.deposit(1000.125);
    account1.deposit(0);
    account1.deposit(-500);
    account1.withdraw(500);
    account1.withdraw(1500);
    account1.withdraw(-100);
    account1.freezeAccount();
    account1.deposit(11500);
    account1.withdraw(500);
    account1.unfreezeAccount();
    account1.withdraw(100);

  }

}