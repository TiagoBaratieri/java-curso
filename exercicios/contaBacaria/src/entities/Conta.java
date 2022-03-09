package entities;

public class Conta {

    private int numero;
    private String nome;
    private double saldo;

    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public Conta(int numero, String nome, double saldoIncial) {
        this.numero = numero;
        this.nome = nome;
        depositar(saldoIncial);
    }


    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }


    public double depositar(double valor) {
        return saldo += valor;
    }

    public double sacar(double valor) {
        return saldo -= valor + 5.0;
    }

    public String toString(){
        return "Número da conta: " + numero
                + " Nome do titular " + nome
                + " Saldo: $ "
                + String.format("%.2f", saldo);
    }
}
