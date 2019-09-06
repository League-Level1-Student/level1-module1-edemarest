package _05_vault;

public class JamesBond {
	
	JamesBond() {
		System.out.println("James Bond has been created");
	}
	int findCode(Vault vault) {
		for (int i = 0; i < 1000000; i++) {
			if (vault.tryCode(i)) {
				System.out.println("James Bond found the code");
				return i;
				
			}
		}	
		return -1;
	}
 
 }
