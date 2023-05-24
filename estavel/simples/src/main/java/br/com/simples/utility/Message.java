//package br.com.simples.utility;
//
//import javax.faces.application.FacesMessage;
//import javax.faces.context.FacesContext;
//
//public class Message {
//
//	public void info(String mess) {
//		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, mess, null);
//		FacesContext.getCurrentInstance().addMessage(null, message);
//	}
//	
//	public void erro(String mess) {
//		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, mess, null);
//		FacesContext.getCurrentInstance().addMessage(null, message);
//	}
//	
//	public void warn(String mess) {
//		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, mess, null);
//		FacesContext.getCurrentInstance().addMessage(null, message);
//	}
//}
