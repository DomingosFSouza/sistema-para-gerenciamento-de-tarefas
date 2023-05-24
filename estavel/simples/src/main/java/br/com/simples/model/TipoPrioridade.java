package br.com.simples.model;

//esta classe teve objetivo de criação para trabalhar com variáveis estáticas dentro das telas
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
