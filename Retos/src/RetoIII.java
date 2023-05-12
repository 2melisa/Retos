import java.util.Scanner;
public class RetoIII {

    public static void main(String[] args) {
        //instanciar clase scanner
        Scanner sc = new Scanner(System.in);

        //declarar variables
        String lado, ladoA = null;
        int numAle;

        //solicitar al usuario que ingrese una opción entre cara y sello
        System.out.println("Ingresa un lado entre cara o sello: ");

        //capturar valor ingresado
        lado = sc.next();

        numAle = (int)(Math.random()*2);

        if (lado.toLowerCase().equals("cara")||lado.toLowerCase().equals("sello")) {
            
        

            switch (numAle) {
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

    sc.close();
    }
}
