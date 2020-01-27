import org.junit.jupiter.api.Test;

public class BankingAccount {

	private int balance;
	private int accountNumber;
	private static BankingAccount bankInstance;
	
	public static BankingAccount createBankingAccount(int acctNumber, int balance) {
		if(bankInstance==null) {
			bankInstance = new BankingAccount(acctNumber, balance);
		}
		return bankInstance;
	}
	
	private BankingAccount(int acctNumber, int balance) {		//changed public to private
		// TODO Auto-generated constructor stub
		this.accountNumber=acctNumber;
		this.balance=balance;
	}

	public int getBalance() {
		return balance;
	}

	public int getBankAccount() {
		return accountNumber;
	}

	public void deposite(int amt) {
		balance=balance+amt;
	}

	public void withdraw(int amt) {
		balance=balance-amt;
	}
	
//	public void display() {
//		System.out.println("Bank Account: "+accountNumber+", Balance is: "+balance);
//	}
}
