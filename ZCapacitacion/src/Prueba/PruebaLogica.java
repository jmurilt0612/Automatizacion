package Prueba;

public class PruebaLogica {
	
	public static int calcularDiagonales(int[][] matriz) {
		
	       int contador=0, contador2=0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				 if(i==j){contador =contador +matriz[i][j];}
                 if((i+j)==matriz.length-1){contador2=contador2+matriz[i][j];}
			}
		}
		return Math.abs(contador-contador2);
		
		
	}
	
	public static void main(String[] args) {

		int absDifDiagonales = 0;
		int[][] matriz = {{1,2,3},{4,5,6},{9,8,7}};
		
		absDifDiagonales = calcularDiagonales(matriz);
		System.out.println(
				"El valor absoluto de la diferencia de las diagonales es: " + absDifDiagonales
				);
		
	}

}