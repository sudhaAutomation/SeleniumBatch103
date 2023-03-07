package multipleInheritance;

public interface Interface1 {
	 int i=1000;
	 public void sample();
	 static public void exam() {
		System.out.println("exam"); 
	 }
	 public static void main(String[] args) {
		 System.out.println(i);
		 exam();
		// sample();
		
	 }

}
//in an interface if we define a variable that will act as final in nature as wel as static in nature
//an Abstract method means which doesnot contain the method body
//we cannot create an object for an interface