import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		
		Cliente  cliente = new Cliente();
		cliente.setNome(nome);
		
		Conta cc = new ContaCorrente(cliente);
		Conta cp = new ContaPoupanca(cliente);
		
		Double operacaoDepositar = Double.parseDouble(JOptionPane.showInputDialog("Valor a ser depositado: "));
		Double operacaoSacar = Double.parseDouble(JOptionPane.showInputDialog("Valor a Trnasferir para Poupanca: "));
		
		cc.depositar(operacaoDepositar);
		cp.transferir(operacaoSacar, cc, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
	}

}
