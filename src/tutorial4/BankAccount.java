//100655384 - Daniel Nucci

package tutorial4;

public class BankAccount {
	private double account = 0;

	public BankAccount() {
	}

	public BankAccount(double initialAmount) {
		this.account = initialAmount;
	}

	public void withdraw(double amount) {
		if (checkAmount(amount)) {
			this.account -= amount;
			System.out.println("Account remaining: " + this.account);
		}
		else {
			System.out.println("I'm sorry, you do not have enough funds.");
		}
	}

	private boolean checkAmount(double withdrawAmount) {
		return this.account >= withdrawAmount;
	}

	public void deposit(double amount) {
		this.account += amount;
	}

	public double getBalance() {
		return this.account;
	}

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		System.out.println("Value of blank bank account: " + account1.getBalance());
		BankAccount account2 = new BankAccount(25);
		System.out.println("Value of existing bank account: " + account2.getBalance());
		account1.withdraw(5);
		account2.withdraw(5);
	}
}
