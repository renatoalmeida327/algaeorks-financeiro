package com.algaworks.financeiro.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;;

@ManagedBean
@ViewScoped
public class NomesBean {
	
	private String nome;
	private List<String> nomes = new ArrayList<>();
	
	private HtmlInputText inputNome;
	private HtmlCommandButton botaoAdicionar;
	
	public String adicionar() {
		this.nomes.add(nome);
	
		if(this.nomes.size() > 3) {
			/*this.getInputNome().setDisabled(true);
			this.getBotaoAdicionar().setDisabled(true);
			this.getBotaoAdicionar().setValue("Muitos nomes adicionados...");*/
			return "Ola?faces-redirect=true";
		}
		return null;
	}

	public HtmlInputText getInputNome() {
		return inputNome;
	}

	public void setInputNome(HtmlInputText inputNome) {
		this.inputNome = inputNome;
	}

	public HtmlCommandButton getBotaoAdicionar() {
		return botaoAdicionar;
	}

	public void setBotaoAdicionar(HtmlCommandButton botaoAdicionar) {
		this.botaoAdicionar = botaoAdicionar;
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
