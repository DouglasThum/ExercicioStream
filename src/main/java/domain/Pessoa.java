package domain;

public class Pessoa {

	private String nome;
	private String sexo;
	private Long cpf;
	private String nacionalidade;
	public Pessoa(String nome, String sexo, Long cpf, String nacionalidade) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.nacionalidade = nacionalidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public Long getCpf() {
		return cpf;
	}
	
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "Nome: " + nome + ", Sexo: " + sexo + ", CPF: " + cpf + ", Nacionalidade: " + nacionalidade;
	}
	
	
}
