public class TestaGetSet {

    public static void main(String[] args) {
        Conta conta = new Conta(2, 1500);
        System.out.println(conta.getNumero());

        Cliente gabriel = new Cliente();
        gabriel.setNome("Gabriel Gomes");
        gabriel.setCpf("999.999.999-99");
        gabriel.setProfissao("Desenvolvedor");
        conta.setTitular(gabriel);
    }

}
