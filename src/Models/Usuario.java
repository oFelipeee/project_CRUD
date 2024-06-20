package Models;

import java.util.Scanner;
import Service.HandleMenu;

public class Usuario {
	private int id;

	private String nome;
	private String senha;
	
	public Usuario(int id, String nome, String senha) {
		this.id = id;
		this.nome = nome;
		this.senha = senha;
	}
	
	public Usuario() {}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return id + ";" + nome + ";" + senha;
	}
	
	public void systemUser() {
		Scanner input = new Scanner(System.in);
		HandleMenu hm = new HandleMenu();
		int escolha = 0;
		do {
			System.out.println("1 - Criar User \n2 - Editar User \n3 - Deletar User \n4 - Listar User \n5 - Detalhes User \n6 - Login User \n7 - Alterar Senha \n10 - Sair\n");
			escolha = input.nextInt();

			switch (escolha) {
			case 1: {
				hm.criar();
				break;
			}
			case 2: {
				hm.editar();
				break;
			}
			case 3: {
				hm.deletar();
				break;
			}
			case 4: {
				hm.listar();
				break;
			}
			case 5: {
				hm.detalhar();
				break;
			}
			case 6: {
				hm.login();
				break;
			}
			case 7: {
				hm.AlterarSenha();
				break;
			}
			case 10: {
				System.exit(0);
			}
			default:
				System.err.println("Opção inválida!!");
				break;
			}
		} while (escolha != 9);
		
		input.close();
	}
}
