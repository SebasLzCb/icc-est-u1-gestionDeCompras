package Erpcompras.Models;

public class ProductoSimple extends Producto {
    public ProductoSimple(int id, String nombre, double precioUnitario, UnidadMedida unidad) {
        super(id, nombre, precioUnitario, unidad);
    }

    @Override
    public double calcularSubTotal() {
        return 0;
    }
}
