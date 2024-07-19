package Polymorphism;

abstract class ABCBank{
	public void message() {
		System.out.println("Welcome to ABCBank!!");
	}
	abstract void openAccount();
	abstract void closeAccount();
}

abstract class BankAccount extends ABCBank{
	
	abstract void deposit();
	abstract void withdraw();
	abstract void balance();
}

class SavingsAccount extends BankAccount{

	@Override
	void openAccount() {
		System.out.println("Open Account ");
	}

	@Override
	void closeAccount() {
		System.out.println("Close Account");
	}

	@Override
	void deposit() {
		System.out.println("Deposit is Saving Account ");
	}

	@Override
	void withdraw() {
		System.out.println("Withdraw is a Saving Account ");
	}

	@Override
	void balance() {
		System.out.println("Balance is a Saving Account ");
	}
	
}

class CurrentAccount extends BankAccount{
	
	@Override
	void openAccount() {
		System.out.println("Open Account ");
	}

	@Override
	void closeAccount() {
		System.out.println("Close Account ");
	}

	@Override
	void deposit() {
		System.out.println("Deposit is Current Account ");
	}

	@Override
	void withdraw() {
		System.out.println("Withdraw is a Current Account ");
	}

	@Override
	void balance() {
		System.out.println("Balance is a Current Account ");
	}
}

public class AbstractClassExample {
	
	public static void main(String[] args) {
		
		SavingsAccount savingAccount = new SavingsAccount();
		savingAccount.message();
		savingAccount.openAccount();
		savingAccount.closeAccount();
		savingAccount.deposit();
		savingAccount.withdraw();
		savingAccount.balance();
		
		System.out.println("********************");
		
		CurrentAccount currentAccount = new  CurrentAccount();
		currentAccount.openAccount();
		currentAccount.closeAccount();
		currentAccount.deposit();
		currentAccount.withdraw();
		currentAccount.balance();
	}
}
