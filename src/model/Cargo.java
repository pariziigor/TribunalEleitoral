package model;

public class Cargo implements IMostrarDados {
    private int idCargo;
    private String cargo;

    public Cargo(int idCargo, String cargo) {
        this.idCargo = idCargo;
        this.cargo = cargo;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Cargo:" + cargo);
    }
}
