import java.util.Objects;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		Cliente cliente;

		Conta cc = null;
		Conta poupanca = null;


//		cc.transferir(100, poupanca);


		boolean onMenu = true;
		String name = " ";
		while (onMenu){
			System.out.println("________________________________");
			System.out.println("|  Bem Vindo ao Banco Digital  |");
			System.out.println("|      Escolha uma opcao       |");
			System.out.println("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");

			System.out.println("1 - Criar conta corrente");
			System.out.println("2 - Criar conta poupanca");
			System.out.println("3 - Depositar na conta corrente");
			System.out.println("4 - Depositar na conta poupanca");
			System.out.println("5 - Sacar da conta corrente");
			System.out.println("6 - Sacar da conta poupanca");
			System.out.println("7 - Imprimir extrato CC");
			System.out.println("8 - Imprimir extrato CP");
			System.out.println("9 - Sair");
			int option = sc.nextInt();
			sc.nextLine();

			switch (option){
				case 1:
					if (name.equalsIgnoreCase(" ")) {
						System.out.printf("Digite seu nome");
						name = sc.nextLine();
						cliente = new Cliente();
						cliente.setNome(name);
						cc = new ContaCorrente(cliente);
						System.out.println("Conta corrente criada");
					} else {
						cliente = new Cliente();
						cliente.setNome(name);
						cc = new ContaCorrente(cliente);
						System.out.println("Conta corrente criada");
					}
					break;
				case 2:
					if (name.equalsIgnoreCase(" ")) {
						System.out.printf("Digite seu nome");
						name = sc.nextLine();
						cliente = new Cliente();
						cliente.setNome(name);
						poupanca = new ContaPoupanca(cliente);
						System.out.println("Conta poupanca criada");
					} else {
						cliente = new Cliente();
						cliente.setNome(name);
						poupanca = new ContaPoupanca(cliente);
						System.out.println("Conta poupanca criada");
					}
					break;
				case 3:
					if(!Objects.isNull(cc)){
						System.out.printf("Digite o valor que deseja depositar: ");
						double value = sc.nextDouble();
						cc.depositar(value);
						System.out.println("Deposito feito com sucesso");
					} else {
						System.out.println("Voce precisa criar uma conta primeiro");
					}
					break;
				case 4:
					if(!Objects.isNull(poupanca)){
						System.out.printf("Digite o valor que deseja depositar: ");
						double value = sc.nextDouble();
						poupanca.depositar(value);
						System.out.println("Deposito feito com sucesso");
					} else {
						System.out.println("Voce precisa criar uma conta primeiro");
					}
					break;
				case 5:
					if(!Objects.isNull(cc)){
						System.out.printf("Digite o valor que deseja sacar: ");
						double value = sc.nextDouble();
						cc.sacar(value);
						System.out.println("Saque feito com sucesso");
					} else {
						System.out.println("Voce precisa criar uma conta primeiro");
					}
					break;
				case 6:
					if(!Objects.isNull(poupanca)){
						System.out.printf("Digite o valor que deseja sacar: ");
						double value = sc.nextDouble();
						poupanca.sacar(value);
						System.out.println("Saque feito com sucesso");
					} else {
						System.out.println("Voce precisa criar uma conta primeiro");
					}
					break;
				case 7:
					if(!Objects.isNull(cc)){
						cc.imprimirExtrato();
					} else {
						System.out.println("Voce precisa criar uma conta primeiro");
					}
					break;
				case 8:
					if(!Objects.isNull(poupanca)){
						poupanca.imprimirExtrato();
					} else {
						System.out.println("Voce precisa criar uma conta primeiro");
					}
					break;
				case 9:
					onMenu = false;
					break;
				default:
					System.out.println("Opcao invalida");
					break;


			}

		}
	}

}
