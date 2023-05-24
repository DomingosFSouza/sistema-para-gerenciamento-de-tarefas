package br.com.simples.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

//com esta classe como controller e tendo a possibilidade de trazê-la como "Named"/beans, facilita poder chamar
// um modal de confirmação. Isso, com finalidade de trazer um modal que possa servir para trazer uma tarefa
// e editá-la num modal.
@Named("msg")
@ViewScoped
public class MessageMB implements Serializable{
	private static final long serialVersionUID =1L;
	
//	através desses métodos, poderá trabalhar mais facilmente com mensagens para o cliente, podendo implementar
//	negociosExceptions, como nossas regras de negocio e o service
	public void salvar() {
		FacesMessage message = new FacesMessage("Sucesso.");
		FacesContext.getCurrentInstance().addMessage(null, message);	
	}
	
	public void erro() {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "ERRO", null);
		FacesContext.getCurrentInstance().addMessage(null, message);	
	}
	
	
}
