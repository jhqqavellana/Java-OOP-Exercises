/**
 * Represents a bank account with deposit, withdrawal, and freeze operations.
 */
public class BankAccount {
  private double balance;
  private boolean isFrozen;

  /** Creates an account with a zero balance that is not frozen. */
  public BankAccount(String ownerName) {
    this.balance = 0;
    this.isFrozen = false;
  }

  /** Deposits the specified amount if the account is not frozen. */
  public void deposit(double amount) {
    if (isFrozen) {
      System.out.println("Account is FROZEN. Unable to transact.");
      return;
    }
    System.out.printf("Amount deposited: %.2f%n", amount);
    if (amount > 0) {
      balance += amount;
      System.out.printf("Current balance: %.2f%n", balance);
    } else if (amount < 0 || amount == 0) {
      System.out.println("Invalid amount. Must be greater than 0.");
    }
  }

  /** Withdraws the specified amount if the account is not frozen. */
  public void withdraw(double amount) {
    if (isFrozen) {
      System.out.println("Account is FROZEN. Unable to transact.");
      return;
    }
    System.out.printf("Amount withdrawn: %.2f%n", amount);
    if (amount > 0 && amount <= balance) {
      balance -= amount;
    } else if (amount > balance) {
      System.out.println("Insufficient balance.");
    } else {
      System.out.println("Invalid amount. Must be greater than 0");
      return;
    }
  }

  /** Returns the current account balance. */
  public double getBalance() {
    return balance;
  }

  /** Freezes the account. */
  public void freezeAccount() {
    isFrozen = true;
    System.out.println("Account is now FROZEN.");
  }

  /** Unfreezes the account. */
  public void unfreezeAccount() {
    isFrozen = false;
    System.out.println("Account is now UNFROZEN.");
  }
}