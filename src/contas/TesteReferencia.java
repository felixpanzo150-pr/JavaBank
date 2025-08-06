package contas;

public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(300);

        System.out.println("O saldo da primeira conta é: " + primeiraConta.getSaldo());

        Conta segundaConta = new Conta();

        System.out.println("O saldo da segunda conta é: " + segundaConta.getSaldo());

        segundaConta.deposita(100);
        System.out.println("O saldo da segunda conta é: " + segundaConta.getSaldo());

        System.out.println("O saldo da primeira conta é: " + primeiraConta.getSaldo());

        if (primeiraConta == segundaConta) {
            System.out.println("São a mesma a conta.");
        } else {
            System.out.println("Não é mesma conta");
        }
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
