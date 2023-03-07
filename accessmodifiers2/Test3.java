package accessmodifiers2;

import accessmodifiers1.Test1;

public class Test3 extends Test1 {
	public void display() {
//		System.out.println(a);
//		System.out.println(b);//will be accessable only with in the package
		System.out.println(c);//protected will be accessable in the same class, via object and also in the child class
		System.out.println(d);
	}

}
