import java.util.*;

class BankAccount {
  int accountNumber;
  String name;
  int balance;
  final int minBalance = 100;

  private boolean checkMinBalance(int amount) {
    if (balance - amount <= minBalance) {
      return false;
    } else {
      return true;
    }
  }

  // Fill the code here
  BankAccount(int accountNumber, String name, int balance) {
    this.accountNumber = accountNumber;
    this.name = name;
    this.balance = balance;
  }

  int deposit(int amount) {
    balance += amount;
    return balance;
  }

  void balance() {
    System.out.println(balance);
  }

  void withdraw(int amount) {
    if (checkMinBalance(amount)) {
      balance -= amount;
    } else {
      System.out.println("Transaction failed");
    }
  }
}


public class Gpa7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int amnt = sc.nextInt();
    int amnt1 = sc.nextInt();
    BankAccount b = new BankAccount(1890, "rahul", 1000);
    b.deposit(amnt);
    b.balance();
    b.withdraw(amnt1);
    b.balance();
  }

}
