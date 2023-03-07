package exceptions;

public class Exception1 {

	public static void main(String[] args) {
		int i = 10;
		System.out.println("Hello");
		try {
			System.out.println(i / 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("program closing method implemented");
		}

		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");

	}

}
