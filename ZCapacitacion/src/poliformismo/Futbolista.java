package poliformismo;



public class Futbolista extends SeleccionFutbol{
 
 //Atributos de la clase Futbolista
 private int dorsal;
 private String demarcacion;
 
 //Getters y Setters
 public int getDorsal() {
  return dorsal;
 }

 public void setDorsal(int dorsal) {
  this.dorsal = dorsal;
 }

 public String getNumero() {
  return demarcacion;
 }

 public void setNumero(String demarcacion) {
  this.demarcacion = demarcacion;
 }
 
 //Constructor de la Clase Futbolista
 public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
  super(id, nombre, apellidos, edad);
  this.dorsal = dorsal;
  this.demarcacion = demarcacion;
 }
 
 //Métodos propios de la clase Futbolista
  @Override
 public void entrenamiento() {
   System.out.println("Realiza un entrenamiento (Clase Futbolista)");
 }
 
  @Override
 public void partidoFutbol() {
  System.out.println("Juega un partido (Clase Futbolista)");
 }

 public void entrenar() {
  System.out.println("Entrena (Clase Futbolista)");
 }
 
 public void entrevista() {
  System.out.println("Da una Entrevista");
 }
}