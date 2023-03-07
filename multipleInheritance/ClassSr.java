package multipleInheritance;

public class ClassSr implements SwhizzBank {//has a relationship
	public void sample() {

	}

	public static void main(String[] args) {
		ClassSr i = new ClassSr();
		i.creditaccount();
		i.debitacount();
		i.marketing();
		i.smartspendings();
		i.instantaccountopen();
		i.mobilebanking();
		i.mutualfunds();
		i.netbanking();
		i.personaloan();
		i.transfermoney();

	}

	@Override
	public void personaloan() {
		System.out.println("personal loan module implemented successfully");

	}

	@Override
	public void marketing() {
		System.out.println("marketing module implemented successfully");

	}

	@Override
	public void instantaccountopen() {
		System.out.println("instantaccountopen module implemented successfully");

	}

	@Override
	public void creditaccount() {
		System.out.println("creditaccount module implemented successfully");

	}

	@Override
	public void debitacount() {
		System.out.println(" module implemented successfully");

	}

	@Override
	public void transfermoney() {
		System.out.println(" module implemented successfully");

	}

	@Override
	public void netbanking() {
		System.out.println(" module implemented successfully");
	}

	@Override
	public void mobilebanking() {
		System.out.println(" module implemented successfully");

	}

	@Override
	public void smartspendings() {
		System.out.println(" module implemented successfully");

	}

	@Override
	public void mutualfunds() {
		System.out.println(" module implemented successfully");
	}

}
