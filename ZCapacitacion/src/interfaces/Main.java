package interfaces;

import java.util.ArrayList;

public class Main {

 // ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
 public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

 public static void main(String[] args) {

  Entrenador pekerman = new Entrenador(1, "Jose Nestor", "Pekerman", 60, "284EZ89");
  Futbolista james = new Futbolista(2, "James", "Rodriguez", 26, 6, "Volante 10");
  Masajista raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

  integrantes.add(pekerman);
  integrantes.add(james);
  integrantes.add(raulMartinez);

  // CONCENTRACION
  System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
  for (SeleccionFutbol integrante : integrantes) {
   System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
   integrante.concentrarse();
  }

  // VIAJE
  System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
  for (SeleccionFutbol integrante : integrantes) {
   System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
   integrante.viajar();
  }

  // ENTRENAMIENTO
  System.out.println("\nEntrenamiento: Todos los integrantes tienen su función en un entrenamiento (Especialización)");
  for (SeleccionFutbol integrante : integrantes) {
   System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
   integrante.entrenar();
  }

  // PARTIDO DE FUTBOL
  System.out.println("\nPartido de Fútbol: Todos los integrantes tienen su función en un partido (Especialización)");
  for (SeleccionFutbol integrante : integrantes) {
   System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
   integrante.jugarPartido();
  }

  // PLANIFICAR ENTRENAMIENTO
  System.out.println("\nPlanificar Entrenamiento: Solo el entrenador tiene el método para planificar un entrenamiento:");
  System.out.print(pekerman.getNombre() + " " + pekerman.getApellidos() + " -> ");
  ((Entrenador) pekerman).planificarEntrenamiento();

  // ENTREVISTA
  System.out.println("\nEntrevista: Solo el futbolista tiene el método para dar una entrevista:");
  System.out.print(james.getNombre() + " " + james.getApellidos() + " -> ");
  ((Futbolista) james).entrevista();

  // MASAJE
  System.out.println("\nMasaje: Solo el masajista tiene el método para dar un masaje:");
  System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
  ((Masajista) raulMartinez).darMasaje();

 }
}
