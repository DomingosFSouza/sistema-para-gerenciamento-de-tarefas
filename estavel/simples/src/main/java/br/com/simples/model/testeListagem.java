package br.com.simples.model;

import java.io.Serializable;
import java.util.Objects;

public class testeListagem implements Serializable {

private static final long serialVersionUID = 1L;

private Integer id;
private String titulo;
private String responsavel;
private String situacao;

public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
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
	testeListagem other = (testeListagem) obj;
	return Objects.equals(id, other.id);
}


}
