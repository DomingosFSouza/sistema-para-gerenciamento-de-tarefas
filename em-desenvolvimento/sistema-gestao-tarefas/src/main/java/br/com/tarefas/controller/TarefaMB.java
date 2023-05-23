package br.com.tarefas.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.tarefas.model.Responsaveis;
import br.com.tarefas.model.Tarefa;
import br.com.tarefas.model.TipoPrioridade;
import br.com.tarefas.model.TipoSituacao;
import br.com.tarefas.service.TarefasService;
import br.com.tarefas.utility.Message;
import br.com.tarefas.utility.NegocioException;

@Named
@ViewScoped
public class TarefaMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Tarefa tarefa;

	@Inject
	private TarefasService service;

	private List<Tarefa> tarefas;
	Message message = new Message();

	@PostConstruct
	public void carregar() {
		tarefas = service.todasAsTarefas();
	}

	public void adicionar() {
		try {
			service.salvar(tarefa);
			tarefa = new Tarefa();
			carregar();

			message.info("Salvo com sucesso.");
		} catch (NegocioException e) {
			message.erro(e.getMessage());
		}
	}

	public void excluir() {
		try {
			service.remover(tarefa);
			carregar();

			message.info("Tarefa '" + tarefa.getTitulo() + "' foi removida com sucesso.");
		} catch (NegocioException e) {
			message.erro(e.getMessage());
		}
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
