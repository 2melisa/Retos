import java.util.Scanner;
public class RetoVI {
    public static void main(String[] args) {

        System.out.println("Bienvenido. Aquí podrá ingresar n cantidad de productos, el precio de cada uno y el valor total de la compra.");
        //declarar variables
        int cProductos, precioP, total = 0;

        //instanciar clase Scanner
        Scanner sc = new Scanner(System.in);

        //solicitar cantidad de productos
        System.out.println("Ingrese la cantidad de productos: ");
        cProductos = sc.nextInt();

        //ciclo para ingresar los precios de los productos
        for (int cont = 0; cont < cProductos; cont++) {
            System.out.println("Ingrese el precio del producto #" + (cont + 1) + ": ");
            precioP = sc.nextInt();

            //calculo del total de la compra
            total += precioP;
        }

        //se muestra el total de la compra
        System.out.println("El total de la compra es de: " + total);
        System.out.println("¡Hasta luego!");

        //cerrar buffer
        sc.close();

    }
}
