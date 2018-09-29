package com.algaworks.financeiro.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.*;

@ManagedBean
@ViewScoped
public class NomesBean {
	
	private String nome;
	private List<String> nomes = new ArrayList<>();
	
	public void adicionar() {
		this.nomes.add(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getNomes() {
		return nomes;
	}
	
}
