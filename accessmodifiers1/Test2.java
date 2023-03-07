package accessmodifiers1;

public class Test2 {

	public void display() {
		Test1 b = new Test1();
		//System.out.println(b.a);//The field Test1.a is not visible
		//private variable will be accessed only with in the class
		System.out.println(b.b);
		System.out.println(b.c);
		System.out.println(b.d);
	}
}
