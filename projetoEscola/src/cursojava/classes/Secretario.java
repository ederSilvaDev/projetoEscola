package cursojava.classes;

import cursojava.Interfaces.permitirAcesso;

/*ATRAVES DO EXTENDS PODEMOS HERDAR OS ATRIBUTOS DA CLASSE PESSOA*/
public class Secretario extends Pessoa implements permitirAcesso {

	private String registro;
	private String nivelCargo;
	private String experiencia;

	private String login;
	private String password;
	
	/*Construtor com parametros*/
	public Secretario(String login, String password) {
		this.login = login;
		this.password = password;
		
	}
	/*Construtor*/
	public Secretario() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia + "]";
	}

	@Override
	public double salario() {
		return 2800.00;
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
		return login.equals("admin") && password.equals("admin");
	}
}
