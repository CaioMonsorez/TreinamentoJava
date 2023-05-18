package controller;

import javax.swing.JOptionPane;

public class Exemplo2 {

	public static void main(String[] args) {
		
		//DOCUMENTAÇÃO https://docs.oracle.com/javase/8/docs/api/
		
				JOptionPane.showConfirmDialog(null, "Quer aumento de salário?", "Salário", 
						javax.swing.JOptionPane.YES_NO_OPTION);
				
				JOptionPane.showConfirmDialog(null, "Voce está certo disso?", "Salário", 
						javax.swing.JOptionPane.YES_NO_OPTION);
				
				JOptionPane.showMessageDialog(null, "PARABÉNS, GANHOU 10.000", "Exemplo GUI", 1);
				
				JOptionPane.showMessageDialog(null, "VOCÊ NÃO GANHOU 10.000", "Exemplo GUI", 0);
				
				JOptionPane.showMessageDialog(null, "VOCÊ NÃO GANHOU 10.000?", "Exemplo GUI", 3);

				JOptionPane.showMessageDialog(null, "VOCÊ NÃO GANHOU 10.000!", "Exemplo GUI", 2);

	}

}
