package arreglos;

public class Arreglos {
	
	public void retornarArray() {
		
		
	}

		public static void main(String[] args) {
			
			String marca[] = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
			int ilenght = marca.length;
			
			for (String carrosMarca : marca) {
				System.out.println("La marca del carro es: " + carrosMarca);
			}
			
			
		}
		
	
}
