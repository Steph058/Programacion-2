/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaestudiante;

/**
 *
 * @author MSI
 */
public class SistemaEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiante Stephanie = new Estudiante();
        Estudiante Marvin = new Estudiante(15,1.9);
        
        Stephanie.MostrarDatos();
        System.out.println("-----------------");
        Marvin.MostrarDatos();
        System.out.println("-----------------");
        Stephanie.MostrarDatos();
        
        Stephanie.nombre = "Sarai";
        Marvin.nombre = "Eduardo";
        
        Stephanie.SetEdad(90);
        Marvin.
        
        
    }//Fin de Main
    //encapsulamiento:asegurar esos datos confidenciales, el comportamiento que van a tener
}//Fin de Class
