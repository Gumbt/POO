package dados;

import java.util.List;

public class Contribuinte {
	
	private int cpf;
	private String nome;
	private String endereco;
	private int idade;
	private int contaBancaria;
	private List<Dependente> dependente;
	private List<Bem> bem;
	private List<NotaFiscal> despesas;
	private List<Contracheque> receitas;
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getContaBancaria() {
		return contaBancaria;
	}
	public void setContaBancaria(int contaBancaria) {
		this.contaBancaria = contaBancaria;
	}
	
	
	
	

}
