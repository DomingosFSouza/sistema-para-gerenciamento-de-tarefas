package br.com.simples.model;

import java.io.Serializable;

import java.util.Date;
import java.util.Objects;

public class Tarefa implements Serializable {

private static final long serialVersionUID = 1L;

private Integer id;
private String titulo;
private String descricao;
private String responsavel;
private String prioridade;
private Date deadline;
private String situacao;
private Responsaveis responsaveis;
private TipoPrioridade tipoPrioridade;
private TipoSituacao tipoSituacao;

public Responsaveis getResponsaveis() {
	return responsaveis;
}
public TipoPrioridade getTipoPrioridade() {
	return tipoPrioridade;
}
public TipoSituacao getTipoSituacao() {
	return tipoSituacao;
}

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public String getResponsavel() {
	return responsavel;
}
public void setResponsavel(String responsavel) {
	this.responsavel = responsavel;
}
public String getPrioridade() {
	return prioridade;
}
public void setPrioridade(String prioridade) {
	this.prioridade = prioridade;
}
public Date getDeadline() {
	return deadline;
}
public void setDeadline(Date deadline) {
	this.deadline = deadline;
}
public String getSituacao() {
	return situacao;
}
public void setSituacao(String situacao) {
	this.situacao = situacao;
}
@Override
public int hashCode() {
	return Objects.hash(id);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Tarefa other = (Tarefa) obj;
	return id == other.id;
}




}
