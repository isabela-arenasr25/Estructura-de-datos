import java.util.ArrayList;
import java.util.Iterator;

public class Carrito<T extends Producto> implements Iterable<T> {

    private ArrayList<T> productos;

    public Carrito() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(T producto) {
        productos.add(producto);
    }

    public T productoMayorPrecio() {

        T mayor = productos.get(0);

        for (T producto : productos) {

            if (producto.getPrecio() > mayor.getPrecio()) {
                mayor = producto;
            }
        }

        return mayor;
    }

    public double precioTotal() {

        double total = 0;

        for (T producto : productos) {
            total = total + producto.getPrecio();
        }

        return total;
    }

    // Nuestro propio iterador
    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {

            int posicion = 0;

            @Override
            public boolean hasNext() {
                return posicion < productos.size();
            }

            @Override
            public T next() {
                T producto = productos.get(posicion);
                posicion++;
                return producto;
            }
        };
    }
}