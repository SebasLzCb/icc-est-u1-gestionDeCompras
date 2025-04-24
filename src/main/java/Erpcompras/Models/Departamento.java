package Erpcompras.Models;

public class Departamento {
    private String id;
    private String nombre;

    public Departamento(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}