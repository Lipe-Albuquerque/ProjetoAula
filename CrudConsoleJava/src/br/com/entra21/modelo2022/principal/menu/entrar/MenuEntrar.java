package br.com.entra21.modelo2022.principal.menu.entrar;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.entra21.modelo2022.principal.Menu;
import br.com.entra21.modelo2022.principal.menu.entrar.cadastro.MenuCadastro;

public class MenuEntrar{
	public static void entrar(){
		new MenuCadastro("Cadastros", new ArrayList<String>(Arrays.asList("Medicos", "Pacientes"))).executarMenu();
	}
	
	public static void sobre() {}
	

}