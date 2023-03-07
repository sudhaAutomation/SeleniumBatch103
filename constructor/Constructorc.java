package constructor;

public class Constructorc extends ConstructorP {
	int j;
	String s;
	double d;
	boolean b;

	// 2 types
	/*
	 * 1. default constructor 2.parameterised constructor
	 */

	public static void main(String[] args) {
		Constructorc c = new Constructorc();
		

		int i = 10;
		char c1;

		// System.out.println(c1);
		System.out.println(i);// 10
		System.out.println(c.j);//
		System.out.println(c.s);
		System.out.println(c.d);
		System.out.println(c.b);
		new Constructorc(1000, "Swhizz");

	}

	public Constructorc() {
		this(100);// constructor is a special method in the class which is having the same name as
		// the class name

		System.out.println("child class default constructor");// in every class invisibly a constructor will exist when
																// we do create
		// an object
		// method overriding is impossible for the constructor methods
		// inheritance?
	}

	public Constructorc(int i) {
		super(10);//Constructor call must be the first statement in a constructor
		System.out.println("child class 1 parameter constructor " + i);
	}

	public Constructorc(int i, String s) {
		super(1,2);
		System.out.println("child class 2 parameterised constructor " + i + "  " + s);
		
	}
}
