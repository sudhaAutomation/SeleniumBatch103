package Inheritance;

public class AdvanceBmw extends BMW {
	String adBMWprice = "90L";
	static int i;

	public void sunroof() {
		System.out.println("sun roof feature implemented");
	}

	public void gearless() {
		System.out.println("automatic gearless system implemented");
	//	System.out.println(adBMWprice);
	}

	public static void main(String[] args) {
		AdvanceBmw ad = new AdvanceBmw();
		ad.model = "autodrive11";
		System.out.println(ad.name);
		System.out.println(ad.model);

		ad.cardesign();
		ad.carfeatures();
		ad.carstart();
		ad.carstop();
		ad.bmwEngine();
		ad.sunroof();
		ad.gearless();
		System.out.println("price of the advance BMW is " + ad.adBMWprice);
	}

}
