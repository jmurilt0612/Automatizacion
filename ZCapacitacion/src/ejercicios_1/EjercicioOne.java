package ejercicios_1;

public class EjercicioOne {
	
	public static int simpleArraySum (int [] vector) {
		int sumador=0;
		
		 for (int i : vector) {sumador=sumador+i;}
		
		 return sumador;

	}
	
	public static void main(String[] args) {
		
		int [] prueba = {1, 2, 3, 4, 10, 11};
		
		System.out.println(simpleArraySum(prueba));
	}
	
}
