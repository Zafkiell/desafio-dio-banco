public class Main {

    public static void main(String[] args) {
        Banco nubank = new Banco();
        nubank.setNome("Nubank");

        Cliente felipe = new Cliente();
        felipe.setNome("Felipe");

        IConta cc = new ContaCorrente(nubank,felipe);
        IConta poupanca = new ContaPoupanca(nubank,felipe);

        cc.Depositar(100);
        cc.Transferir(100,poupanca);

        cc.ImprimirExtrato();
        poupanca.ImprimirExtrato();

        nubank.ListarClientes();
    }
}
