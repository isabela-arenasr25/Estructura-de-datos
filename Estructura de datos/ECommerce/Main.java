public class Main {

    public static void main(String[] args) {

        Carrito<Producto> carrito = new Carrito<>();

        Producto producto1 = new Producto("Teclado", 150000);
        Producto producto2 = new Producto("Mouse", 50000);
        Producto producto3 = new Producto("Audifonos", 120000);

        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);

        System.out.println("PRODUCTOS DEL CARRITO:");

        for (Producto producto : carrito) {
            System.out.println(producto);
        }

        System.out.println();

        System.out.println("PRODUCTO DE MAYOR PRECIO:");

        System.out.println(carrito.productoMayorPrecio());

        System.out.println();

        System.out.println("PRECIO TOTAL:");

        System.out.println("$" + carrito.precioTotal());
    }
}