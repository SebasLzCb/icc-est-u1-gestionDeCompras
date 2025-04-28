package Erpcompras.Models;

public abstract class Producto {
    private int id;
    private String nombre;
    private double precioUnitario;
    private UnidadMedida unidad;

    public Producto(int id, String nombre, double precioUnitario, UnidadMedida unidad) {
        this.id = id;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.unidad = unidad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public UnidadMedida getUnidad() {
        return unidad;
    }

    public abstract double calcularSubTotal();

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", unidad=" + unidad +
                '}';
    }
}
