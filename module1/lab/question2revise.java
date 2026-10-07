class bankAccount {
  private String AccountHolder;
  private double AccountBalance;
// both private, we use getters to access these.


public String getAccountHolder(){
  return AccountHolder;
}
public double getAccountBalance(){
  return AccountBalance;
}
// above ones are the getters.

public void setAccountHolder(String AccountHolder){
  this.AccountHolder = AccountHolder;
}
public void setAccountBalance(double AccountBalance){
  if(AccountBalance <= 0){
    System.out.println("Error : Balance is 0.");
  }
  else{
    this.AccountBalance = AccountBalance;
  }
}

public void deposit(double amount){
  if(amount > 0){
    AccountBalance = AccountBalance + amount;
    System.out.println("Amount deposited : " + amount);
  }
}
}

public class question2revise{
  public static void main(String[] args) {
      
      bankAccount b1 = new bankAccount();

      b1.setAccountBalance(12000);
      b1.setAccountHolder("i honestly dk");

      System.out.println("Account Holder : " + b1.getAccountHolder());
      System.out.println("Account Balance : " + b1.getAccountBalance());

  }
}