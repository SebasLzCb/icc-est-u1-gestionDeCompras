package Erpcompras.Models;

public class Proveedor extends Persona {
    private String ruc;
    private String empresa;

    public Proveedor(String cedula, String nombre, String ruc, String empresa) {
        super(cedula, nombre);
        this.ruc = ruc;
        this.empresa = empresa;
    }

    public String getRuc() {
        return ruc;
    }

    public String getEmpresa() {
        return empresa;
    }

    @Override
    public void mostrarInformacion() {
        
    }
}
