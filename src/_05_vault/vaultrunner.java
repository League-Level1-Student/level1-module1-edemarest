package _05_vault;

import javax.swing.JOptionPane;

public class vaultrunner {
	
	public static void main(String[] args) {
		Vault vault = new Vault();
		JamesBond bond = new JamesBond();
		
		if (bond.findCode(vault) == -1) {
			System.out.println("James Bond did not find the code");
		}
	}
	
}
