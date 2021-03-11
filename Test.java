import Test1;

public class Test {

	public Test() {}

	public void callOtherCls() {
		new Test1().printInfo();
	}

	public static void main(String arg[]) {
		System.out.println("Hello World");
		System.out.println("Update Srouce");
	
		System.out.println("Second Update");
		System.out.println("Third Update");
		System.out.println("After git-flow init");

		Test t = new Test();
		t.callOtherCls();
		//This is a test for another account's update
		System.out.println("Updated by mozart@mbk.nifty.com");
	}
}

