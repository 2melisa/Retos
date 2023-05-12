import java.util.Scanner;
public class RetoII {
    public static void main(String[] args) {
        //declarar variables
        String nEnf, nBebe, nPadre;
        int edad, peso, dosisV = 0;

        System.out.println("Bienvenido, aquí podrá saber la dosis adecuada para el bebé, su edad, su peso, el nombre de la enfermera que lo atendió y el del padre.");

        //instanciar clase scanner
        Scanner sc = new Scanner(System.in);

        //solicitar datos
        System.out.println("Ingrese el nombre del bebé: ");
        nBebe = sc.nextLine();
        System.out.println("Ingrese la edad del bebé en meses: ");
        edad = sc.nextInt();
        System.out.println("Ingrese el peso del bebé: ");
        peso = sc.nextInt();
        System.out.println("Ingrese el nombre de la enfermera: ");
        nEnf = sc.next();
        System.out.println("Ingrese el nombre del padre: ");
        nPadre = sc.next();

        //realizar cálculo de la dosis adecuada para el bebe
        dosisV = (peso + 10)/(edad + 10) * 8;

        //mostrar datos y dosis
        System.out.println("La dosis adecuada para el bebé " + nBebe + " con " + edad + " meses de edad es de: " + dosisV);
        System.out.println("El padre del bebé " + nBebe + " se llama " + nPadre);
        System.out.println("El bebé " + nBebe + " fué atendido por la enfermera " + nEnf);

        System.out.println("¡Hasta luego!");

        //cerrar buffer
        sc.close();

        
    }
}
