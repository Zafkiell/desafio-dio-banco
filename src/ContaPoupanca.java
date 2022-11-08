public class ContaPoupanca extends Conta {

    public ContaPoupanca(Banco banco,Cliente cliente) {
        super(banco,cliente);
    }
    @Override
    public void ImprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        ImprimirInfosComuns();
    }
}
