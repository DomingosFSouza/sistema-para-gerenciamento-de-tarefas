package br.com.tarefas.model;

public enum Responsaveis {
	Domingos("Domingos"), Evelin("Evelin"), Fabia("Fábia"), 
	João("João"), Luiz("Luiz"), Maria("Maria"), Paulo("Paulo");
	private String responsavel;
	
	Responsaveis (String responsavel){
		this.responsavel=responsavel;
	}
	
	public String getResponsavel() {
		return this.responsavel;
	}
	
}
