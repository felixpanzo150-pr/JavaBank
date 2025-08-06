package contas;

import cliente.Cliente;

// saldo, agencia, numero e titular.
public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public void deposita(double valor){
        // quando colocamos void antes do método quer dizer que ele não irá devolver nada, apenas fará a ação.
        //this.saldo = this.saldo + valor;
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        else {
            System.out.println("Contacte o seu banco, saque negado.😁");
            return false;
        }
    }

    public boolean transferir (double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            System.out.println("Não há saldo suficiente; saque negado😂.");
            return false;
        }
    }
    public double getSaldo(){
        return this.saldo;
    }

    public double getNumero(){
        return this.numero;
    }
    public void setNumero(int novoNumero){
        this.numero = novoNumero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
}
