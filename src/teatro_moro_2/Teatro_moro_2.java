
package teatro_moro_2;


import java.util.Scanner;


public class Teatro_moro_2 {

static Scanner Entrada = new Scanner(System.in);   
    public static void main(String[] args) {
                                                                                //definir varibles//
        int opcion,edad;
        int saldo=0;
        int zona=0;
        int vip=25000;
        int platea=19000;
        int palcos=7000;
        float estudiante =10;
        float tercera_edad =15;
        String entradax2= null,nombrezona = null,compra = null;
        float total=0;
        String montototal= String.format("%.0f",total);                //String.format("%.0f") utilizado para corregir el monto final con el descuento aplicado
        int montototal1 = Integer.parseInt(montototal);                       //definir varibles//
         
        
                                                                                //bienvenida al sistema//
        System.out.println("Bienvenido al teatro moro");
        System.out.println("");
        
        do{                                                                     //bucle de error de eleccion de bienvenida
            System.out.println("seleccione su opcion (1/2)");
        System.out.println("(1) - Comprar entrada ");
        System.out.println("(2) - Salir ");
        opcion =Entrada.nextInt();
        System.out.println("");
                                                                                //bienvenida al sistema//
       
       
        switch (opcion){                                                        
            case 1:
                System.out.println(" !!!zonas_disponibles!!! ");
                System.out.println("|  Sectores  | precios |");
                System.out.println("| (1)- Vip   | $25000  | ");
                System.out.println("| (2)-platea | $19000  | ");
                System.out.println("| (3)-palcos | $7000   | ");
                System.out.println("");
                do{                                                             //bucle de error de eleccion de zona
                System.out.println("seleccione una zona(1/2/3)");
                zona=Entrada.nextInt();
                    switch (zona){ 
                        case 1:  
                            System.out.println("perfecto zona !vip! saldria un total de: $"+vip);
                            saldo=(vip);
                            nombrezona=("vip");
                            break;
                        case 2: 
                            System.out.println("perfecto zona !platea! saldria un total de: $"+platea);
                            saldo=(platea);
                            nombrezona=("platea");
                            break;
                            
                        case 3:
                            System.out.println("perfecto zona !palcos! saldria un total de: $"+palcos);
                            saldo=(palcos);
                            nombrezona=("palcos");
                            break;
                            
                        default:
                            System.out.println("!opcion invalida!");
                            System.out.println("");
                            break;
                                }                    
                       } while (zona<1||zona>3);                                //termino del bucle de error de eleccion de zona
                                
                                do{                                             //ingreso de edad
                                System.out.println("");
                                System.out.println("ingrese su edad");
                                edad=Entrada.nextInt();
                                System.out.println("");
                                if (edad<5||edad>100){
                                    System.out.println("edad incorrecta");
                                }
                                } while (edad<5 || edad>100);                   //bucle en caso de ingresar una edad incorrecta
                                if (edad<18){
                                    estudiante=(estudiante/100);
                                    total= (estudiante*saldo);
                                    total=(saldo-total);
                                    montototal1=(int) (total);
                                    System.out.println("zona Elegida: "+ nombrezona);
                                    System.out.println("precio base es: $"+saldo);
                                    System.out.println("10% de descuento");
                                    System.out.println("por ser estudiante tu monto a cancelar es: $"+montototal1);
                                            }
                                else if (edad>59){
                                    tercera_edad=(tercera_edad/100);
                                    total=(tercera_edad*saldo);
                                    total=(saldo-total);
                                    montototal1=(int) (total);
                                    System.out.println("zona Elegida: "+nombrezona);
                                    System.out.println("precio base es: $"+saldo);
                                    System.out.println("15% de descuento");
                                    System.out.println("por ser adulto mayor tu monto a cancelar es: $"+montototal1);
                                        }
                                else {
                                    total=(saldo);
                                    montototal1=(int) (total);
                                    System.out.println("zona Elegida: " +nombrezona);
                                    System.out.println("precio base es: $"+saldo);
                                    System.out.println("0% de descuento");
                                    System.out.println("monto a pagar es: $"+montototal1);           
                                    }                                                                           
                                            Entrada.nextLine();                                                 //salto de linea al momento de cambiar un nextint a nextline
                                            do{                                                                 //bucle de opcion pagar
                                            System.out.println("");
                                            System.out.println("presione PAGAR para finalizar la compra");
                                            
                                            compra=Entrada.nextLine().toLowerCase();
                                                if (compra.equals("pagar")){
                                                System.out.println("MUCHAS GRACIAS POR TU COMPRA");
                                                break;
                                                }
                                                else {
                                                       System.out.println("opcion invalida"); 
                                                        }
                                   } while (!compra.equals("pagar"));                                    //termino bucle de opcion pagar
                                    
                                    System.out.println("");
                                    System.out.println("Necesitas otra entrada (si/no)");
                                    entradax2=Entrada.nextLine().toLowerCase();
                                    System.out.println("");
                                        if (entradax2.equals("si")){
                                        entrada();                                                              //public static void entrada() de abajo     
                                        break;
                                        }
                                        else {System.out.println("PERFECTO");}
                                            
                
                 
            case 2:
                System.out.println("! HASTA LUEGO !");
                break;
            default:
                System.out.println("! eleccion incorrecta !");
                System.out.println("");
                break;
                        } 
         }while (opcion<1||opcion>2);                                           //termino del bucle de error de eleccion de zona
        
                System.out.println("FIN DEL PROGRAMA");
    }
    public static void entrada(){                                               //codigo entrada cuando el cliente solicita otra entrada
        
        int opcion;
        int edad;
        int saldo=0;
        int zona=0;
        int vip=25000;
        int platea=19000;
        int palcos=7000;
        float estudiante =10;
        float tercera_edad =15;
        String entradax2 = null;
        String nombrezona = null;
        String compra = null;
        
        float total=0;
        String montototal= String.format("%.0f",total);
        int montototal1 = Integer.parseInt(montototal); 
        
        
                System.out.println(" !!!zonas_disponibles!!! ");
                System.out.println("|  Sectores  | precios |");
                System.out.println("| (1)- Vip   | $25000  | ");
                System.out.println("| (2)-platea | $19000  | ");
                System.out.println("| (3)-palcos | $7000   | ");
                System.out.println("");
        do{
                System.out.println("seleccione una zona(1/2/3)");
                zona=Entrada.nextInt();
                    switch (zona){ 
                        case 1:  
                            System.out.println("perfecto zona !vip! saldria un total de: $"+vip);
                            saldo=(vip);
                            nombrezona=("vip");
                            break;
                        case 2: 
                            System.out.println("perfecto zona !platea! saldria un total de: $"+platea);
                            saldo=(platea);
                            nombrezona=("platea");
                            break;
                            
                        case 3:
                            System.out.println("perfecto zona !palcos! saldria un total de: $"+palcos);
                            saldo=(palcos);
                            nombrezona=("palcos");
                            break;
                            
                        default:
                            System.out.println("!opcion invalida!");
                            System.out.println("");
                            break;
                                }                    
                       
                    
                                System.out.println("");
                                System.out.println("ingrese su edad");
                                edad=Entrada.nextInt();
                                System.out.println("");
                                
                                if (edad<18){
                                    estudiante=(estudiante/100);
                                    total= (estudiante*saldo);
                                    total=(saldo-total);
                                    montototal1=(int) (total);
                                    System.out.println("zona Elegida: "+ nombrezona);
                                    System.out.println("precio base es: $"+saldo);
                                    System.out.println("10% de descuento");
                                    System.out.println("por ser estudiante tu monto a cancelar es: $"+montototal1);
                                            }
                                else if (edad>59){
                                    tercera_edad=(tercera_edad/100);
                                    total=(tercera_edad*saldo);
                                    total=(saldo-total);
                                    montototal1=(int) (total);
                                    System.out.println("zona Elegida: "+nombrezona);
                                    System.out.println("precio base es: $"+saldo);
                                    System.out.println("15% de descuento");
                                    System.out.println("por ser adulto mayor tu monto a cancelar es: $"+montototal1);
                                                   }
                                else {
                                    total=(saldo);
                                    montototal1=(int) (total);
                                    System.out.println("zona Elegida: " +nombrezona);
                                    System.out.println("precio base es: $"+saldo);
                                    System.out.println("0% de descuento");
                                    System.out.println("monto a pagar es: $"+montototal1);           
                                    }
                                            System.out.println("");
                                            System.out.println("presione PAGAR para finalizar la compra");
                                            Entrada.nextLine();
                                            compra=Entrada.nextLine().toLowerCase();
                                                if (compra.equals("pagar")){
                                                System.out.println("MUCHAS GRACIAS POR TU COMPRA");
                                                break;
                                                }
                                   } while (zona<0||zona>3|| compra.equals("pagar"));
        
                                    System.out.println("");
                                    System.out.println("Necesitas otra entrada (si/no)");
                                    entradax2=Entrada.nextLine().toLowerCase();
                                    System.out.println("");
                                        if (entradax2.equals("si")){
                                        entrada();
                                        }
                                        else {System.out.println("PERFECTO");}      
                                }
   
                            }


          
       
       
        
    

