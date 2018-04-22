
public class BankAccount {

	private int balance;
	public BankAccount(int money) {
		balance = money;
	}
	public BankAccount() {
		balance = 0;
	}
	public void deposit(int money) {
	balance += money;		
	}
	public int getBalance() {
		return balance;
	}
	public void withdraw(int money) {
		balance -= money;
	}

}
