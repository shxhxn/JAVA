class bankAccount {
  private String accountHolder;
  private double accountBalance;
// important word in the above class data is "private".
// main cannot be used to make changes to accountBalance.
// like this is not possible : 
// bankAccount b1 = new bankAccount;
// b1.accountBalance = 10000;  not possible with main()

public String getaccountHolder(){
  return accountHolder;
}

public double getBalance(){
  return accountBalance;
}
// the above is the "getter" method., it basically returns the value of private variable.
// when we write System.out.println(acc.getBalance -> we can print this without main()


public void setaccountHolder(String accountHolder){ // basically think of it like this, if data values are private, 
  this.accountHolder = accountHolder;//we cant access it normally, instead we have to use public void thing.
}
public void setaccountBalance(double accountBalance){
  if(accountBalance <= 0){
    System.out.println("Error : your balance cannot be negative.");
  }
  else{
    this.accountBalance = accountBalance;
  }
}
public void deposit(double amount){
  if(amount > 0){
    accountBalance = accountBalance + amount;
    System.out.println("Amount deposited : " + amount);
  } 
}
}

public class question2{
  public static void main(String[] args) {
      bankAccount b1 = new bankAccount();

      //now we use getters and setters to initialize

      // using setters to initialize : 
      b1.setaccountHolder("Shahan Samar");
      // using getters to get the name. 
      System.out.println("Account Holder : " + b1.getaccountHolder());

      // using setters to initialize account balance now.
      b1.setaccountBalance(10000);
      // using getters to get the value.
      System.out.println("Account Balance : " + b1.getBalance());
  }
}

