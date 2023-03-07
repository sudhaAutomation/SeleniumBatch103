package constructor;

public class ConstructorP {

	public ConstructorP() {
	//	this(1,2);
		this(100,2);
		System.out.println("parent class default constructor");
	}

	public ConstructorP(int i) {
		this();
		System.out.println("parent class 1 parameterised constructor " + i);
	}

	public ConstructorP(int j, int k) {
		
		System.out.println("parent class 2 parameterised constructor " + (j + k));
	}

	public static void main(String[] args) {

	}

}
