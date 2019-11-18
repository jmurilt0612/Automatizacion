package poliformismo;


public abstract class SeleccionFutbol {
 
 protected int id;
 protected String nombre;
 protected String apellidos;
 protected int edad;
 
 //Geters y Setters
 public int getId() {
  return id;
 }
 public void setId(int id) {
  this.id = id;
 }
 public String getNombre() {
  return nombre;
 }
 public void setNombre(String nombre) {
  this.nombre = nombre;
 }
 public String getApellidos() {
  return apellidos;
 }
 public void setApellidos(String apellidos) {
  this.apellidos = apellidos;
 }
 public int getEdad() {
  return edad;
 }
 public void setEdad(int edad) {
  this.edad = edad;
 }
 
 // Constructor de la clase
 public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
  super();
  this.id = id;
  this.nombre = nombre;
  this.apellidos = apellidos;
  this.edad = edad;
 }
 //M�todos de la clase
 public void concentrarse() {
  System.out.println("Concentrarse (Clase padre)");
 }
 
 public void viajar() {
  System.out.println("Viajar (Clase Padre)");
 }
 
 // IMPORTANTE -> METODO ABSTRACTO => no se implementa en la clase abstracta pero si en la clases hijas
 public abstract void entrenamiento();

 public void partidoFutbol() {
      System.out.println("Asiste al Partido de F�tbol (Clase Padre)");
 }

}
