package s1_sesion1_ub;

import java.util.Scanner;

/*@author Alpine*/
public class S1_Sesion1_UB_x1 {

    public static void main(String[] args) {
        /* «Las oportunidades no pasan, las creas» *CHRIS GROSSER */
        float n1;
        float n2;
        float n3;
        float suma;

//      En este caso tambien podemos realizar asi la misma var 
//      float n1, n2, n3, suma;
//      Tener encuenta *format* Alt+Shift+F

        Scanner intro = new Scanner(System.in);
//       Scanner como objeto = new scanner como clase

        System.out.println("Ingresa el numero 1: ");
        n1 = intro.nextFloat();
        System.out.println("Ingresa el numero 2: ");
        n2 = intro.nextFloat();
        System.out.println("Ingresa el numero 3: ");
        n3 = intro.nextFloat();

        suma = n1 + n2 + n3;
        System.out.println("El resultado es: " + suma);
//
//      System.out.println("El resultado es: " + suma);

    }
}
