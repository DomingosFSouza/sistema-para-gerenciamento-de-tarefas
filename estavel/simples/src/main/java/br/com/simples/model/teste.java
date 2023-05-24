package br.com.simples.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

//esta classe está sendo utilizada no projeto, porem foi produzida para promover testes no sistema, enquanto a classe "tarefa" seria a oficial.

//criando meu modelo principal. Aqui será construido o objeto e atributos que o compõe
//o objeto responsável pela criação das tarefas; permitindo nossa manipulação
public class teste implements Serializable {

private static final long serialVersionUID = 1L;

//a varivael id corresponderá ao "Número" atrelado a tarefa, presente no protótipo e na descrição da atividade
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
