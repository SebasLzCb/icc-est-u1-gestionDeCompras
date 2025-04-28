package Erpcompras.Models;

public class ProductoCosmetico extends Producto {
    private String descripcion;
    private Proveedor proveedor;

    public ProductoCosmetico(int id, String nombre, double precio, UnidadMedida unidad, String descripcion, Proveedor proveedor) {
        super(id, nombre, precio, unidad); // 👈 Correcto: llamamos al constructor de Producto
        this.descripcion = descripcion;
        this.proveedor = proveedor;
    }

    @Override
    public double calcularSubTotal() {
        return 0;
    }
}
