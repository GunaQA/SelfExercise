
public class VariablesEg {
	//InstanceVariable
	int b=2;
	//StaticVariable
	static int c=3;
	
	public void method1() {
		//LocalVariable
		int a=1;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		VariablesEg obj=new VariablesEg();
		obj.method1();
		System.out.println(obj.b);
		System.out.println(c);
	}
}
