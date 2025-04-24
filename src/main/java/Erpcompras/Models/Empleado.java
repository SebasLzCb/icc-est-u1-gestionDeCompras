package Erpcompras.Models;

public class Empleado extends Persona {
    private Departamento departamento;

    public Empleado(String id, String nombre, Departamento departamento) {
        super(id, nombre);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + ", Departamento: " + departamento.getNombre());
    }

}

