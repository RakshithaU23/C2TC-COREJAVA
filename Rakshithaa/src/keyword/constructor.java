package keyword;

class Animaal{
	Animaal(){
		System.out.println("Animal constructor");
	}
	
}
class Dogg extends Animaal{
	Dogg(){
		super();
		System.out.println("Dog constructor");
	}
	
}
public class constructor {
public static void main(String args[]) {
		
		Dogg d=new Dogg();
	}
}