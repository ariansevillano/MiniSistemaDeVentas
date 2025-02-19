package packagesistemadeventas.prueba;

import packagesistemadeventas.ventas.Producto;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("***Sistema de Ventas***");
        Producto producto1 = new Producto("1 kg Arroz", 3.80);
        System.out.println(producto1);
        Producto producto2 = new Producto("1 kg Lentejas", 4.40);
        System.out.println(producto2);
    }
}
