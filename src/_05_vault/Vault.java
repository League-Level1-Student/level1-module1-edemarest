package _05_vault;

import java.util.Random;

import javax.swing.JOptionPane;

public class Vault {
		int code;
		int guess;
		
		Vault() {
			System.out.println("A vault has been created");
			//code = new Random().nextInt(1000000);
			code = 2000000;
		}

		boolean tryCode(int guess) {
			boolean vaultstatus;
			if (guess == code) {
				vaultstatus = true;
				
			}
			else {
				vaultstatus = false;
				
			}
			return vaultstatus;
		}
		


}
 
	
	
	
	
	
	
	
 
		
	
	
	
	
	


