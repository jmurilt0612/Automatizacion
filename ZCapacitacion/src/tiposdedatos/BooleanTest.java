package tiposdedatos;

import java.awt.CardLayout;

public class BooleanTest {
	
	public static void main(String[] args) {
		
		boolean result;
		int carSpeed;
		char letra;
		final double PI;
		
		
		PI=3.14159;
		letra = 'a';
		carSpeed =20;
		System.out.println("The Speed of Car is: " + carSpeed);
		
		carSpeed = carSpeed +20;
		
		System.out.println("\nThe Speed of Car is: " + carSpeed);
		
		result=true;
		System.out.println("\nThe test is: "+ result);
		
		result=false;
		System.out.println("\nThe test is: "+ result);
		
		System.out.println("\nThe letter is: "+ letra);
		System.out.println("The value of PI is: " + PI);
		
	}

}
