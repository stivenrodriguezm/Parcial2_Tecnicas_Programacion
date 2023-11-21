import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada;
        List<Producto> productos = new ArrayList<>();
        // complejidad linealitmica O(N)
        do {
            System.out.println("1. Agregar producto");
            System.out.println("2. Procesar pedido");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Salir");

            entrada = sc.nextInt();
            switch (entrada) {
                case 1:
                    agregarProducto(productos, sc);
                    break;
                case 2:
                    procesarProductos(productos);
                    break;
                case 3:
                    mostrarProductos(productos);
                    break;
            }
        } while (entrada != 4);
    }

    // complejidad constante O(1)
    private static void agregarProducto(List<Producto> productos, Scanner sc) {
        System.out.println("Ingresa el tipo de producto: ");
        System.out.println("1. Telefono");
        System.out.println("2. Laptop");
        System.out.println("3. Accesorio");
        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.println("Nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Descripcion: ");
        String descripcion = sc.nextLine();

        System.out.println("Precio: ");
        double precio = sc.nextDouble();

        System.out.println("Cantidad: ");
        int cantidad = sc.nextInt();

        switch (tipo) {
            case 1:
                productos.add(new Telefono(nombre, descripcion, precio, cantidad));
                break;
            case 2:
                productos.add(new Laptop(nombre, descripcion, precio, cantidad));
                break;
            case 3:
                productos.add(new Accesorio(nombre, descripcion, precio, cantidad));
                break;
            default:
                System.out.println("Tipo de producto no válido.");
        }
    }

    // complejidad constante O(1)
    private static void procesarProductos(List<Producto> productos) {
        // Implement processing logic here
        System.out.println("Procesando pedido...");
    }

    // complejidad constante O(1)
    private static void mostrarProductos(List<Producto> productos) {
        System.out.println("Productos:");
        for (Producto producto : productos) {
            System.out.println(producto.nombre);
        }
    }
}

// complejidad constante O(1)
class Producto {
    String nombre;
    String descripcion;
    double precio;
    int cantidad;

    public Producto(String nombre, String descripcion, double precio, int cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }
}

// complejidad constante O(1)
class Telefono extends Producto {
    public Telefono(String nombre, String descripcion, double precio, int cantidad) {
        super(nombre, descripcion, precio, cantidad);
    }
}

// complejidad constante O(1)
class Laptop extends Producto {
    public Laptop(String nombre, String descripcion, double precio, int cantidad) {
        super(nombre, descripcion, precio, cantidad);
    }
}

// complejidad constante O(1)
class Accesorio extends Producto {
    public Accesorio(String nombre, String descripcion, double precio, int cantidad) {
        super(nombre, descripcion, precio, cantidad);
    }
}

// complejidad constante O(1)
class Cliente {
    String nombre;
    String direccion;
    List<Pedido> pedidos;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pedidos = new ArrayList<>();
    }
}
