package cliente;

import contas.Conta;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente felix = new Cliente();
        Conta contaDoFelix = new Conta();
        contaDoFelix.deposita(100);
        System.out.println(contaDoFelix);
    }
}
