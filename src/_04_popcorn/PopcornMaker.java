package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor do you want your popcorn to be?");
		Popcorn popcorn = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		String time = JOptionPane.showInputDialog("How many minutes do you want to cook the popcorn?");
		int cookTime = Integer.parseInt(time);
		microwave.setTime(cookTime);
		microwave.startMicrowave();
		
		
		
	}
}
