class BankAccount{
  String accountHolder;
  double accountBalance;

// getter

public String getaccountHolder(){
  return accountHolder;
}
public double getaccountBalance(){
  return accountBalance;
}

// setter

public void setaccountHolder(String accountHolder){
  this.accountHolder = accountHolder;
}

public void setaccountBalance(double accountBalance){
  this.accountBalance = accountBalance;
}
}

public class module2_2_getter_setter{
  public static void main(String[] args) {
      
      BankAccount a1 = new BankAccount();

      a1.setaccountBalance(10000);
      a1.setaccountHolder("Shahan");

      System.out.println("Account Holder : " + a1.getaccountHolder());
      System.out.println("Account Balance : " + a1.getaccountBalance());
      
  }
}

