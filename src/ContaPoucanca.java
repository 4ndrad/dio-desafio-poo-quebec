
public class ContaPoucanca extends Conta{

	public ContaPoucanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(" === Extrato Conta Poupança ===");
		imprimirInfosComum();

	}

}
