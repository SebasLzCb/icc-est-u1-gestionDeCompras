package Erpcompras.Models;

public class ProductoDulce extends Producto {
    private String sabor;
    private Proveedor proveedor;

    public ProductoDulce(int id, String nombre, double precio, UnidadMedida unidad, String sabor, Proveedor proveedor) {
        super(id, nombre, precio, unidad); // 👈 Llamamos bien al constructor del padre
        this.sabor = sabor;
        this.proveedor = proveedor;
    }

    public String informacionDulce() {
        return "Sabor: " + sabor;
    }

    @Override
    public double calcularSubTotal() {
        return 0;
    }
}
