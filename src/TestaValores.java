public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(1234, 653455);
        Conta conta2 = new Conta(5678, 123245);
        Conta conta3 = new Conta(9012, 978845);
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());
    }

}
