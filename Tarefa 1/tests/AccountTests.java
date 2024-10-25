package tests;

import classes.Account;
import exceptions.InsufficientFundsException;

public class AccountTests {
  public static void test() {

    System.out.println("---------------- Account Tests -----------------");

    Account a1 = new Account("A101", "Tan Ah Teck", 88);
    System.out.println(a1); // toString();
    Account a2 = new Account("A102", "Kumar"); // default balance
    System.out.println(a2);

    // Test Getters
    System.out.println("ID: " + a1.getID());
    System.out.println("Name: " + a1.getName());
    System.out.println("Balance: " + a1.getBalance());

    // Test credit() and debit()
    try {
      a1.credit(100);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println(a1);

    try {
      a1.debit(50);
    } catch (InsufficientFundsException e) {
      System.out.println(e.getMessage());
    }

    System.out.println(a1);

    try {
      a1.debit(500); // debit() error
    } catch (InsufficientFundsException e) {
      System.out.println(e.getMessage());
    }

    System.out.println(a1);

    // Test transfer()
    try {
      a1.transferTo(a2, 100);
    } catch (InsufficientFundsException e) {
      System.out.println(e.getMessage());
    }

    System.out.println(a1);
    System.out.println(a2);

    System.out.println("-----------------------------------------------\n");
  }
}
