package javaExecutavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplinas;
import cursojava.constantes.statusAluno;

public class cursoJava {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe e Login");
		String password = JOptionPane.showInputDialog("Informe e Senha");

		if (login.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {

			/*
			 * CRIA-SE UM LISTA DE ALUNOS E LOGO EM SEGUINDA UM FOR DE 1 A 2 QUE SERA
			 * INFORMADO 2 ALUNOS E SUAS DISCIPLINAS E NOTAS
			 */
			List<Aluno> alunos = new ArrayList<Aluno>();

			/*
			 * é uma lista que dentro dela temos uma chave que identifica uma sequencia de
			 * valores tambem
			 */
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int qtd = 1; qtd <= 5; qtd++) {

				/*
				 * CONSTRUINDO UM OBJETO NO MUNDO REAL new Aluno é uma instancia de Objeto da
				 * clase Aluno.java aluno1 ou 2 ou 3 são referencia
				 */
				Aluno aluno1 = new Aluno();

				/* Entrada de DADOS */
				String nome = JOptionPane.showInputDialog("Nome do Aluno " + qtd + "?");
				/*
				 * String idade = JOptionPane.showInputDialog("Idade do Aluno ?"); String
				 * dtnascimento = JOptionPane.showInputDialog("Data de Nascimento do Aluno ?");
				 * String nMae = JOptionPane.showInputDialog("Nome da Mae do Aluno ?"); String
				 * nPai = JOptionPane.showInputDialog("Nome do Pai do Aluno ?"); String nEscola
				 * = JOptionPane.showInputDialog("Nome da Escola do Aluno ?"); String cpf =
				 * JOptionPane.showInputDialog("CPF do Aluno ?"); String rg =
				 * JOptionPane.showInputDialog("RG do Aluno ?"); String dMatricula =
				 * JOptionPane.showInputDialog("Data da Matricula do Aluno ?"); String matricula
				 * = JOptionPane.showInputDialog("Matricula do Aluno ?");
				 */

				/*
				 * fazendo referecia ao objeto pra asssim ter acesso aos atributos gerados os
				 * set e getr´s dos atributos da classe Aluno é possivel trabalhar com os
				 * atributos de quaquqler outra classe nesse caso os setNome, setIdade e etc..
				 * são atributos da classe aluno e nesse mesmo linha é atribudo o valor qualquer
				 * ("Eder")
				 */

				aluno1.setNome(nome);
				/*
				 * aluno1.setIdade(Integer.valueOf(idade));
				 * aluno1.setDataNascimento(dtnascimento); aluno1.setNomeMae(nMae);
				 * aluno1.setNomePai(nPai); aluno1.setNomeEscola(nEscola);
				 * aluno1.setNrocpf(cpf); aluno1.setNrorg(rg);
				 * aluno1.setDataMatricula(dMatricula); aluno1.setSerieMatriculada(matricula);
				 */

				/*
				 * NA CLASSE ALUNOS ESTA FAZENDO REFERENCIA A UMA OUTRA CLASSSE DISCIPLINAS QUE
				 * POSSUI SEUS PROPRIOS ATRIBUSTOS, que SERAM RECEBIDOS ATRAVES DE UMA LISTA DE
				 * DISCIPLINAS CRIADA DE FORMA "DINAMICA"
				 */

				// ESSE FOR PERCORRE POR 4 POSIÇÕES, ONDE A CADA LAÇO E
				for (int pos = 1; pos <= 1; pos++) {

					String nomeDisciplina = JOptionPane.showInputDialog("Nome de Disciplina " + pos + " ?");
					String notaDisciplina = JOptionPane.showInputDialog("Nota de Disciplina " + pos + " ?");

					Disciplinas disciplina = new Disciplinas();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));

					aluno1.getDisciplinas().add(disciplina);
				}

				/*
				 * ROTINA QUE POSSIBILITA AO USUARIO DECIDIR SE DESEJA REMOVER ALGUMA DISCIPLINA
				 * ACRESCIDA
				 */
				int escolha = JOptionPane.showConfirmDialog(null, " Deseja remover a Disciplina");

				if (escolha == 0) {

					int removendo = 0;
					int posicao = 1;

					while (removendo == 0) {
						String disciplinaRemover = JOptionPane.showInputDialog("Qual Disciplina 1, 2, 3 ou 4");
						aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
						posicao++;
						removendo = JOptionPane.showConfirmDialog(null, "Continuar Removendo Disciplina ?");

					}
				}

				alunos.add(aluno1);
			}
			/* INICICALIZA OS VALORES INFORMANDO O VALOR DA CHAVES DO MAPS */
			maps.put(statusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(statusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(statusAluno.REPROVADO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {
				/*
				 * QUANDO ATENDER A CONDIÇÃO = PEGA DO MAPS, PEGA A KEY EM QUSTÃO, RETONA A
				 * LISTA DE ALUNOS E ADD
				 */
				if (aluno.getAprovado2().equalsIgnoreCase(statusAluno.APROVADO)) {
					maps.get(statusAluno.APROVADO).add(aluno);
				} else if (aluno.getAprovado2().equalsIgnoreCase(statusAluno.RECUPERACAO)) {
					maps.get(statusAluno.RECUPERACAO).add(aluno);
				} else if (aluno.getAprovado2().equalsIgnoreCase(statusAluno.REPROVADO)) {
					maps.get(statusAluno.REPROVADO).add(aluno);
				} 

			}
			System.out.println("<--------Lista dos Aprovados--------->");
			/* PEGA DO MAPS A LISTA DE APROVADOSM, EM RECUPERAÇÃO E REPROVADOS */
			for (Aluno aluno : maps.get(statusAluno.APROVADO)) {
				System.out.println("Aluno = " + aluno.getNome() + " > " + aluno.getAprovado2() + " com média de = "
						+ aluno.getmediaNota());

			}
			System.out.println("<--------Lista dos em Recuperação --------->");
			for (Aluno aluno : maps.get(statusAluno.RECUPERACAO)) {
				System.out.println("Resultado = " + aluno.getNome() + " > " + aluno.getAprovado2() + " com média de = "
						+ aluno.getmediaNota());

			}
			System.out.println("<--------Lista dos Reprovados--------->");
			for (Aluno aluno : maps.get(statusAluno.REPROVADO)) {
				System.out.println("Resultado = " + aluno.getNome() + " > " + aluno.getAprovado2() + " com média de = "
						+ aluno.getmediaNota());

			}

		}
	}

}