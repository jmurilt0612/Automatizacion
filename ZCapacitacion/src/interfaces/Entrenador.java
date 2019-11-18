package interfaces;

public class Entrenador extends SeleccionFutbol{

 //Atributos de la clase Entrenador
 private String idFederacion;
 
 //Getters y Setters
 public String getIdFederacion() {
  return idFederacion;
 }

 public void setIdFederacion(String idFederacion) {
  this.idFederacion = idFederacion;
 }

 //Constructor de la Clase Entrenador
 public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
  super(id, nombre, apellidos, edad);
  this.idFederacion = idFederacion;
 }
 
 @Override
 public void entrenar() {
  System.out.println("Dirige un entrenamiento (Clase Entrenador)");

 }

 @Override
 public void jugarPartido() {
  System.out.println("Dirige un Partido (Clase Entrenador)");
 }

 public void planificarEntrenamiento() {
  System.out.println("Planificar un Entrenamiento");
 }

}