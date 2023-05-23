package model;

public class Candidato implements IMostrarDados {
    private int numero;
    private String nome;
    private Cargo cargo;
    private Partido partido;

    public Candidato(int numero, String nome, Cargo cargo, Partido partido) {
        this.numero = numero;
        this.nome = nome;
        this.cargo = cargo;
        this.partido = partido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    @Override
    public void mostrarDados() {
        System.out.println("\nNome do candidato:" + nome + "\nCargo:" + cargo.getCargo() + "\nPartido:" + partido.getNome());
    }
}
