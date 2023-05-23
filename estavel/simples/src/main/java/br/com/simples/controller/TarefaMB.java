package br.com.simples.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.simples.model.Responsaveis;
import br.com.simples.model.Tarefa;
import br.com.simples.model.TipoPrioridade;
import br.com.simples.model.TipoSituacao;
//import br.com.simples.utility.Message;

@Named("tarefaMB")
@SessionScoped
public class TarefaMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Tarefa tarefa;

	private List<Tarefa> tarefas = new ArrayList<>();
//	Message message = new Message();

	public String adicionar() {
//			tarefa.setId(5);
			tarefas.add(tarefa);
//			System.out.println(tarefa.getId());
			limpar();
//			message.info("Salvo com sucesso.");
			return null;
	}
	
	private void limpar() {
		tarefa = new Tarefa();
	}

	public void excluir() {
			tarefas.remove(tarefa);
//			message.info("Tarefa '" + tarefa.getTitulo() + "' foi removida com sucesso.");
	}
	
	public void concluido() {
		tarefa.setSituacao("Concluído");
	}

	public TipoPrioridade[] getPrioridades() {
		return TipoPrioridade.values();
	}

	public TipoSituacao[] getSituacoes() {
		return TipoSituacao.values();
	}

	public Responsaveis[] getResponsaveis() {
		return Responsaveis.values();
	}
	
	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}
}
