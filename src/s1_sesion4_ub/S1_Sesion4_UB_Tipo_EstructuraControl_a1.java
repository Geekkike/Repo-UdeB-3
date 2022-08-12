package s1_sesion4_ub;

import java.util.Scanner;

/*@author Alpine*/
public class S1_Sesion4_UB_Tipo_EstructuraControl_a1 {

    public static void main(String[] args) {
        /* «Las oportunidades no pasan, las creas» *CHRIS GROSSER */

 /*1.2.5. El dueño de una tienda compra un articulo a un precio determinado.
        obtener el precio en que lo debe vender para obtener una ganancia del 30%
         */
        Scanner intro = new Scanner(System.in);
        double compra, vlorNeto;

        System.out.println("Digite el valor de la compra: ");
        compra = intro.nextDouble();
        
        //Vamos a validadr con un condicional

        if (compra > 0){
            vlorNeto = compra * 1.3;
            System.out.println("El valor de venta debe ser: " + vlorNeto);
           
        }else {
         System.out.println("Error al ingresar el valor");
        }
        

    }

}


// //Cosntruccion de variables
//        String modalidad=""; //Profesional - Preparatoria
//        double factura=0,facturaNeta=0; //Profesional $300 por cada cinco unidades / Preparatoria $180 por cada cinco unidades
//        double promedio=0, descuento=0, porcentaje=0; //
//        byte unidad=0, cantidadReprobada=0; //Cantidad de unidades que le permiten al estudiante        
//        boolean bandera = false;
//        
//        /*Restricciones
//            1. Modalidad solo permite Profesional o Preparatoria
//            2. La nota debe ser de 0-10
//            3. Cumplir una de las condiciones para obtener una cantidad de unidades
//            4. Cumplir una de las condiciones para obtener el descuento
//        */
//        
//        //Creación del objeto de entrada teclado
//        Scanner scanner = new Scanner(System.in);
//               
//        do {
//            //Captura de datos
//            System.out.print("Digite la modalidad 'Profesional/Preparatoria': ");
//            modalidad = scanner.next();
//            if (modalidad.equals("Preparatoria")){
//                System.out.println("OK Pre");
//                
//                do {
//                    System.out.print("Digite el promedio: ");
//                    promedio = scanner.nextDouble();
//                    if (promedio>=0 && promedio<=10){
//                        System.out.println("OK Pro");
//                        //Preparatoria $180 por cada cinco unidades                        
//                        if(promedio>=9.5){                            
//                            // 25% de descuento
//                            unidad = 55;  
//                            porcentaje = 0.25;                            
//                        }
//                        
//                        if(promedio>=9 && promedio<9.5){                            
//                            // 10% de descuento
//                            unidad = 50;                            
//                            porcentaje = 0.1;
//                        }
//                        
//                        if(promedio>7 && promedio<9){                            
//                            // 0% de descuento
//                            unidad = 50;                            
//                            porcentaje = 0;                           
//                        }
//                        
//                        if(promedio<=7){                            
//                            // 0% de descuento
//                            while(bandera==false){                                
//                                try {
//                                    System.out.print("Cantidad materia reprobada '0/8': ");
//                                    cantidadReprobada = Byte.parseByte(scanner.next());
//
//                                    if(cantidadReprobada>0 && cantidadReprobada<=3){                            
//                                        // 0% de descuento
//                                        unidad = 45;                            
//                                        porcentaje = 0;  
//                                        bandera = true;
//                                    }else if(cantidadReprobada>4 && cantidadReprobada<=8){
//                                        unidad = 40;
//                                        porcentaje = 0;
//                                        bandera = true;
//                                    }
//                                } catch (Exception e) {
//                                    System.out.println("Solo datos enteros.");
//                                }
//                            }                                                     
//                        }
//                        factura = (unidad/5)*180;                        
//                    }else{
//                        System.out.println("El promedio ingresado no es valido.");
//                    }
//                }while(bandera == false);
//            }else if(modalidad.equals("Profesional")){
//                System.out.println("OK Pro");
//                
//                do{
//                   System.out.print("Digite el promedio: ");
//                   promedio = scanner.nextDouble();
//                   if(promedio>=0 && promedio<=10){
//                       System.out.println("OK Pro");
//                       //Preparatoria $300 por cada cinco unidades                        
//                       if(promedio>=9.5){                            
//                            // 20% de descuento
//                            unidad = 55;  
//                            porcentaje = 0.20;                                                       
//                       }else{
//                            unidad = 55;
//                            porcentaje = 0;
//                       }
//                       factura = (unidad/5)*300;
//                       bandera = true;
//                   }                    
//                }while(bandera==false);
//            }else{
//                System.out.println("Ha ingresado una modalidad no valida");
//            }
//        }while(bandera == false);
//     
//        descuento = factura*porcentaje;                                                       
//        facturaNeta = factura-descuento;
//                        
//        System.out.println("Detalle de la factura*****");
//        System.out.println("Promedio: "+promedio);
//        System.out.println("Cantidad unidades: "+unidad);
//        System.out.println("Valor bruto: "+factura);
//        System.out.println("Decuento: "+descuento);        
//        System.out.println("Valor neto: "+facturaNeta);