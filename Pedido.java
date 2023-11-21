import java.util.ArrayList;
import java.util.List;

// complejidad constante O(1)
class Pedido {
    Cliente cliente;
    List<ProductoPedido> productos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        productos.add(new ProductoPedido(producto, cantidad));
    }
}

// complejidad constante O(1)
class ProductoPedido {
    Producto producto;
    int cantidad;

    public ProductoPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
}