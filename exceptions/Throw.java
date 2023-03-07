package exceptions;

public class Throw {
	int acountno = 1276365;
	int amount = 5000;

	public void display() {
		System.out.println("my account number is " + acountno);
		System.out.println("current balance is " + amount);
	}

	public void deposit(int amount) {
		System.out.println("deposited amount is " + amount);
		this.amount = this.amount + amount;
		display();
	}

	public void withdraw(int amount) throws Exception {
		System.out.println("withdrawn amount is " + amount);
		if (this.amount >= amount) {
			this.amount = this.amount - amount;
			
		} else {
			//System.out.println("INsuffient funds in your account");
			throw new Exception("INsuffient funds in your account");
		}
		display();
		
	}

}
