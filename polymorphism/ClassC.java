package polymorphism;

public class ClassC extends ClassP {



	public void bmwEngine() {
		System.out.println("Child class bmw car engined designed");
	}

	public void bmwprice() {
		System.out.println("Child class bmw price 70L");
	}

	public void carstart() {
		System.out.println("Child class car start method implemented");
	}

	public void carstop() {
		System.out.println("Child class car stop method implemented");
	}

	public static void main(String[] args) {
		ClassP mr = new ClassC();// child class object can be reffered with parent class reference varible ,this
									// the concept of dynamic polymorphism/run time polymorphism
		// method overriding
		mr.cardesign();
		mr.carfeatures();
		mr.carstart();
		mr.carstop();
		//main(args);
	//	mr.c=10;
	System.out.println(mr.c);
	}

}
