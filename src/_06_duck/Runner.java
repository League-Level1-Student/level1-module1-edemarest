package _06_duck;

public class Runner {
public static void main(String[] args) {
	
	
	Duck duck = new Duck("hummus", 1);
	Fox fox = new Fox("Green", 73);
	
	duck.quack();
	fox.play();
	fox.hunt();
	fox.hunt();
	fox.hunt();
	fox.hunt();
	
}
}
