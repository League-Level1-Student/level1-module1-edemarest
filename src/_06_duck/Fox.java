package _06_duck;

public class Fox {
	String furColor;
	int numberOfFish;
	
	Fox(String furColor, int numberOfFish) {
		this.furColor = furColor;
		this.numberOfFish = numberOfFish;
	}
	
	void hunt() {
		numberOfFish++;
		System.out.println("The fox catches a fish! It now has " + numberOfFish + " fish");
	}
	void play() {
		System.out.println("The fox plays with it's tail.");
	}
}
