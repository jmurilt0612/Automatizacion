package tiposdedatos;

public class OperadoresDeAsignacion {
	
	static int distance =80;
	static int speed = 20;
	static int time = 10;
	static String name = "QVision";
	static boolean isGood=true;
	
	public static void main(String[] args) {
		
		
		System.out.println("The value of is " + distance);
		System.out.println("The value of is " + speed);
		System.out.println("The value of is " + time );
		System.out.println("The value of is " + name );
		System.out.println("The value of is " +  isGood);
		
		speed = 100;
		time =distance;
		name = "Q Vision Technology";
		isGood = false;

		System.out.println("\nThe value of is " + distance);
		System.out.println("The value of is " + speed);
		System.out.println("The value of is " + time );
		System.out.println("The value of is " + name );
		System.out.println("The value of is " +  isGood);
		
		speed=distance=0;
		System.out.println("\nThe value of is " + speed);
		
		
	}

}
