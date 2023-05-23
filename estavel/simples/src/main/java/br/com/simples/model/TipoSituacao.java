package br.com.simples.model;

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
