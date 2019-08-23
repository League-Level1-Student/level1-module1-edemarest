package _02_cat;

public class catRunner {

	public static void main(String[] args) {
		
		Cat cat = new Cat("Tom");
		cat.meow();
		cat.printName();
		for (int i = 0; i < 9; i++) {
		cat.kill();
		}
	}
	
}
