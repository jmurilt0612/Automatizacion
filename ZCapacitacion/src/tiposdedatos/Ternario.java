package tiposdedatos;

public class Ternario {
	
	 public static void main(String[] args) {
		  int Ten = 10; 
		  int Twenty = 20;
		  int Thirty = 30;
		     boolean bValue;
		     int iValue;

		     bValue = (Thirty == Twenty + Ten) ? true: false;
		     System.out.println( "El valor booleano de la variable 'bValue' es : " +  bValue );

		     iValue = ((Thirty == Twenty + Ten)) ? 50: 100;
		     System.out.println( "El valor entero de la variable iValue es : " + iValue ); 

		     //Ejemplo del uso del operador lógico NOT
		     iValue = (!(Thirty == Twenty + Ten)) ? 50: 100;
		     System.out.println( "El valor entero de ls variable iValue es : " + iValue );
		 }

}
