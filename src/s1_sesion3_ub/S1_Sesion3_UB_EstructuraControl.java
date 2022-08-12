package s1_sesion3_ub;

import java.util.Scanner;

/*@author Alpine*/
public class S1_Sesion3_UB_EstructuraControl {

        public static void main(String[] args) {
        /* «Las oportunidades no pasan, las creas» *CHRIS GROSSER */
        
/*Planteamiento del ejericio*/

    /*1.2.1 Se dispone de 1'000.000(P) de pesos el cual se deposita en una entidad financiera
        que le pagará un interés mensual del 2.5% (i) 
        sobre la cantidad inicial acumulada cada mes. //n cantidadmeses
        ¿Cuánto se tendrá al final de 1 año(n-en meses)?
        F = P * ( 1+i )^n
    */
    /*Vamos a crear un objeto para acceder al scanner para ingresar 
    datos por teclado llamado intro
    
    new indica que vamos a crear un objeto de la clase Scanner y con System.in utiliza el metodo 
    ingresar datos por el usuario
    
    intro es mi objeto*/
    
    Scanner intro = new Scanner(System.in);
     
    //Declaramos variables
    double dinerodep, interes, totalgan; //p dinerodep,,,, F= totalgana,,, i= interes
    byte cantidadmeses; //n cantidad de meses
    
    //Declaramos e inicializamos
    int mes = 10;
    
    System.out.println("Ingrese el capital inicial: ");
    dinerodep = intro.nextDouble();
    
    /*
    Estructuras de control,
    */
    
    //if(){
    
    }
        
        
}

