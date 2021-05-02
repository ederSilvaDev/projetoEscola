package cursojava.classes;

/*SUPER CLASSE PESSOAS COM TODOS OS ATRIBUTOS QUE SÃO COMUNS EM TODOS OS OBJETOS FILHOS*/
public abstract class Pessoa {

	/* Atributos */
	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String nrorg;
	protected String nrocpf;
	protected String nomeMae;
	protected String nomePai;
	
	/*METODO ABSTRATO É OBRIGATÓRIO PARA AS CLASSES FILHAS, nesse caso todas as classes filhas DEVEM POSSUIR UM
	 * METODO SALARIO*/
	public abstract double salario();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNrorg() {
		return nrorg;
	}

	public void setNrorg(String nrorg) {
		this.nrorg = nrorg;
	}

	public String getNrocpf() {
		return nrocpf;
	}

	public void setNrocpf(String nrocpf) {
		this.nrocpf = nrocpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	/*FAZENDO UM TESTE CRIANDO UM METODO SIMPLES QUE AO SER INVOCADO ELE RECEBE UM PARAMETROS IDADE
	 * E RETORNA TRUE OU FALSE SE A IDADE É MAIOR QUE 18*/
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", nrorg=" + nrorg
				+ ", nrocpf=" + nrocpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	
	

}
