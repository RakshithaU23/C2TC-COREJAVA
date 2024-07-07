package inheritance;

class Animaall{
	void eat() {
		
	}
}
class Dogg extends Animaall{
	void bark() {
		
	}
}
class puppy extends Dogg{
	void weep() {
		
	}
}

public class multiInheritance {

	public static void name(String args[]) {
		Animaall a =new Animaall();
		a.eat();//access only animal
		
		Dogg d=new Dogg();//access both animal and dog
		d.eat();
		d.bark();
		
		puppy p =new puppy();//access all 3
		p.eat();
		p.bark();
		p.weep();
		
		Animaall a1=new Dogg();
		Animaall a2=new puppy();
		Dogg d1=new puppy();
	}
}
