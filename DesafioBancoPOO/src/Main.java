public class Main {

	public static void main(String[] args) {
		Cliente henry = new Cliente();
		henry.setNome("Henry");
		
		Conta cc = new ContaCorrente(henry) ;  
        
		Conta poupanca = new Cp(henry);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}