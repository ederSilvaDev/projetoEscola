package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.statusAluno;

/*ESTA É NOSSA CLASSE/OBEJETO QUE REPRESENTA O ALUNO*/
public class Aluno {

	/* Atributos */
	private String nome;
	private int idade;
	private String dataNascimento;
	private String nrorg;
	private String nrocpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculada;

	/* Novo Objeto da Classe Disciplinas */
	private List<Disciplinas> disciplinas = new ArrayList<Disciplinas>();

	/*
	 * SET SÃO PARA ADICIONAR OU RECEBER DADOS PARA OS ATRIBUTOS GET É PARA
	 * RESGASTAR OU OBTER O VALOR DO ATRIBUTO
	 */

	public List<Disciplinas> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplinas> disciplinas) {
		this.disciplinas = disciplinas;
	}

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

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculada() {
		return serieMatriculada;
	}

	public void setSerieMatriculada(String serieMatriculada) {
		this.serieMatriculada = serieMatriculada;
	}

	/* metodo que percorr uma lista de Notas que retorna a media do aluno */
	public double getmediaNota() {
		double somaNotas = 0;

		for (Disciplinas disciplinas : disciplinas) {
			somaNotas += disciplinas.getNota();
		}
		return somaNotas / disciplinas.size();
	}

	/*
	 * metodo simples que retorna se a media vindo getmediaNota é maior ou menor que
	 * 70 e determina se o aluno esta aprovado ou reprovado
	 */
	public boolean getAprovado() {
		double media = this.getmediaNota();
		if (media >= 70) {
			return true;
		} else {
			return false;

		}
	}

	public String getAprovado2() {
		double media = this.getmediaNota();
		if (media >= 50) {
			if (media >= 70) {
				return statusAluno.APROVADO;
			} else {
				return statusAluno.RECUPERACAO;
			}
		} else {
			return statusAluno.REPROVADO;
		}
	}

	/* TOSTRING */
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", nrorg=" + nrorg
				+ ", nrocpf=" + nrocpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", dataMatricula="
				+ dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculada=" + serieMatriculada + "]";
	}

	/* HASHCODE E EQUALS */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
