package br.com.simples.model;

public enum TipoPrioridade {
	Alta("Alta"), Media("Média"), Baixa("Baixa");
	
	private String prioridade;
	
	TipoPrioridade (String prioridade){
		this.prioridade=prioridade;
	}
	
	public String getPrioridade() {
		return this.prioridade;
	}
}
