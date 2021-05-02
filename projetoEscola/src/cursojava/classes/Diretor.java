package cursojava.classes;

import cursojava.Interfaces.permitirAcesso;

public class Diretor extends Pessoa implements permitirAcesso {

	private String registroEduca;
	private String tempoDirecao;
	private String titulacao;
	
	private String login;
	private String password;
	
	/*Construtor com parametros*/
	public Diretor(String login, String password) {
		this.login = login;
		this.password = password;
		
	}
	/*Construtor*/
	public Diretor() {
		// TODO Auto-generated constructor stub
	}
	

	public String getRegistroEduca() {
		return registroEduca;
	}

	public void setRegistroEduca(String registroEduca) {
		this.registroEduca = registroEduca;
	}

	public String getTempoDirecao() {
		return tempoDirecao;
	}

	public void setTempoDirecao(String tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public String toString() {
		return "Diretor [registroEduca=" + registroEduca + ", tempoDirecao=" + tempoDirecao + ", titulacao=" + titulacao
				+ "]";
	}

	@Override
	public double salario() {
		return 5800.00 * 0.8;
	}
	
	/*METODO DO CONTRATTO DE AUTENTICAÇÃO*/
	@Override
	public boolean autenticar(String login, String password){
		this.login = login;
		this.password = password;
		return autenticar();
	}
	
	@Override
	public boolean autenticar() {
		return login.equals("eder") && password.equals("eder");
	}
		
}
