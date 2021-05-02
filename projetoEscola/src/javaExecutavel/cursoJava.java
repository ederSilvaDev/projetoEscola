package javaExecutavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import classesAuxiliares.funcaoAutenticacao;
import cursojava.Interfaces.permitirAcesso;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplinas;
import cursojava.classes.Secretario;
import cursojava.constantes.statusAluno;

public class cursoJava {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe e Login");
		String password = JOptionPane.showInputDialog("Informe e Senha");

		//funcaoAutenticacao autenticacao = new funcaoAutenticacao();
		
		/*1- interface do tipo secretario(login e senha), */ 
		
		/*nova de função de autenicação passando o objeto permitiracesso*/
		if (new funcaoAutenticacao(new Diretor (login, password)).autenticar()) {/*TRAVA O ACESSSO AO SISTEMA SOMENTE QUEM TEM REALMENTE COMO O CONTRATO*/
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
				aluno1.setNome(nome);
				for (int pos = 1; pos <= 1; pos++) {

					String nomeDisciplina = JOptionPane.showInputDialog("Nome de Disciplina " + pos + " ?");
					String notaDisciplina = JOptionPane.showInputDialog("Nota de Disciplina " + pos + " ?");

					Disciplinas disciplina = new Disciplinas();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));

					aluno1.getDisciplinas().add(disciplina);
				}

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

		} else {
			JOptionPane.showMessageDialog(null, "Acesso não Permititdo");
		}
	}
}