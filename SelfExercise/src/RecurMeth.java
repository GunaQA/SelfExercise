
public class RecurMeth {
	
	public void m1() {
		
		System.out.println("m1");

	}
	public void m1(int a) {
		System.out.println("m1 overload");
		m1();

	}
	public void m2() {
		System.out.println("m2");

	}
	
	public static void main(String[] args) {
		RecurMeth obj=new RecurMeth();
		obj.m1();
		obj.m2();
		obj.m1(20);
		
	}
	

}
