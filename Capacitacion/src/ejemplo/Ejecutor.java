package ejemplo;

public class Ejecutor {

	public static void main(String[] args) {
		
		int resultado, resultado1;
		Operaciones opera = new Operaciones ();
		
		resultado= opera.suma(4, 6);
		resultado1= opera.resta(4, 5);
		
		System.out.println("El resultado de la suma es: " + resultado + "\nEl resultado de la resta es: " + resultado1);
	}

}
