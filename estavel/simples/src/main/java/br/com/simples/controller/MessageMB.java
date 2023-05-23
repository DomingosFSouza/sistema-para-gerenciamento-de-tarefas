package br.com.simples.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named("msg")
@ViewScoped
public class MessageMB implements Serializable{
	private static final long serialVersionUID =1L;
	
	public void salvar() {
		FacesMessage message = new FacesMessage("Sucesso.");
		FacesContext.getCurrentInstance().addMessage(null, message);	
	}
	
	public void erro() {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "ERRO", null);
		FacesContext.getCurrentInstance().addMessage(null, message);	
	}
	
	
}
