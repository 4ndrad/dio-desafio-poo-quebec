
public class main {
	public main() {
		Cliente natan = new Cliente();
		natan.setNome("Natan");
		natan.setCpf(157978999);
		natan.setSenha(789);
		
		Conta cc = new ContaCorrente(natan);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoucanca(natan);
		poupanca.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
