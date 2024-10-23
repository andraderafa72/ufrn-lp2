package classes;
import exceptions.InsufficientFundsException;

public class Account {

  private String id;
  private String name;
  private int balance = 0;

    public Account(String id, String name){
    this.id = id;
    this.name = name;
  }

  public Account(String id, String name, int balance){
    this.id = id;
    this.name = name;
    this.balance = balance;
  }

  public String getID(){ return this.id; }
  public String getName(){ return this.name; }
  public int getBalance(){ return this.balance; }

  public int credit(int amount){ 
    if(amount == 0) return this.balance;

    if(amount < 0)
      throw new IllegalArgumentException("Amount must be non-negative");

    this.balance += amount;
    return this.balance;
  }

  public int debit(int amount) throws InsufficientFundsException{ 
    if(amount == 0) return this.balance;

    this.validateDebitAmount(amount);

    this.balance -= amount;
    return this.balance;
  }

  public void transferTo(Account other, int amount) throws InsufficientFundsException{ 
    if(amount == 0) return;
    this.validateDebitAmount(amount);

    this.balance -= amount; 
    other.credit(amount);
  }

  @Override
  public String toString(){
    return "Account[id=" + this.id + ",name="+ this.name + ",balance=" + this.balance + "]";
  }

  private void validateDebitAmount(int amount) throws InsufficientFundsException {
    if(amount < 0)
      throw new IllegalArgumentException("Amount must be non-negative");
    if(this.balance < amount)
      throw new InsufficientFundsException("Amount exceeded balance");
  }
}