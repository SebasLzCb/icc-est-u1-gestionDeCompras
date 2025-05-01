package Erpcompras.Models;

public class Empleado extends Persona {
    private Departamento departamento;

    public Empleado(String nombre, String apellido, String dni, Departamento departamento) {
        super(nombre, apellido, dni);
        this.departamento = departamento;

    }

    public Departamento getDepartamento() { return departamento; }
    public void setDepartamento(Departamento departamento) { this.departamento = departamento; }

    @Override
    public String toString() {
        return super.toString() + " - " + departamento.toString();
    }
}
