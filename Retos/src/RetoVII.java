import java.util.Scanner;
public class RetoVII {
    public static void main(String[] args) {
            //instanciar clase scanner
            Scanner sc = new Scanner(System.in);
    
            //declarar variables
            String lado, ladoA = null;
            int numAle, resp;
        
        //Se ejecutará por lo menos una vez
        do{
            //solicitar al usuario que ingrese una opción entre cara y sello
            System.out.println("Ingresa un lado entre cara o sello: ");
    
            //capturar valor ingresado
            lado = sc.next();
            
            //se crea variable en donde se llama el método de la clase random para generar un número aleatorio
            numAle = (int)(Math.random()*2);
    
            //si el valor ingresado en la variable lado es igual a cara o sello
            if (lado.toLowerCase().equals("cara")||lado.toLowerCase().equals("sello")) {
                
                //evaluamos el número aleatorio
                switch (numAle) {

                    //en caso de que el número aleatorio que salga sea 0 se le va a asignar a la variable ladoA el valor de "cara"
                    case 0:
                    ladoA = "cara";
    
                    if (lado.toLowerCase().equals(ladoA)) {
                        System.out.println("Le atinaste, el lado que cayó fué " + ladoA);
                            
                    } else {
                        System.out.println("Que lástima, no le atinaste, el lado que cayó fué " + ladoA);   
                    }
                        
                        break;
                    case 1:
                    ladoA = "sello";
    
                    if (lado.toLowerCase().equals(ladoA)) {
                        System.out.println("Le atinaste, el lado que cayó fué " + ladoA);
                            
                    } else {
                        System.out.println("Que lástima, no le atinaste el lado que cayó fué " + ladoA);  
                            
                    }                
                        break;
    
                    default:
                        break;
                }
            }else{
                System.out.println("Ese lado de la moneda no existe.");
            }

            //Se le pregunta al usuario si desa volver a jugar
            System.out.println("¿Quieres volver a jugar? 1.si 2.no");
            resp = sc.nextInt();

        //mientras la respuesta capturada sea igual a 1 se repetirá todo el ciclo    
        } while(resp == 1);

        System.out.println("¡Hasta luego!");
    
        //cerrar buffer
        sc.close();
    }
}
