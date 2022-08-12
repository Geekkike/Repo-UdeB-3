package s1_sesion3_ub;

import java.util.Scanner;

/*@author Alpine*/
public class S1_Sesion3_UB_EC_x2 {

        public static void main(String[] args) {
        /* «Las oportunidades no pasan, las creas» *CHRIS GROSSER */
        
        byte diaSemana;
        String msj = null;
        
        Scanner intro = new Scanner(System.in);
        
            System.out.println("Digite el número para obtener dia de la semana: ");
            diaSemana = intro.nextByte();
            
            
            
            switch(diaSemana){
                case 1 -> msj = "Lunes";
                case 2 -> msj = "Martes";
                case 3 -> msj = "Miercoles";
                case 4 -> msj = "Jueves";
                case 5 -> msj = "Viernes";
                case 6 -> msj = "Sabado";
                case 7 -> msj = "Domingo";
                default -> {
                    System.out.println("No se invente otro dia de la semana");
                }
            }
            System.out.println("Seleccionaste el " + msj);
            
          /*Opcional ..........N2.........*/  
          
//            switch (diaSemana){
//                case 1:
//                    msj = "Lunes";
//                    break;
//                case 2:
//                    msj = "Martes";
//                    break;
//                case 3:
//                    msj = "Miercoles";
//                    break;
//                case 4:
//                    msj = "Jueves";
//                    break;
//                case 5:
//                    msj = "Viernes";
//                    break;
//                case 6:
//                    msj = "Sabado";
//                    break;
//                case 7:
//                    msj = "Domingo";
//                    break;
//                default: {
//                    System.out.println("No existe el dia de la semana");
//                }  
//            }
//           System.out.println("Seleccionaste el " + msj);
           
           
/*No pasar*/
}
}
