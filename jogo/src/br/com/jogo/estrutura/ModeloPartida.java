package br.com.jogo.estrutura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.com.jogo.Jogador;

public class ModeloPartida implements Modelavel {

	private List<ItemModelavel> itens;

	public ModeloPartida() {
		itens = new ArrayList<ItemModelavel>();
	}

	public void criarItem(Jogador jogadorUm, Jogador jogadorDois, String arma) {
		adicionarItem(new EventoPartida(jogadorUm, jogadorDois, arma));

	}

	public void adicionarItem(ItemModelavel item) {
		itens.add(item);
	}

	@Override
	public Collection<ItemModelavel> getItens() {
		return itens;
	}

}
