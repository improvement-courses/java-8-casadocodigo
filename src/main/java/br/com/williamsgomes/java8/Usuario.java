package br.com.williamsgomes.java8;

public class Usuario {

	private String nome;
	private int pontos;
	private String testeTriFuncional;
	private boolean moderador;
	
	public Usuario() {
	}
	
	public Usuario(String nome) {
		this.nome = nome;
	}

	public Usuario(String nome, int pontos) {
		this.nome = nome;
		this.pontos = pontos;
	}
	
	public Usuario(String nome, int pontos, String testeTriFuncional) {
		this.nome = nome;
		this.pontos = pontos;
		this.testeTriFuncional = testeTriFuncional;
	}

	public String getNome() {
		return nome;
	}

	public int getPontos() {
		return pontos;
	}
	
	public String getTesteTriFuncional() {
		return testeTriFuncional;
	}
	
	public void setTesteTriFuncional(String testeTriFuncional) {
		this.testeTriFuncional = testeTriFuncional;
	}

	public boolean isModerador() {
		return moderador;
	}

	public void tornarModerador() {
		this.moderador = true;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", pontos=" + pontos + "]";
	}

}
