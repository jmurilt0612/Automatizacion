package tiposdedatos;

public class ForMejorado {

	 public static void main(String[] args) {
         //Arreglo de String que almacena los dias de la semana
  String days[] = { "Mon", "Tue", "Wed", "Thr", "Fri", "Sat", "Sun"};

  //For mejoradop, que itera autom�ticamente sobre la lista 
  for (String JuanEsteban : days) {
    System.out.println("Days ==> "+ JuanEsteban);
   }

  System.out.println("<==== Normal For Loop ====>");
  // Normal for loop
  for (int i=0; i < days.length; i++) {
      System.out.println("Days ==> "+ days[i]);
   }
	
}
	 }