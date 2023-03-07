package basics;

public class Loops {// while,do while , for, for each loops

	public static void main(String[] args) {
		System.out.println("manually Written");
		System.out.println("Hello 1");
		System.out.println("Hello 2");
		System.out.println("Hello 3");
		System.out.println("Hello 4");
		System.out.println("Hello 5");
		System.out.println("Hello 6");
		System.out.println("Hello 7");
		System.out.println("Hello 8");
		System.out.println("Hello 9");
		System.out.println("Hello 10");

		System.out.println("output with while loop");
		int i = 1;// initialization
		while (i <= 10) {// conditional part
			System.out.println("Hello " + i);
			i++;// incremental or decremental part
		}

		System.out.println("output with do while loop");
		int j = 1;// initialization
		do {
			System.out.println("Hello " + j);
			j++;// incremental or decremental part
		} while (j >= 10);// conditional part

		System.out.println("output with for loop");
		
		for (int j2 = 0; j2 <= 10; j2++) {
			System.out.println("Hello " + j2);
		}

	}

}
