package basics;

public class Operators {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int k = i + j;
		/*
		 * 2 types of operators 1. Arthematic operators:+,-,*,/,%,++,-- 2.Relational
		 * operators:>,<,==,!=,<=,>=,<>
		 */
		System.out.println(k / i);// 3
		System.out.println(k % i);// 0
		System.out.println(k++);//
		System.out.println(k);
		System.out.println(++k);//
		System.out.println(k);
		System.out.println(k = k + 2);
		System.out.println(k);
		System.out.println(i != j);
		System.out.println(i == j);

		/*
		 * 1.simple if 2.if else 3.else if/nested if 4.switch
		 */
		//
		// if (i > j) {
		// System.out.println("j is greater than i value");
		// } else {
		// System.out.println("j is not greater than i value");
		// }

		if (i > j) {
			System.out.println("i is greater than j value");
		} else if (i <= j) {
			System.out.println("i is lesser than or equal to j value");
		} else if (i == j) {
			System.out.println("i and j are same values");
		} else if (j < i) {
			System.out.println("j is lesser than i value");
		} else {
			System.out.println("i and j are not same");
		}

		char ex = 'E';

		if (ex == 'a' || ex == 'e' || ex == 'i' || ex == 'o' || ex == 'u' || ex == 'A' || ex == 'E' || ex == 'I'
				|| ex == 'O' || ex == 'U') {
			System.out.println(ex + " is a vowel");
		} else {
			System.out.println(ex + " is a consonant");
		}

		String day = "Friday";
		switch (day) {
		case "Sunday":
			System.out.println("today is sunday");
			break;
		case "Monday":
			System.out.println("today is Monday");
			break;
		case "Tuesday":
			System.out.println("today is Tuesday");
			break;
		case "Wednusday":
			System.out.println("today is Wednusday");
			break;
		case "Thursday":
			System.out.println("today is Thursday");
			break;
		case "Friday":
			System.out.println("today is Friday");
			break;

		default:
			System.out.println("today is Saturday");
			break;
		}

		String ex1 = "A";

		if (ex1.equalsIgnoreCase(ex1)) {
			if (ex1 == "a" || ex1 == "e" || ex1 == "i" || ex1 == "o" || ex1 == "u") {

				System.out.println(ex1 + " is a vowel");
			} else {
				System.out.println(ex1 + " is a consonant");
			}
		}

	}

}
