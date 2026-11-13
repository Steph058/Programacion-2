/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaestudiante;

/**
 *
 * @author MSI
 */
public class Estudiante {
    
    /*
        Modificadores de Acceso
        1. public
        2. private
        3. protected
    */

    //Atributos (Variables)
    private int edad;
    private double estatura;
    
    String nombre;
    String apellido;
    
    

    //Constructor
    public Estudiante() {
        this.edad = 0;
        this.estatura = 0;
        this.nombre = "John";
        this.apellido = "Doe";

    }//Fin de Constructor

    /**
     * El constructor sirve para darle los valores iniciales al momento de crear
     * el objeto.
     *
     * @param edad
     * @param estatura
     */
    public Estudiante(int edad, double estatura) { //Tambien es un constructor
        this.edad = edad;
        this.estatura = estatura;
        this.nombre = "John";
        this.apellido = "Doe";

    }//

    //Metodo (Funcion)
    public void MostrarDatos() {
        System.out.printf("Nombre: %s\n", this.nombre);
        System.out.printf("Apellido: %s\n", this.apellido);
        System.out.printf("Edad: %d\n", this.edad);
        System.out.printf("Estatura: %.2f\n", this.estatura);
    }//Fin de Metodo MostrarDatos
    
//Getter y Setter    
//Modificar la Edad
    public void SetEdad(int edad) {
        this.edad = edad;
    }
    
    //Obtener la edad
    public int getEdad(){
        return this.edad;
    }
    
    public char getGenero

}//Fin de Class Estudiante
