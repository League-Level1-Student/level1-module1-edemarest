package _06_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
	
	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}

	
	void quack() {
		System.out.println("The duck quacks!");
	}
	void waddle() {
		System.out.println("The duck waddles away.");
	}
	
	
}
