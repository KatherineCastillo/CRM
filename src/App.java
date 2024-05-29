import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<producto> listProducto = new ArrayList<>();
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);
        while (continuar) {
            System.out.println("Ingrese el id del producto");
            int idProduct = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer después de nextInt()

            System.out.println("Ingrese el nombre del producto");
            String nombreProduct = scanner.nextLine();

            System.out.println("Ingrese la marca del producto");
            String marcaProduct = scanner.nextLine();

            System.out.println("Ingrese el precio del producto");
            double precioProduct = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer después de nextDouble()

            producto product = new producto(idProduct, nombreProduct, marcaProduct, precioProduct);
            listProducto.add(product);

            System.out.println("Desea agregar otro registro? (s/n)");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }
        System.out.println("Lista de productos registrados:");
        Iterator<producto> productoIterator = listProducto.iterator();
        while (productoIterator.hasNext()) {
            producto product = productoIterator.next();
            System.out.println(product);
        }

        scanner.close();
    }



}
