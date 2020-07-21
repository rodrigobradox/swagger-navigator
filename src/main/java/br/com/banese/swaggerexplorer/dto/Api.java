package br.com.banese.swaggerexplorer.dto;

import java.io.Serializable;

public class Api implements Serializable, Comparable<Api>  {
	
	private static final long serialVersionUID = 1L;

	private String nome;
	
	private String secao;
	
	private String descricao;
	
	private String json;
	
	public Api() {}
	
	public Api(String nome, String descricao, String json) {
		this.nome = nome;
		this.descricao = descricao;
		this.json = json;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSecao() {
		return secao;
	}

	public void setSecao(String secao) {
		this.secao = secao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	@Override
	public String toString() {
		return "Api [nome=" + nome + ", descricao=" + descricao + ", json=" + json + "]";
	}

	@Override
	public int compareTo(Api api) {
		return (this.secao + this.nome).compareTo(api.secao + api.nome);
	}
	
}
