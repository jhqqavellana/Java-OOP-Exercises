/**
 * Represents a Savings Account with owner setter and getter.
 */
public class SavingsAccount extends BankAccount {
  public String ownerName;

  public SavingsAccount(String ownerName) {
    this.ownerName = ownerName;
  }

  public void getOwnerName() {
    System.out.println("Owner Name: " + ownerName);
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }
  
}
