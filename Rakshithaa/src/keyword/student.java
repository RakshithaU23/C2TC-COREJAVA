
package keyword;

public class student {

	int usn;
	String name;
	static String college="JSSATEB";
	
	
	static void change() {
		
		college="JSSATEB";
	}
	
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", college=" + college + "]";
	}
    public static void main(String args[]) {
		
		student s1=new student();
		s1.usn=2;
		s1.name="Abhi";
		
		student.change();
		change();
		s1.change();
	
		System.out.println(s1);
	}

}