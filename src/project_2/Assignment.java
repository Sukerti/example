package project_2;

public class Assignment {

	public void m() {
		this.m3(78,776,45);
		System.out.println("Default method");
	}
	public void m1(int a) {
		this.m();
				System.out.println("One parameterized method");
			}
	public void m2(int a, int b) {
		this.m1(32);
		System.out.println("two parameterized method");
				}
	public void m3(int a,int b,int c) {
		System.out.println("Three parameterized method");
				}
	public void m4(int a, int b, int c, int d) {
		this.m2(3, 10);
		System.out.println("Four parameterized method");
			}
 public static void main(String[] args) 
 {
	    Assignment obj=new Assignment();
		obj.m4(90,40,31,1000);
}
		
}		


