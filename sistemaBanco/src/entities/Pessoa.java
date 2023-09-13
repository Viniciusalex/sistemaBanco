package entities;

import java.util.Date;
import utils.Utils;


public class Pessoa {
	
	private static int contadorDepessoas = 1;
	
	private String nome;
	private String cpf;
	private String email;
	private String senha;
	private Integer numeroPessoa;
	private Date dataCriacaoConta;
	
	public Pessoa(String nome, String cpf, String email,String senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.numeroPessoa = Pessoa.contadorDepessoas;
		this.dataCriacaoConta = new Date();
		Pessoa.contadorDepessoas += 1;
	}

	public static int getContadorDeContas() {
		return contadorDepessoas;
	}

	public static void setContadorDeContas(int contadorDeContas) {
		Pessoa.contadorDepessoas = contadorDeContas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getNumeroPessoa() {
		return numeroPessoa;
	}

	public void setNumeroPessoa(Integer numeroPessoa) {
		this.numeroPessoa = numeroPessoa;
	}

	public Date getDataCriacaoConta() {
		return dataCriacaoConta;
	}
	
	public String getsenha() {
		return this.senha;
	}

	public String toString() {
		return "\nNome: "+ this.nome +
				"\nCPF: "+ this.cpf +
				"\nEmail: "+ this.email+
				"\nData da criação da conta: " + Utils.dataParaString(this.getDataCriacaoConta());
	}
}
