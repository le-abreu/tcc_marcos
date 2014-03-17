package br.com.jogo;

import br.com.jogo.util.Mensagem;

public enum Award {

	PADAWAN(Mensagem.getMensagem(Mensagem.JOGO_PARTIDA_CONQUISTA_PADAWAN)),

	NORRIS(Mensagem.getMensagem(Mensagem.JOGO_PARTIDA_CONQUISTA_NORRIS));

	private String descricao;

	private Award(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
