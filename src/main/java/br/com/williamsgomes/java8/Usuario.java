package br.com.williamsgomes.java8;

public class Usuario {

	private String nome;
	private int pontos;
	private boolean moderador;

	public Usuario(String nome, int pontos) {
		this.nome = nome;
		this.pontos = pontos;
	}

	public String getNome() {
		return nome;
	}

	public int getPontos() {
		return pontos;
	}

	public boolean isModerador() {
		return moderador;
	}

	public void tornarModerador() {
		this.moderador = true;
	}

}
