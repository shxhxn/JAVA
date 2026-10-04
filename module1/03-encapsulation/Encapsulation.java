class Account {
 private double balance; // private field - hidden from outside
 // getter
 public double getBalance() {
 return balance; // Since balance is private, it cannot be accessed directly as acc.balance from outside the class — it ca
 }               // only be read or changed through getBalance() and setBalance(), which keeps the data safe and validated.

 // setter with validation
 public void setBalance(double balance) {
 if (balance >= 0) {
 this.balance = balance;
 } else {
 System.out.println("Balance cannot be negative");
 }
 }
}
public class Encapsulation {
 public static void main(String[] args) {
 Account acc = new Account();
 acc.setBalance(5000);
 System.out.println("Balance: " + acc.getBalance());
 acc.setBalance(-200); // rejected by validation logic
 }
}
