package tiposdedatos;

public class OperadoresDeAsignacion2 {
	
	public static void main(String[] args) {
		
		int a, b=10, c=5;
		a=b+c;
		
		System.out.println("Value of 'a' after of the operation: "+ a);
		a=b-c;
		System.out.println("Value of 'a' after of the operation: "+ a);
		a=b*c;
		System.out.println("Value of 'a' after of the operation: "+ a);
		a=b/c;
		System.out.println("Value of 'a' after of the operation: "+ a);
		a=b%c;
		System.out.println("Value of 'a' after of the operation: "+ a);
		b++;
		System.out.println("Value of 'a' after of the operation: "+ b);
		c--;
		System.out.println("Value of 'a' after of the operation: "+ c);
				
		   int Ten = 10; 
		   int Twenty = 20;
		   int Thirty = 30;

		   System.out.println("<<<<<< GREATER THAN OPERATOR >>>>>>");
		   System.out.println(" Ten > Twenty ==> " + (Ten > Twenty)); //false
		   System.out.println(" Twenty > Ten ==> " + (Twenty > Ten)); //true
		   System.out.println(" Thirty > Twenty ==> " + (Thirty > Twenty)); //true

		   System.out.println("<<<<<< GREATER THAN OR EQUAL TO OPERATOR >>>>>>");
		   System.out.println(" Ten >= Twenty ==> " + (Ten >= Twenty)); //false
		   System.out.println(" Twenty >= Ten ==> " + (Twenty >= Ten)); //true
		   System.out.println(" Thirty >= Twenty ==> " + (Thirty >= Twenty)); //true

		   System.out.println("<<<<<< LESS THAN OPERATOR >>>>>>");
		   System.out.println(" Ten < Twenty ==> " + (Ten < Twenty)); //true
		   System.out.println(" Twenty < Ten ==> " + (Twenty < Ten)); //false
		   System.out.println(" Thirty < Twenty ==> " + (Thirty < Twenty)); //false

		   //less than or equal to
		   System.out.println("<<<<<< LESS THAN OR EQUAL TO OPERATOR >>>>>>");
		   System.out.println(" Ten <= Twenty ==> " + (Ten <= Twenty)); //true
		   System.out.println(" Twenty <= Ten ==> " + (Twenty <= Ten)); //false
		   System.out.println(" Thirty <= Twenty ==> " + (Thirty <= Twenty)); //false

		   //equal to
		   System.out.println("<<<<<< EQUAL TO OPERATOR >>>>>>");
		   System.out.println(" Ten == Twenty ==> " + (Ten == Twenty)); //false
		   System.out.println(" Thirty == Twenty + Ten ==> " + (Thirty == Twenty+Ten)); //true

		   //not equal to
		   System.out.println("<<<<<< NOT EQUAL TO OPERATOR >>>>>>");
		   System.out.println(" Ten != Twenty ==> " + (Ten != Twenty)); //true
		   System.out.println(" Thirty != Twenty + Ten ==> " + (Thirty != Twenty + Ten)); //false
		
	}
	
	

}
