package packagesistemadeventas.ventas;

import packagesistemadeventas.ventas.Producto;

public class Producto {
    private static int contador = 0;
    private int idProducto;
    private String nombre;
    private double precio;

    public Producto() {
    }

    public Producto(String nombre, double precio) {
        Producto.contador++;
        this.idProducto = Producto.contador;
        this.nombre = nombre;
        this.precio = precio;
    }

    public static int getContador() {
        return contador;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + this.idProducto +
                ", nombre='" + this.nombre + '\'' +
                ", precio=" + this.precio +
                '}';
    }
}
