package Erpcompras.Models;

import Erpcompras.util.Calculable;
import Erpcompras.util.EstadoSolicitud;

public class Producto implements Calculable {
    private String id;
    private String nombre;
    private double precioUnitario;
    private int cantidad;
    private EstadoSolicitud estado;

    public Producto(String id, String nombre, double precioUnitario, int cantidad, EstadoSolicitud estado) {
        this.id = id;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public EstadoSolicitud getEstado() {
        return estado;
    }

    @Override
    public double calcularCostoTotal() {
        return 0;
    }
}
