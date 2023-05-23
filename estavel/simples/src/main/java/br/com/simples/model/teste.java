package br.com.simples.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class teste implements Serializable {

private static final long serialVersionUID = 1L;

private Integer id;
private String titulo;
private String descricao;
private String responsavel;
private String prioridade;
private String situacao;
private Date deadline;

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
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
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
public String getSituacao() {
	return situacao;
}
public void setSituacao(String situacao) {
	this.situacao = situacao;
}

public Date getDeadline() {
	return deadline;
}
public void setDeadline(Date deadline) {
	this.deadline = deadline;
}


}
