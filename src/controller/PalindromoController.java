package controller;

import br.gui.pilhastring.Pilha;

public class PalindromoController {
	
	public String invertePalavra (String palavra){
		Pilha pilha = new Pilha();
		String[] letras = palavra.split("");
		
		for (String letra : letras) {
			pilha.push(letra);
		}
		
		String invertida = "";
	    while (!pilha.isEmpty()) {
	        try {
	            invertida += pilha.pop();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    return invertida;
	}

	public boolean comparaPalavras(String palavra, String invertida) {
		return palavra.equalsIgnoreCase(invertida) ;
	}
}
