/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubfutbol;

/**
 *
 * @author MSI
 */
public class MiembroEquipo {
    
     //Atributos
    protected String ligaOrigen;
    private double salarioMensual; 
    private boolean altaMedica; //tiene dos valores (si / no)
    private int minutosJugados; 
    
    public MiembroEquipo (String liga) {
        this.ligaOrigen = liga;
        this.altaMedica = false;
        this.minutosJugados = 0;
        this.salarioMensual = 1000;
    }
    
    public void setSalarioMensual(double salario) {
        if(salario>0){
            this.salarioMensual = salario;
        }else{
            System.out.println("Alerta...contrato invalido");
        }
    }//Fin Metodo setSalarioMensual
    
    public void iniciarPretemporada(){
        System.out.println("Iniciando Pretemporada");
        realizarPruebasFisicas();
        this.altaMedica = true;
        System.out.println("Se dio el alta");
    }//Fin metodo iniciarPretemporada
    
    private void realizarPruebasFisicas(){
        System.out.println("Realizando las pruebas fisicas");
        String[] fases = new String[]
                                    {"Resistencia Fisicas",
                                     "Fuerza",
                                     "Velocidad"
                                    };
        
        for (int i = 0; i < 3; i++) {
            System.out.printf("Aprobado Fase %d: %s\n",i+1,fases[1]);            
        }//Fin ciclo FOR
    }//Fin de Metodo realizar Pruebas Fisicas
    
    public void setSumarMinutos(int cantidad){
        if(cantidad > 0){
            System.out.println("Sumando Minutos al Jugador");
            this.minutosJugados += cantidad;
        }
    }//Fin de Metodo SumarMinutos
    
    public void VisualizacionDatos(){
        System.out.printf("Liga Origen: %s",this.ligaOrigen);
    }
    
}//Fin de Clase MiembroEquipo
