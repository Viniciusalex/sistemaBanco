package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.Conta;

public class AgenciaDoBanco {
	
	static Scanner input = new Scanner(System.in);
	static ArrayList<Conta> contasBancarias;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		contasBancarias = new ArrayList<Conta>();
		telaDeOperacoes();
	}
	
	public static void telaDeOperacoes() {

	        System.out.println("|------------------------------------------------------|");
	        System.out.println("|------------- Programa sistema de banco --------------|");
	        System.out.println("|------------------------------------------------------|");
	        System.out.println("|===== Selecione uma operação que deseja realizar =====|");
	        System.out.println("|------------------------------------------------------|");
	        System.out.println("|   1 - Criar conta   |");
	        System.out.println("|   2 - Depositar     |");
	        System.out.println("|   3 - Sacar         |");
	        System.out.println("|   4 - Transferir    |");
	        System.out.println("|   5 - Listar        |");
	        System.out.println("|   6 - Sair          |");

	        int operacao = input.nextInt();;
	        input.nextLine();
	        switch (operacao) {
	            case 1:
	                criarConta();
	                break;

	            case 2:
	                depositar();
	                break;

	            case 3:
	                sacar();
	                break;

	            case 4:
	                transferir();
	                break;

	            case 5:
	            	listarContasExistentes();
	                break;

	            case 6:
	                System.out.println("Flw é nóis!");
	                System.exit(0); // para o sistema

	            default:
	                System.out.println("Opção inválida!");
	                telaDeOperacoes();
	                break;
	        }
	    }
	
	public static void criarConta() {
		
		System.out.println("\nInforme seu nome: ");
		String nome = input.next();
		
		System.out.println("\nInforme seu CPF: ");
		String cpf = input.next();
		
		System.out.println("\nInforme seu Email: ");
		String email = input.next();
		System.out.println("\nInforme uma senha: ");
		String senha = input.next();
		
		Pessoa cliente = new Pessoa(nome, cpf, email, senha);
		Conta conta = new Conta(cliente);
		
		
		contasBancarias.add(conta);
		System.out.println("****** Sua conta foi criada co, sucesso! ******");
		
		telaDeOperacoes();
	}
	
	private static Conta encontrarConta(int numeroDaConta) {
		Conta conta = null;
		if(contasBancarias.size() > 0) {
			for (Conta contaencontrada:contasBancarias) {
				if(contaencontrada.getNumeroDaConta() == numeroDaConta) {
					conta = contaencontrada;
				}
			}
		}
		return conta;
	}
	
	public static void depositar() {
		System.out.println("Informe o número da conta para deposito: ");
		int numeroDaConta = input.nextInt();
		
		Conta conta = encontrarConta(numeroDaConta);
		
		if(conta != null) {
			System.out.println("Qual valor você deseja depositar na conta " + conta.getPessoa().getNome() +":");
			double valorDeposito = input.nextDouble();
			System.out.println("Informe sua senha para confirmar o deposito: ");
			String senha = input.next();
			
			if(conta.getPessoa().getsenha().equals(senha)) {
				conta.depositar(valorDeposito);
				System.out.println("**** Deposito realizado com sucesso! ****");
			}else {
				System.out.println("Senha incorreta");
			}
		}else {
			System.out.println("******* Conta não encontra *****");
		}
		telaDeOperacoes();
	}
	
	public static void sacar() {
		System.out.println("Informe o número da sua conta: : ");
		int numeroDaConta = input.nextInt();
		
		Conta conta = encontrarConta(numeroDaConta);
		
		if(conta != null) {
			System.out.println("Informe o valor que deseja sacar: ");
			Double valorSaque = input.nextDouble();
			
			System.out.println("Informe sua senha para confirmar o deposito: ");
			String senha = input.next();
			if(conta.getPessoa().getsenha().equals(senha)){
				conta.sacar(valorSaque);
				System.out.println("**** Saque realizado com sucesso! ****");
			}else {
				System.out.println("**** Senha incorreta! ****");
			}
		}else {
			System.out.println("**** Conta não encontrada ****");
		}
		
		telaDeOperacoes();
	}
	
	public static void transferir() {
		System.out.println("Informe o número da sua conta: ");
		int numeroContaRemetente = input.nextInt();
		
		Conta contaRemetente = encontrarConta(numeroContaRemetente);
		
		if (contaRemetente != null) {
			System.out.println("Informe número da conta que deseja tranferir: ");
			int numeroContaDestinatario = input.nextInt();
			
			Conta contadestinatario = encontrarConta(numeroContaDestinatario);
			
			if(contadestinatario != null) {
				System.out.println("Informe o valor que deseja tranferir:");
				Double valorTranferencia = input.nextDouble();
				
				System.out.println("Informe sua senha para confirmação da tranferencia: ");
				String senha = input.nextLine();
				
				if(contaRemetente.getPessoa().getsenha().equals(senha)){
					contaRemetente.tranferencia(contadestinatario, valorTranferencia);
				}else{
				}System.out.println("**** Senha incorreta ****");
				
			}else {
				System.out.println("**** Conta do destinatario não foi encontrada ****");
			}
		}else {
			System.out.println("**** Sua conta não foi encontrada ****");
		}
		
		telaDeOperacoes();
	}
	
	public static void listarContasExistentes() {
		if (contasBancarias.size() > 0) {
			System.out.println("Contas encontras: ");
			for (Conta contasEncontradas:contasBancarias) {
				System.out.println(contasEncontradas);
			}
		}else {
			System.out.println("**** Nenhuma conta foi encontrada cadastrada no sistema");
		}
		telaDeOperacoes();
	}
}
