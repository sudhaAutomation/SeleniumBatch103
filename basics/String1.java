package basics;

public class String1 {

	public static void main(String[] args) {
		String s = "Hello";// By String literal:only scp
		String S1 = new String("Hello1");// by NEW keyword
		System.out.println(s);
		System.out.println(S1);
		S1 = "Hai";
		/*
		 * concat indexOf charAt contains equals equalignorecare split length
		 */
		System.out.println(S1 + " Friends");
		System.out.println(S1.concat(" Friends"));
		String str = "Good Morning Hyderabad and secunderabad";
		System.out.println(str.length());
		System.out.println(str.charAt(10));
		System.out.println(str.contains("Morn"));
		System.out.println(str.indexOf('n'));// 1st occurence of the n
		System.out.println(str.indexOf('n', str.indexOf('n') + 1));// 2nd occurence of the n
		System.out.println(str.indexOf('n', str.indexOf('n', str.indexOf('n') + 1) + 1));// 3rd occurence of the n
		System.out.println(str.indexOf('x'));// -1
		String s2 = "hai";
		System.out.println(s2.equals(S1));// false
		System.out.println(s2.equalsIgnoreCase(S1));// true

		String[] res = str.split("and");
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}

		String date = "02-02-2023";
		System.out.println(date.replace('-', '/'));

	}

}
