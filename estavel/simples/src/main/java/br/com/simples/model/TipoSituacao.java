package br.com.simples.model;

//esta classe teve objetivo de criação para trabalhar com variáveis estáticas dentro das telas
public enum TipoSituacao {
	EmAndamento("Em andamento"), CONCLUIDA("Concluída");
	private String situacao;
	
	TipoSituacao (String situacao){
		this.situacao=situacao;
	}
	
	public String getSituacao() {
		return this.situacao;
	}
}
