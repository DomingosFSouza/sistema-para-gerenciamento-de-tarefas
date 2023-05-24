package br.com.simples.controller;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;


//import java.text.DateFormat;
//import java.text.SimpleDateFormat;

//esta classe se refere a classe tarefaMB, mas, por precisar promover testes, criei esta para conseguir fazer alguns ajustets para melhorias futuras
@Named("testeMB")
@SessionScoped
public class TesteMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private br.com.simples.model.teste teste;
	
	@Inject
	private br.com.simples.model.testeListagem listagem;
	
//	lista que corresponde a todas as tarefas salvas
	private List<br.com.simples.model.teste> testes = new ArrayList<>();
//	lista que corresponderia as tarefas tragas dentro de uma busca na tela de listagem
	private List<br.com.simples.model.teste> filtro = new ArrayList<>();
	
//	tentativa de construção de um método que pudesse tanto criar quanto editar um objeto Tarefa
	
	public String adicionar() {
//		if(teste.getId()==null) {
			teste.setId(testes.size()+1);
			teste.setSituacao("Em andamento");
//		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
//		teste.setDeadline(df.format(teste.getDeadline()));
			testes.add(teste);
//		} 
//			else {
//			teste.setDeadline(teste.getDeadline());
//			teste.setDescricao(teste.getDescricao());
//			teste.setPrioridade(teste.getPrioridade());
//			teste.setResponsavel(teste.getResponsavel());
//			teste.setTitulo(teste.getTitulo());
//			
//			testes.add(teste);
//		}
		limpar();
		return null;
	}
	
	private void limpar() {
		teste=new br.com.simples.model.teste();
	}
	
	public String excluir() {
		testes.remove(teste);
		limpar();
		return null;
	}
	
	
//	método construido para conseguir fazer os filtros da tela de listagem
//	seria preferível buscar fazer a conexão com um banco de dados (postegres) e fazer tais buscas através de suas querys
	public String filtrando() {
		List<br.com.simples.model.teste> filtro = new ArrayList<>();
		br.com.simples.model.teste testeAqui;
		
		for(int i=0; i<testes.size(); i++) {
			testeAqui=testes.get(i);
			
			if(testeAqui.getId() == listagem.getId()) {
				filtro.add(testeAqui);
			}
			else if (testeAqui.getTitulo() == listagem.getTitulo()) {
				filtro.add(testeAqui);
			}
			else if (testeAqui.getResponsavel() == listagem.getResponsavel()) {
				filtro.add(testeAqui);
			}
			else if (testeAqui.getSituacao() == listagem.getSituacao()){
				filtro.add(testeAqui);
			}
		}
		if (listagem.getId()==null && listagem.getTitulo()==null && listagem.getResponsavel()==null && listagem.getSituacao()==null) {
			filtro = testes;
		}
		return null;
	}
//	editando a dituação de uma tarefa para "Concluída"
	public String concluida() {
		teste.setSituacao("Concluída");
		limpar();
		return null;
	}

	public br.com.simples.model.teste getTeste() {
		return teste;
	}

	public void setTeste(br.com.simples.model.teste teste) {
		this.teste = teste;
	}
	
	

	public br.com.simples.model.testeListagem getListagem() {
		return listagem;
	}

	public void setListagem(br.com.simples.model.testeListagem listagem) {
		this.listagem = listagem;
	}

	public List<br.com.simples.model.teste> getTestes() {
		return testes;
	}
	
	public List<br.com.simples.model.teste> getFiltro() {
		return filtro;
	}
}
