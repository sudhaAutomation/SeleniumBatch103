package basics;

public class Functions {
	// a block of code where we do implement the logic
	// 1.without aruguments without return type
	public void sum() {// void means returns nothing
		System.out.println("without aruguments without return type");
		System.out.println("sum method");
		int i = 10;
		int j = 20;
		System.out.println(i + j);
	}

	// 2.with aruguments without return type
	public void sub(int i, int k) {
		System.out.println("with aruguments without return type");

		System.out.println(" "+(i - k));
	}

	// 3.without aruguments with return type
	public int div() {// return type means that method should return somw value as the output
		System.out.println("without aruguments with return type");
		int i = 20;
		int j = 5;
		int k = i / j;
		System.out.println("divison method output is " + k);
		return k;
	}

	// 4.with aruguments with return type
	public int mul(int i, int j) {// return type means that method should return somw value as the output
		System.out.println("with aruguments with return type");

		int k = i * j;
		System.out.println("multiplication method output is " + k);
		return k;
	}
	
}
