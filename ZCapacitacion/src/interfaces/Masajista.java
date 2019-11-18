package interfaces;

public class Masajista extends SeleccionFutbol{
 
 //Atributos de la clase Masajista
 private String titulacion;
 private int aniosExperiencia;
 
 //Getters y Setters
 public String getTitulacion() {
  return titulacion;
 }

 public void setTitulacion(String titulacion) {
  this.titulacion = titulacion;
 }

 public int getAniosExperiencia() {
  return aniosExperiencia;
 }

 public void setAniosExperiencia(int aniosExperiencia) {
  this.aniosExperiencia = aniosExperiencia;
 }
 
 //Constructor de la clase Masajista
 public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
  super(id, nombre, apellidos, edad);
  this.titulacion = titulacion;
  this.aniosExperiencia = aniosExperiencia; 
 }
 
 @Override
 public void entrenar() {
  System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
 }

 public void darMasaje() {
  System.out.println("Da un Masaje");
 }

}