package basics;

public class Multi_dimensional_Array {

	public static void main(String[] args) {
		String[][] rest = new String[4][4];
		rest[0][0] = "Madhapur";
		rest[0][1] = "Idly";
		rest[0][2] = "Wada";
		rest[0][3] = "Puri";
		rest[1][0] = "Kukatpally";
		rest[1][1] = "Dosa";
		rest[1][2] = "Idly";
		rest[1][3] = "upma";
		rest[2][0] = "Adhibatla";
		rest[2][1] = "Idly";
		rest[2][2] = "Puri";
		rest[2][3] = "parota";
		rest[3][0] = "Gachibowli";
		rest[3][1] = "Idly";
		rest[3][2] = "Uthappam";
		rest[3][3] = "Idly-sampar";
		System.out.println(rest.length);//
		System.out.println(rest[1].length);//

		for (int i = 0; i < rest.length; i++) {
			for (int j = 0; j < rest[0].length; j++) {
				System.out.print(rest[i][j] + "   ");
			}
			System.out.println();
		}

	}

}
