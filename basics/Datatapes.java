package basics;

public class Datatapes {// class is the logical entity
	int k;// global varible
	static boolean i;//

	public static void main(String[] args) {// main method is only the responsible for the execution of thr line code in

		// class
		Datatapes obj = new Datatapes();// object:object is the physical entity of the class we can create an object by
										// the instantiation of the class by the new keyword
		int storage = 10000;// local variables/temporary variables

		byte b = 127;
		System.out.println(storage);
		System.out.println(b);
		short s = 10000;
		// short s=10000;
		long l = 12345678900l;
		boolean b1 = true;
		boolean b2 = false;
		float f = 1.20f;
		double d = 12.34;
		char c = '@';
		char c1 = '1';
		char c2 = 'A';
		char c3 = '.';
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(l);
		System.out.println("global variable " + obj.k);
		System.out.println("static variable " + i);
		sample();
		sam();
	}

	public static void sample() {
		int j = 10;
		System.out.println(j);
		System.out.println(i);
	}

	public static void sam() {
		sample();
		String name = "swhizz Technologies";// non primitive data type
		System.out.println(name);
		System.out.println(i);
	}

}
