package contas;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoFelix = new Conta();

        contaDoFelix.deposita(100);
        contaDoFelix.deposita(80);
        System.out.println(contaDoFelix.getSaldo());

        contaDoFelix.sacar(10);
        System.out.println(contaDoFelix.getSaldo());

        contaDoFelix.sacar(250);
        System.out.println("O saldo do Félix antes da transferencia é: " + contaDoFelix.getSaldo());

        Conta contaMaria = new Conta();
        contaMaria.deposita(1000);
        System.out.println("O saldo da Maria antes da transferencia é: " + contaMaria);


        contaMaria.transferir(1500, contaDoFelix);
        System.out.println("O saldo da Maria depois da transferencia é : " + contaMaria.getSaldo());
        System.out.println("O saldo do Félix depois da transferencia é : " + contaDoFelix.getSaldo());
    }
}
