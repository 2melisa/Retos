import java.util.Scanner;
public class RetoIV {
    public static void main(String[] args) {
        //declarar variables
        String opc, opcA = null;
        int numAle;

        //instanciamos clase Scanner
        Scanner sc = new Scanner(System.in);

        //le damos la bienvenida al usuario
        System.out.println("¡Juguemos piedra, papel o tijera!");

            System.out.println("¿Cuál de los tres vas a elegir?");

            //capturamos opcion
            opc = sc.next();

            //creamos variable numAle para llamar al método ramdom de la clase Math para asi egenerar un número aleatorio de 0 a 2
            numAle = (int)(Math.random()*3);


            if (opc.toLowerCase().equals("piedra")||opc.toLowerCase().equals("papel")||opc.toLowerCase().equals("tijera")) {
                switch (numAle) {
                    case 0:
                        opcA = "piedra";

                        //piedra vs piedra
                        if (opc.equals(opcA)) {
                            System.out.println("¡Empate! La máquina también sacó " + opcA);
                            
                        }

                        //papel vs piedra
                        else if(opc.equalsIgnoreCase("tijera")){
                            System.out.println("¡Perdiste! La máquina sacó " + opcA);
                        }

                        //tijera vs piedra
                        else {
                            System.out.println("¡Ganaste! la máquina sacó " + opcA);
                        }
                    
                        break;
                    
                    case 1:
                        opcA = "papel";

                        if (opc.equals(opcA)) {
                            System.out.println("¡Empate! La máquina también sacó " + opcA);
                            
                        }else if (opc.equals("piedra")) {
                            System.out.println("¡Perdiste! La máquina sacó " + opcA);
                        }

                        else {
                            System.out.println("¡Ganaste! La máquina sacó " + opcA);
                        }
                        break;
                    
                    case 2:
                        opcA = "tijera";

                        if (opc.equals(opcA)) {
                            System.out.println("¡Empate! La máquina también sacó " + opcA);
                            
                        }else if (opc.equalsIgnoreCase("papel")){
                            System.out.println("¡Perdiste! la máquina sacó " + opcA);
                        }

                        else {
                            System.out.println("¡Ganaste! La máquina sacó " + opcA);
                        }
                        break;
                
                    default:
                        break;
                }
            } 
            else {
                System.out.println("La opción ingresada no existe.");
            }

        System.out.println("¡Hasta luego!");

        sc.close();
    }
    
}
