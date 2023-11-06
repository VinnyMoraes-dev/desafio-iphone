package main;

import classe.Iphone;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.RepodutorMusical;

public class Main {
	public static void main(String[] args) {
		System.out.println("============================================================");
		Iphone iphone = new Iphone();
		
		RepodutorMusical reprodutorMusical = iphone;
		AparelhoTelefonico aparelhoTelefonico = iphone;
		NavegadorInternet navegadorInternet = iphone;
		
		// Imprimindo
		System.out.println("--------------------------IPHONE--------------------------");
		System.out.println("--------------------Reprodutor Musical--------------------");
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();
		reprodutorMusical.selecionarMusica();
		
		System.out.println("--------------------Aparelho Telefônico--------------------");
		aparelhoTelefonico.ligar();
		aparelhoTelefonico.atender();
		aparelhoTelefonico.iniciarCorrerioVoz();
		
		System.out.println("-------------------Navegador de Internet-------------------");
		navegadorInternet.exibirPagina();
		navegadorInternet.adicionarNovaAba();
		navegadorInternet.atualizarPagina();
		
		System.out.println("============================================================");
	}
	
}
