package ejercicios_1;

public class EjercicioMatriz8 {
	
	 public static int diagonalDifference(int[][] arr) {
	       int contador=0, contador2=0;

	    for (int i = 0; i < arr.length-1; i++) {

	            for (int j = 0; j< arr.length; j++) {

	                    if(i==j){contador =contador +arr[i][j];}
	                    if((i+j)==arr.length-1){contador2=contador2+arr[i][j];}

	            }
	        }

	        return Math.abs(contador-contador2);
	    }
	 
	 
	 public static void main(String[] args) {
		
		 int prueba [][] = {{11, 2, 4},{4, 5, 6},{10, 8, -12}};
		 
		 System.out.println(diagonalDifference(prueba));
		 
		 for (int i = 0; i < prueba.length; i++) {
			for (int j = 0; j < prueba.length; j++) {
				System.out.println(prueba[i][j]);
			}
		}
		 
				 }
		 }

