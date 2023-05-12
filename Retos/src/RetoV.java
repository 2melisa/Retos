import java.util.Scanner;
public class RetoV {
    public static void main(String[] args) {
        //declarar variables
        int diaN, mesN;

        //instanciar clase scanner
        Scanner sc = new Scanner(System.in);

        //solicitar al usuario el día y mes de nacimiento
        System.out.print("Ingresa el día y mes de tu nacimiento (separados por espacio): ");

        //capturamos datos
        diaN = sc.nextInt();
        mesN = sc.nextInt();


        //evaluamos el dato capturado en la variable mesN
        switch (mesN) {
            //en caso de que el valor ingresado sea 1
            case 1:
                //si el valor capturado en la variable diaN es mayor o igual a 1 y menor o igual que 20, entonces:
                if (diaN >= 1 && diaN <= 20) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de enero, por ende, tu signo zodiacal es Capricornio.");
                }
                //si el valor capturado en la variable diaN es mayor o igual a 21 y menor o igual que 31, entonces:
                if (diaN >= 21 && diaN <= 31) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de enero, por ende, tu signo zodiacal es Acuario.");
                }
                //si el valor capturado en la variable diaN es mayor que 31, entonces:
                if (diaN > 31){
                    System.out.println("El día ingresado es inválido");
                }
            //se rompe el caso
            break;
            
            case 2:

                if (diaN >= 1 && diaN <= 19) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de febrero, por ende, tu signo zodiacal es Acuario.");
                }
                if (diaN >= 20 && diaN <= 29) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de febrero, por ende, tu signo zodiacal es Piscis.");
                }
                else{
                    System.out.println("El día ingresado es inválido");
                }
            break;
            
            case 3:

                if (diaN >= 1 && diaN <= 20) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de marzo, por ende, tu signo zodiacal es Piscis.");
                }
                if (diaN >= 21 && diaN <= 31) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de marzo, por ende, tu signo zodiacal es Aries.");
                }
                else{
                    System.out.println("El día ingresado es inválido");
                }
            break;

            case 4:

                if (diaN >= 1 && diaN <= 20) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de abril, por ende, tu signo zodiacal es Aries.");
                }
                if (diaN >= 21 && diaN <= 31) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de abril, por ende, tu signo zodiacal es Tauro.");
                }
                else{
                    System.out.println("El día ingresado es inválido");
                }
            break;

            case 5:

                if (diaN >= 1 && diaN <= 20) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de mayo, por ende, tu signo zodiacal es Tauro.");
                }
                if (diaN >= 21 && diaN <= 31) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de mayo, por ende, tu signo zodiacal es Géminis.");
                }
                if (diaN > 31){
                    System.out.println("El día ingresado es inválido");
                }
            break;

            case 6:

                if (diaN >= 1 && diaN <= 20) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de junio, por ende, tu signo zodiacal es Géminis.");
                }
                if (diaN >= 21 && diaN <= 31) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de junio, por ende, tu signo zodiacal es Cáncer.");
                }
                if (diaN > 31){
                    System.out.println("El día ingresado es inválido");
                }
            break;

            case 7:

                if (diaN >= 1 && diaN <= 22) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de julio, por ende, tu signo zodiacal es Cáncer.");
                }
                if (diaN >= 23 && diaN <= 31) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de julio, por ende, tu signo zodiacal es Leo.");
                }
                if (diaN > 31){
                    System.out.println("El día ingresado es inválido");
                }
            break;

            case 8:

                if (diaN >= 1 && diaN <= 23) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de agosto, por ende, tu signo zodiacal es Leo.");
                }
                if (diaN >= 24 && diaN <= 31) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de agosto, por ende, tu signo zodiacal es Virgo.");
                }
                if (diaN > 31){
                    System.out.println("El día ingresado es inválido");
                }
            break;

            case 9:

                if (diaN >= 1 && diaN <= 22) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de septiembre, por ende, tu signo zodiacal es Virgo.");
                }
                if (diaN >= 23 && diaN <= 31) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de septiembre, por ende, tu signo zodiacal es Libra.");
                }
                if (diaN > 31){
                    System.out.println("El día ingresado es inválido");
                }
            break;

            case 10:

                if (diaN >= 1 && diaN <= 23) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de octubre, por ende, tu signo zodiacal es Libra.");
                }
                if (diaN >= 24 && diaN <= 31) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de octubre, por ende, tu signo zodiacal es Escorpio.");
                }
                if (diaN > 31){
                    System.out.println("El día ingresado es inválido");
                }
            break;

            case 11:

                if (diaN >= 1 && diaN <= 22) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de noviembre, por ende, tu signo zodiacal es Escorpio.");
                }
                if (diaN >= 23 && diaN <= 31) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de noviembre, por ende, tu signo zodiacal es Sagitario.");
                }
                if (diaN > 31){
                    System.out.println("El día ingresado es inválido");
                }
            break;

            case 12:

                if (diaN >= 1 && diaN <= 20) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de diciembre, por ende, tu signo zodiacal es Sagitario.");
                }
                if (diaN >= 21 && diaN <= 31) {
                    System.out.println("Tu fecha de nacimento es del día " + diaN + " del mes de diciembre, por ende, tu signo zodiacal es Capricornio.");
                }
                if (diaN > 31){
                    System.out.println("El día ingresado es inválido");
                }
            break;
        
            default:
            //si el mes es mayor que 12 le dice que es inválido
            System.out.println("El mes ingresado es inválido");
                break;

            
        }
        System.out.println("¡Hasta luego!");

        //cerrar buffer
        sc.close();
    }
}
