package controller;

public class Exemplo01 {

	public static void main(String[] args) {

		System.out.println("Tipos de dados em Java: \n" +
				"\nMenor Byte: " + Byte.MIN_VALUE +
				"\nMaior Byte: " + Byte.MAX_VALUE +
				"\nMenor Short Int: " + Short.MIN_VALUE +
				"\nMaior Short Int: " + Short.MAX_VALUE +
				"\nMenor Int: " + Integer.MIN_VALUE +
				"\nMaior Int: " + Integer.MAX_VALUE +
				"\nMenor Long: " + Long.MIN_VALUE +
				"\nMaior Long:" + Long.MAX_VALUE +
				"\nMenor Float: " + Float.MIN_VALUE +
				"\nMaior Float: " + Float.MAX_VALUE +
				"\nMenor Double: " + Double.MIN_VALUE +
				"\nMaior Double: " + Double.MAX_VALUE);
	
		byte v1 = 127; /*128 excede o limit de byte */
		System.out.println("\nv1 = " + v1);
		
		short v2 = 32767;/*32767 excede o limit de short */
		System.out.println("v2 = " + v2);

		int v3 = 327555588;/*acima de 9 numero excede o limite */
		System.out.println("v3 = " + v3);	

		long v4 = 3275555888L;/*informar sempre o "L" para diferenciar de int */
		System.out.println("v4 = " + v4);	

		float v5 = 10000.5F;/*informar sempre o "F" para diferenciar de int */
		System.out.println("v5 = " + v5);	
		
		boolean v6 = true;
		System.out.println("\nv6: "+ v6);
		
		v6 = 5 > 3;
		System.out.println("\nv6: "+ v6);
		
		if ( v6 ) {
			System.out.println("v6 é verdadeira");
			
		}else {
			System.out.println("v6 é false");
		}
		
	}

}
