package s1_sesion2_ub;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/*@author Alpine*/
public class S1_Sesion2_UB_Tipo_datos {

        public static void main(String[] args) {
        /* «Las oportunidades no pasan, las creas» *CHRIS GROSSER */
        
        /*Tipos de datos primitivos:
        
        _Totalmente tipados_
        Exige el tipo de dato como lo hace Java,  C+ 
        Ex: 
        
        int n1 = 10;
        Float n = 10.7;
        String n2 = "Hi";
        Char n3 = '';
        boolean = True;
        
        _No tipado:_
        No exige el tipo de dato como lo hace python, PHP , JavaScrip
        Ex: 
        
        n1 = 10
        
        n2 = "Hi"

        */
            double numd;
            String data = "";
            //String data; //Tambien funciona
            data = "50";
            
            double n = 10.7;
            System.out.println("Tipo de datos double: "+ n);
            // sou Ctrl+BarraSpace
            
            //Realizamos conversión de dato String a Double
            numd = Double.valueOf(data);
            System.out.println("Esta es la conversión de String a double: "+ numd);
            
    /*Tipos de datos en JAVA;
    
    Tamaño, Primitivo o estructurado;
            
            byte = Lo podemos utilizar de 0 a 127
            short = 99999 
            int 
            long
            float
            double
            boolean
            
            PascalCase = Utilizariamos para las clases; JavaScript o PHP.
            camelCase = se aplica a frases o palabras compuestas: Ex funciones y 
            unders_core ó snake_case = Utilizamos en BD & JavaScript o PHP
            kebab-case = para uso en HTML 

*/
    
//    Crearamos odjeto del scanner el nombre del objeto sera intro = new creamos la instancia
       Scanner intro = new Scanner(System.in);
    
//    Crearemos un randon para codigo estudiante;
            byte n1 = 127;
            System.out.println("byte: "+ n1);
            short n2 = 32767;
            System.out.println("short: " + n2);          
            int n3 = 123456789;
            System.out.println("int: " + n3);
            long n4 = 123456789;
            System.out.println("long: " +n4);              
            float n5 = 999999999;
            System.out.println("float: " +n5);
            double n6 = 99999999.9;
            System.out.println("double: " +n6);
            //Decimal una herencia entre double & float
            boolean n7 = true;
            System.out.println("boolean: " +n7);
            char caracter = 'M';
            caracter = 'F';
            
/*          Diferencia de un tipo de dato primitivo a la clase derivada de 
            un tipo de dato primitivo
            
            Dato primitivo: Variable definida
            
            Clase derivada de dato primitivo: Integer Objeto  puntero, 
            la variable adquiere propiedades ya que esta definida por la clase y
            las variable en si nos traen metodos.
            
*/
            Byte edad;
            Integer documento;
            Short codigoestudiante;
            Float compra;
            Double compra2;
            Boolean bandera;
            Character caracter2;
            Long saldobanco;
            
            BigInteger datoBig; //Requieren importar una clase de lo estensos que son
            BigDecimal DeciBig;
            
//            Ex: Capturamos un ejemplo por teclado
            
            //int xn3; Puedo utilizar la var asi le haya asignado un valor
            System.out.println("Digite su número de socumento: ");
            n3 = intro.nextInt();
            System.out.println("Su cedula es: " + n3);
            
            System.out.println("Digite un numero double: ");
            n6 = intro.nextDouble();
            System.out.println("Su número double mayor precisión: " + n6);
            
//            Importante En el ingreso de datos por teclado tener encuenta .next el tipo de variable

            System.out.println("Digite un numero float: ");
            n5 = intro.nextFloat();
            System.out.println("Su número double menor precisión: " + n5);
            

    
}
}
