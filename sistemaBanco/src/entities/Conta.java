package entities;

import utils.Utils;

public class Conta {
	
	private static int quantidadeContas = 1;
	
	private int numeroDaConta;
	private Pessoa pessoa;
	private double saldo = 0.0;
	
	
	public Conta(Pessoa pessoa) {
		this.numeroDaConta = Conta.quantidadeContas;
		this.pessoa = pessoa;
		this.atualizarSaldo();
		Conta.quantidadeContas += 1;
	}


	public static int getNumeroContas() {
		return quantidadeContas;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	private void atualizarSaldo() {
		this.saldo = this.getSaldo();
	}
	
	public String toString() {
		return "\nNúmero da conta: " + this.getNumeroDaConta() +
				"\nCliente: " + this.pessoa.getNome() +
				"\nCPF: " + this.pessoa.getCpf() + 
				"\nEmail: " + this.pessoa.getEmail() + 
				"\nSaldio: " + Utils.valorParaString(this.getSaldo())+
				"\n" ;
	}
	
	public void depositar( Double valorDeposito) {
		if (valorDeposito > 0) {
			setSaldo(getSaldo() + valorDeposito);
			System.out.println(this.pessoa.getNome() + "seu depósito foi realizado com sucesso! ");
		}else {
			System.out.println(this.pessoa.getNome() + "Não foi possível realizar seu depósito! ");
		}
	}
	
	public void sacar (Double valorSaque) {
		if (valorSaque > 0 && this.getSaldo() > valorSaque) {
			setSaldo(getSaldo() - valorSaque);
			System.out.println(this.pessoa.getNome() + "seu saque foi realizado com sucesso!\n"+ "Saldo atualizado: " + this.getSaldo());
		}else {
			System.out.println(this.pessoa.getNome() + "Não foi possível realizar seu saque!");
		}
	}
	
	public void tranferencia(Conta contaParaDeposito, Double valorTranferencia) {
		if (valorTranferencia > 0 && this.saldo >= 0) {
			setSaldo(getSaldo() - valorTranferencia);
			contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valorTranferencia;
			System.out.println("Transferência realizada com sucesso!");
		}else {
			  System.out.println("Não foi possivel realizar sua transferência!");
		}
	}
	
}
