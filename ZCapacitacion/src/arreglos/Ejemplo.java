package arreglos;

public class Ejemplo {
	
	public static void main(String[] args) {
		printArray(retornarArray());
	}
	
	public static String[] retornarArray() {
		
		String array[]= {"BMW\",\"AUDI\",\"TOYOTA\",\"SUZUKI\",\"HONDA"};
		return array;
	}

	public static void printArray(String[] array) {
		
		for (String prueba : array) {
			System.out.println("Las marcas de los carros son: "+ prueba);
		}
		
	}
	
	
}
