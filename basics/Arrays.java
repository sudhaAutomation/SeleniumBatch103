package basics;

public class Arrays {

	public static void main(String[] args) {
		int T = 90;
		int E = 70;

		int marks[] = new int[7];
		marks[0] = 90;
		marks[1] = 70;
		marks[2] = 60;
		marks[3] = 50;
		marks[4] = 100;
		marks[5] = 95;
		// marks[6]=91;
		// System.out.println(marks[0]);
		// System.out.println(marks[1]);
		// System.out.println(marks[2]);
		// System.out.println(marks[3]);
		System.out.println(marks.length);// 7

		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		Object std[] = new Object[5];
		std[0] = "ramu";
		std[1] = 9783863866l;
		std[2] = "h.no. 321,madhapur,hyderabad";
		std[3] = 5.7;
		std[4] = 'o';
		
		for (int i = 0; i < std.length; i++) {
			System.out.println(std[i]);
		}

	}

}
