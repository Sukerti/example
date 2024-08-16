package project_2;

public class thiskeyword{
	
	public void method1() {
		this.method3();
		System.out.println("I am first method");
	}
public void method2() {

		this.method1();
		System.out.println("I am second method");
		}
public void method3() {
	
	System.out.println("I am third method");
}
public static void main(String[] args) {
	System.out.println("I am the main method");
	thiskeyword obj= new thiskeyword();
	obj.method2();
			
}
}
