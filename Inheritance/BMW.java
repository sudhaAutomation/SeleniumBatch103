package Inheritance;

public class BMW extends Car {

	public void bmwEngine() {
		System.out.println("bmw car engined designed");
	}

	public void bmwprice() {
		System.out.println("bmw price 70L");
	}

	public static void main(String[] args) {
		BMW b = new BMW();
		b.model="BMW001";
		System.out.println(b.name);
		System.out.println("my BMW model is "+b.model);
				b.cardesign();
				b.carfeatures();
				b.carstart();
				b.carstop();
				b.bmwEngine();
				b.bmwprice();
		
	}

}
