import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayList1 {

	public static void main(String[] args) {
		int i = 10;
		ArrayList<Integer> arclt = new ArrayList();

		arclt.add(1000);
		arclt.add(2000);
		arclt.add(1000);
		arclt.add(3000);
		arclt.add(2000);
		arclt.add(5000);
		System.out.println(arclt);
		arclt.remove(0);
		System.out.println(arclt);
		ArrayList<Integer> arclt1 = new ArrayList();
		arclt1.add(10);
		arclt1.add(20);
		arclt1.add(30);
		arclt1.add(10);
		System.out.println(arclt1);
		System.out.println(arclt.addAll(arclt1));
		arclt.remove(3);
		System.out.println(arclt);
		System.out.println(arclt.removeAll(arclt1));
		System.out.println(arclt);
		System.out.println(arclt.removeAll(arclt1));
		System.out.println(arclt);

		LinkedList<String> lnclt = new LinkedList<>();
		lnclt.add("Ramu");
		lnclt.add("Somu");
		lnclt.add("shamu");
		lnclt.add("shamu");
		lnclt.add("raju");
		System.out.println(lnclt);
		lnclt.remove(2);
		System.out.println(lnclt);
		System.out.println(lnclt.element());
		Iterator<String> it = lnclt.iterator();
		System.out.println(it.hasNext());
		it.next();
		System.out.println(it.hasNext());
		it.next();
		System.out.println(it.hasNext());
		it.next();
		System.out.println(it.hasNext());
		it.next();
		System.out.println(it.hasNext());

		HashMap<String, Integer> hmap = new HashMap<>();
		hmap.put("swhizz", 12345);
		hmap.put("swhizz", 12345);
		hmap.put("Testing", 12312);
		hmap.put("Devops", 125);
		hmap.put("Saleforce", 12345);
		System.out.println(hmap);
	}

}
