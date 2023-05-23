package br.com.tarefas.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.com.tarefas.dao.DAO;
import br.com.tarefas.model.Tarefa;
import br.com.tarefas.utility.NegocioException;


public class TarefasService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private DAO<Tarefa> dao;
	
	public void salvar(Tarefa tarefa) throws NegocioException{
		dao.salvar(tarefa);
	}
	
	public void remover(Tarefa tarefa) throws NegocioException{
		dao.remover(Tarefa.class, tarefa.getId());
	}
	
	public List<Tarefa> todasAsTarefas(){
		return dao.buscarTodos("select tarefa from Tarefa tarefa order by tarefa.titulo");
	}
}
