package controller;

public class Exemplo02 {

	public static void main(String[] args) {
		// Sequencias de Escape
		
/*			\b backspace
			\t tab
			\f form feed
			\n line feed
			\r carriage return
			\' aspas simples
			\" aspas duplas
			\\ contrabarra
*/
		System.out.println("\n Esta é uma aula bate papo sobre\n\n diversos recursos basicos da linguagem JAVA"); //\n pula linha
		System.out.println("\n Esta é uma aula bate papo sobre diversos\n recursos basicos da linguagem JAVA");
		System.out.println("\tEsta é uma aula bate papo sobre diversos recursos basicos da linguagem \"JAVA\"");// coloca aspas duplas
		System.out.println("local do arquivo C:\\Users\\labibmr\\Desktop\\caio"); //java ja entende que barra é um sequencia de escape
		}

}
