package Erpcompras.Models;

public class ProductoPeriferico extends Producto {
    private String tipo;
    private Proveedor proveedor;

    public ProductoPeriferico(int id, String nombre, double precio, UnidadMedida unidad, String tipo, Proveedor proveedor) {
        super(id, nombre, precio, unidad); // 👈 Correcto: llamar al constructor del padre con 4 parámetros
        this.tipo = tipo;
        this.proveedor = proveedor;
    }

    @Override
    public double calcularSubTotal() {
        return 0;
    }
}
