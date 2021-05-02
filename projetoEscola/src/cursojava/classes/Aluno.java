package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.statusAluno;

/*ESTA É NOSSA CLASSE/OBEJETO QUE REPRESENTA O ALUNO*/
public class Aluno extends Pessoa {
	
	/* Atributos */
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

	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculada="
				+ serieMatriculada + ", disciplinas=" + disciplinas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataMatricula == null) ? 0 : dataMatricula.hashCode());
		result = prime * result + ((disciplinas == null) ? 0 : disciplinas.hashCode());
		result = prime * result + ((nomeEscola == null) ? 0 : nomeEscola.hashCode());
		result = prime * result + ((serieMatriculada == null) ? 0 : serieMatriculada.hashCode());
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
		if (dataMatricula == null) {
			if (other.dataMatricula != null)
				return false;
		} else if (!dataMatricula.equals(other.dataMatricula))
			return false;
		if (disciplinas == null) {
			if (other.disciplinas != null)
				return false;
		} else if (!disciplinas.equals(other.disciplinas))
			return false;
		if (nomeEscola == null) {
			if (other.nomeEscola != null)
				return false;
		} else if (!nomeEscola.equals(other.nomeEscola))
			return false;
		if (serieMatriculada == null) {
			if (other.serieMatriculada != null)
				return false;
		} else if (!serieMatriculada.equals(other.serieMatriculada))
			return false;
		return true;
	}
	
	/*O OVERRIDE SIGNIFICA QUE AS LINHAS ABAIXO SÃO METODOS OU QUALQUER COISA QUE ESTA SENDO INSTANCIADA DE 
	 * UM  OUTRO LUGAR NO CASO O METODO PESSOMAIORIDADE VEM DA CLASSE PESSOA*/
	@Override
	public boolean pessoaMaiorIdade() {
		
		return super.pessoaMaiorIdade();
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "MAIOR IDADE !" : "DI MENOR !!!";
	}

	@Override
	public double salario() {
		return 2500.00;
	}
}
