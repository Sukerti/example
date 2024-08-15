package project_2;

public class Constructorexample {
 public Constructorexample() {
	// TODO Auto-generated constructor stub
	 this(11,222,333);
	 System.out.println("Default constructor");
	 }
 Constructorexample(int a)
 
 { 
	 this(111,4000);
	 System.out.println("One Paramaterized method");
 
 }
 Constructorexample(int a, int b)
 { 
	 this();
	 System.out.println("Two Paramaterized method");
 
 }
 Constructorexample(int a, int b , int c)
 { System.out.println("Three Paramaterized method");
 
 }
 
 public static void main(String[] args) {
	 Constructorexample obj=new Constructorexample(10); 
	 
}
}
