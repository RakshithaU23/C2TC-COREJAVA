
package keyword;
class Animal{
	String color="Brown";
	
}
class Dog extends Animal{
	String color="White";
	void call() {
		System.out.println(color);
		System.out.println(super.color);
	}
	
}
public class variable {
	public static void main(String[] args) {
		Dog d=new Dog();
		System.out.println(d.color);
		d.call();
		Animal a= new Dog();
		System.out.println(a.color);
		
		
	}
}