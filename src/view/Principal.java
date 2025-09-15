package view;

import javax.swing.JOptionPane;
import controller.PalindromoController;

public class Principal {

	public static void main(String[] args) {
		PalindromoController pc = new PalindromoController();
		
		String palavra = JOptionPane.showInputDialog("Digite a palavra: ");
		
		String invertida = pc.invertePalavra(palavra);
		
		boolean palindromo = pc.comparaPalavras(palavra, invertida);
		
		if (palindromo) {
	        JOptionPane.showMessageDialog(null, "É um palíndromo!");
	    } else {
	        JOptionPane.showMessageDialog(null, "Não é um palíndromo!");
	    }
	}

}
