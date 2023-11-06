package classe;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.RepodutorMusical;

public class Iphone implements RepodutorMusical, AparelhoTelefonico, NavegadorInternet {
	
	// Métodos da interface RepodutorMusicial
	
	@Override
	public void tocar() {
		System.out.println("TELEFONE TOCANDO");
		
	}

	@Override
	public void pausar() {
		System.out.println("TELEFONE PAUSANDO");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONANDO MÚSICA");
		
	}


	// Métodos da interface AparelhoTelefonico
	
	@Override
	public void ligar() {
		System.out.println("TELEFONE LIGANDO");
		
	}

	@Override
	public void atender() {
		System.out.println("TELEFONE CHAMANDO");
		
	}

	@Override
	public void iniciarCorrerioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
		
	}
	
	// Métodos da interface NavegadorInternet
	
	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO PÁGINA DO NAVEGADOR");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA DO NAVEGADOR");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA DA INTERNET");
		
	}
	
	
}
