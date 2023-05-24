package br.com.simples.model;

// esta classe teve objetivo de criação para trabalhar com variáveis estáticas dentro das telas
public enum Responsaveis {
	Domingos("Domingos"), Evelin("Evelin"), Fabia("Fábia"), 
	João("João"), Luiz("Luiz"), Maria("Maria"), Paulo("Paulo");
	private String pessoa;
	
	Responsaveis (String pessoa){
		this.pessoa=pessoa;
	}
	
	public String getPessoa() {
		return this.pessoa;
	}
	
}
