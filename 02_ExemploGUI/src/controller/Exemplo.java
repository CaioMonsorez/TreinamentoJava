package controller;

public class Exemplo {

	public static void main(String[] args) {
		
		//DOCUMENTAÇÃO https://docs.oracle.com/javase/8/docs/api/
		
		javax.swing.JOptionPane.showConfirmDialog(null, "Quer aumento de salário?", "Salário", 
				javax.swing.JOptionPane.YES_NO_OPTION);
		
		javax.swing.JOptionPane.showConfirmDialog(null, "Voce está certo disso?", "Salário", 
				javax.swing.JOptionPane.YES_NO_OPTION);
		
		javax.swing.JOptionPane.showMessageDialog(null, "PARABÉNS, GANHOU 10.000", "Exemplo GUI", 1);
		
		javax.swing.JOptionPane.showMessageDialog(null, "VOCÊ NÃO GANHOU 10.000", "Exemplo GUI", 0);
		
		javax.swing.JOptionPane.showMessageDialog(null, "VOCÊ NÃO GANHOU 10.000?", "Exemplo GUI", 3);

		javax.swing.JOptionPane.showMessageDialog(null, "VOCÊ NÃO GANHOU 10.000!", "Exemplo GUI", 2);
		
	}

}
