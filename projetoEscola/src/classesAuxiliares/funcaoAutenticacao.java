package classesAuxiliares;

import cursojava.Interfaces.permitirAcesso;

/*REALMENTE E SOMENTE RECEBER ALGUEM QUE TEM O CONTRATO DE INTERFACE 
 * DE PERMITIR ACESSO E CHAMR AUTENTICAR */
public class funcaoAutenticacao {

	private permitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	/*passe por esse metodo que recebe por parametor um objeto do tipo secretario*/
	public funcaoAutenticacao(permitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
