package s1_sesion3_ub;

import java.util.Scanner;

/*@author Alpine*/
public class S1_Sesion3_UB_EstrucControl_x1 {

    public static void main(String[] args) {
        /* «Las oportunidades no pasan, las creas» *CHRIS GROSSER */

 /*Ex: 1.6.2. Leer un número cualquiera y decir si es un dígito, en caso 
   contrario no es de un dígito. */
        double n1, x;
        int z;
        String msj;
        boolean flag;

        Scanner intro = new Scanner(System.in);
        System.out.println("Digite un número: ");
        n1 = intro.nextDouble();

        //Una forma seria 1:::::::::::::::::::::::::::::::::::::::::::::::::::
//   
//        if (n1 == 0){
//            System.out.println(n1 + " es un digito.");        
//        } else {
//   /*--*/if (n1 == 1){
//            System.out.println(n1 + " es un digito.");        
//        } else {
//   /*--*/if (n1 == 2){
//            System.out.println(n1 + " es un digito.");        
//        } else {
//   /*--*/if (n1 == 3){
//            System.out.println(n1 + " es un digito.");        
//        } else {
//   /*--*/if (n1 == 4){
//            System.out.println(n1 + " es un digito.");        
//        } else {
//   /*--*/if (n1 == 5){
//            System.out.println(n1 + " es un digito.");        
//        } else {
//   /*--*/if (n1 == 6){
//            System.out.println(n1 + " es un digito.");        
//        } else {
//   /*--*/if (n1 == 7){
//            System.out.println(n1 + " es un digito.");        
//        } else {
//   /*--*/if (n1 == 8){
//            System.out.println(n1 + " es un digito.");        
//        } else {
//   /*--*/if (n1 == 9){
//            System.out.println(n1 + " es un digito.");
//            flag = true;
//        } else {
//   /*-Imnprimo el error-*/
//       System.out.println("Error--No has ingresado un digito.");
//        }
//        }
//        }
//        }
//        }
//        }
//        }
//        }
//        }
//        }

        /*Otra forma en la que podemos desarrollar es: */
//
//        if (n1 <= 9 && n1 >= 0){
//            System.out.println(n1 + " es un digito.");        
//            } else {
//            System.out.println("Error--No es digito");
//            if (n1 < 0 && n1 > 9) {
//            x = Math.floor(n1);
//            System.out.println("Error--Line 73.");
//            } else {
//            
//            System.out.println("Error--No has ingresado un digito.");
//                    }
//
//    }
        /* Presentación docente opcion 2*/
//        
//        if (n1 <= 9 && n1 >= 0) {
//            System.out.println(n1 + " es un digito.");
//        } else {
//            System.out.println(n1 + "No es un digito teacher line 84");
//            if (n1 < 0 && n1 > 9) {
//                System.out.println(n1 + "No es un digito teacher");
//            } else {
//                x = Math.floor(n1);
//                System.out.println("Numero x: " +x);
//                if (n1 % x != 0.0) {
//                    System.out.println(n1 + " no es un dijito");
//
//                }
//            }
//        }
        // ::::::::::::::::::::::::::: Forma 3:::::::::::::::::::::::::::::::::::
        //swich = en caso que!! Solo permite con números enteros
        
        
//        z = (int) n1;
//        switch (z) {
//            case 0:
//                msj = n1 + " es un digito";
//                break;
//            case 1:
//                msj = n1 + " es un digito";
//                break;
//            case 2:
//                msj = n1 + " es un digito";
//                break;
//            case 3:
//                msj = n1 + " es un digito";
//                break;
//            case 4:
//                msj = n1 + " es un digito";
//                break;
//            case 5:
//                msj = n1 + " es un digito";
//                break;
//            case 6:
//                msj = n1 + " es un digito";
//                break;
//            case 7:
//                msj = n1 + " es un digito";
//                break;
//            case 8:
//                msj = n1 + " es un digito";
//                break;
//            case 9:
//                msj = n1 + " es un digito";
//                break;
//            default:
//                msj = n1 + " No es un digito";
//
//        }
        
        
        
 /*Cuarta forma::::::::::::::::::::::::::::::::::::::::::::*/
 
 if (n1 == 0){
            System.out.println(n1 + " es un digito.");
            flag = true;
        } else {
   /*--*/if (n1 == 1){
            System.out.println(n1 + " es un digito.");
            flag = true;
        } else {
   /*--*/if (n1 == 2){
            System.out.println(n1 + " es un digito.");
            flag = true;
        } else {
   /*--*/if (n1 == 3){
            System.out.println(n1 + " es un digito.");
            flag = true;
        } else {
   /*--*/if (n1 == 4){
            System.out.println(n1 + " es un digito."); 
            flag = true;
        } else {
   /*--*/if (n1 == 5){
            System.out.println(n1 + " es un digito.");
            flag = true;
        } else {
   /*--*/if (n1 == 6){
            System.out.println(n1 + " es un digito.");
            flag = true;
        } else {
   /*--*/if (n1 == 7){
            System.out.println(n1 + " es un digito.");
            flag = true;
        } else {
   /*--*/if (n1 == 8){
            System.out.println(n1 + " es un digito.");
            flag = true;
        } else {
   /*--*/if (n1 == 9){
            System.out.println(n1 + " es un digito.");
            flag = true;
        } else {
            flag = false;
   /*-Imnprimo el error-*/
       System.out.println("Error--No has ingresado un digito.");
        }
        }
        }
        }
        }
        }
        }
        }
        }
        }
 

        //No modificar  
    }
}
