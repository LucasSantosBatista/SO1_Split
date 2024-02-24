package controller;

public class SplitController {
	public SplitController() {
		super();
	}
	
	public int divideFrase(String frase) {
		String[] vetorPalavras = frase.split(";");
		int cont = 0;
		
		for (String palavras: vetorPalavras) {
			cont++;
		}
		return cont;
	}
	
}
