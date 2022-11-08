public class ContaCorrente extends Conta {

    public ContaCorrente(Banco banco,Cliente cliente) {
        super(banco,cliente);
    }
    @Override
    public void ImprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        ImprimirInfosComuns();
    }
}
