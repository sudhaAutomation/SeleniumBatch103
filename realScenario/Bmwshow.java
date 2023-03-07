package realScenario;

public class Bmwshow extends BMW {
	String price = "40Lakh";
	String color = "orange";
	String feature = "sun roof";

	public static void main(String[] args) {
		Bmwshow bm = new Bmwshow();
		bm.enginedesign();
		bm.cardesign();
		
		bm.exterdesign();
		bm.internalpartsdesign();
		bm.custmerspec();
		System.out.println("cust final price " + bm.price);
		System.out.println("cust final color " + bm.color);
		System.out.println("cust interested in feature " + bm.feature);

	}

	@Override
	public void custmerspec() {
		System.out.println(price);
		System.out.println(color);
		System.out.println(feature);

	}

}
