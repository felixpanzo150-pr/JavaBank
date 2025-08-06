package contas;

import cliente.Cliente;

public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta contaCliente = new Conta();
        contaCliente.deposita(100);
        contaCliente.sacar(200);
        System.out.println(contaCliente.getSaldo());

        Cliente cliente = new Cliente();
        contaCliente.setTitular(cliente);
    }
}
