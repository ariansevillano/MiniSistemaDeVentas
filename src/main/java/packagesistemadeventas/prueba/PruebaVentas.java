package packagesistemadeventas.prueba;

import packagesistemadeventas.ventas.Orden;
import packagesistemadeventas.ventas.Producto;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("***Sistema de Ventas***");
        Producto producto1 = new Producto("1 kg Arroz", 3.80);
        Producto producto2 = new Producto("1 kg Lentejas", 4.40);


        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        //orden1.mostrarOrden();
        System.out.println(orden1);
        Orden orden2 = new Orden();
        //También podríamos primero crear la variable, pero así también se puede
        orden2.agregarProducto(new Producto("1 kg Chuleta de cerdo",45.50));
        //la única diferencia es que ese objeto creado ya no puede ser reutilizado
        orden2.agregarProducto(producto2);
        //orden2.mostrarOrden();
        System.out.println(orden2);
    }
}
