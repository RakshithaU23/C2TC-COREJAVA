package access_modifier;
import access_modifier.test_one;

public class test_four {
	public static void main(String args[]) {
		test_one t1=new test_one();
		t1.i=5;
		System.out.println(t1.i);
		t1.display();
	}
}