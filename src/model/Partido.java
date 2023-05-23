package model;

public class Partido implements IMostrarDados {
    private int numero;
    private String nome;
    private String sigla;

    public Partido(int numero, String nome, String sigla) {
        this.numero = numero;
        this.nome = nome;
        this.sigla = sigla;
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public void mostrarDados()
    {
        System.out.println("\nNome do partido:" + nome + "\nSigla:" + sigla);
    }

}
