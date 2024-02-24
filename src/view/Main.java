package view;
import javax.swing.JOptionPane;
import controller.SplitController;

public class Main {

	public static void main(String[] args) {
		SplitController op = new SplitController();
		
		String vet = JOptionPane.showInputDialog("Digite o texto");
		System.out.println(vet);
		System.out.println("Quantidade de palavras: " + op.divideFrase(vet));	
		
		vet = JOptionPane.showInputDialog("Digite o texto");
		System.out.println(vet);
		System.out.println("Quantidade de palavras: " + op.divideFrase(vet));	
		
		vet = JOptionPane.showInputDialog("Digite o texto");
		System.out.println(vet);
		System.out.println("Quantidade de palavras: " + op.divideFrase(vet));	
	}

}
