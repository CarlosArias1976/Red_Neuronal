/*
 * implemente un algoritmo que le permita: 
1) Desplegar el nombre del proyecto de su paper.
2) Qué es una red neuronal.
3) Cuáles son los elementos que forman una red neuronal.
4) Cómo utilizaron la red neuronal en el proyecto que usted ha seleccionado.
5) Cómo utilizaría usted la red neuronal como mejoramiento al proyecto propuesto.
6) En que consistió el entrenamiento utilizando la red neuronal, e indique 
   el algoritmo utilizado.
 */
package redneuronal1;
import java.util.Scanner;


/**
 *
 * @author carlo
 */
public class RedNeuronal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);
        
        System.out.println("Nombre de Paper:");
        String NombrePaper=objeto.nextLine();
        
        System.out.println("Que es una Red Neuronal:");
        String RedNeuronal=objeto.nextLine();
        
        System.out.println("Elementos que forman una Red Neuronal:");
        String ElementosRedNeuronal=objeto.nextLine();
        
        System.out.println("Utilizacion de la red Neuronal en el Proyecto:");
        String UtlilizacionRedNeuronalEnProyecto=objeto.nextLine();
        
        System.out.println("Utilizacion de la Red Neuronal Estudiante para mejorar:");
        String UtilizacionRedNeuronalEstudianteParaMejorar=objeto.nextLine();
        
        System.out.println("Entrenamiento utilizando la Red Neuronal:");
        String EntrenamientoUtilizandoRedNeuronal=objeto.nextLine();
        
        System.out.println("Algoritmo Utilizado:");
        String AlgoritmoUtilizado=objeto.nextLine();
        
        System.out.println("MUCHAS GRACIAS POR SUS RESPUESTAS");
        
     
        
        
        
    }
    
}
