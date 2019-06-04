
package Paquete_1;


public class Estudiante extends Persona{
    private int codEstudiante;
    private float notaFinal; 

    //Constructor
    public Estudiante(String nombre, String apellido, int edad, int codEstudiante, float notaFinal){
        //Super le dice a java que nombre, apellido y edad ya estan inicializados en la clase *Persona*
        super(nombre, apellido, edad);
        
        this.codEstudiante = codEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " +getNombre()
       +"\nApellido: " +getApellido()
       +"\nEdad: " +getEdad()
        +"\nCodigo de estudiante: " +codEstudiante
        +"\nNota final: " +notaFinal);
    }
    
    
}
