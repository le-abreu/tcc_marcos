package br.com.jogo.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.jogo.Jogador;
import br.com.jogo.estrutura.Modelavel;
import br.com.jogo.estrutura.ModeloPartida;
import br.com.jogo.partida.Partida;

public class TestePartida {

	private Partida partida;

	private Jogador vettel;
	private Jogador alonso;
	private Jogador jogadorInvalido;

	@Before
	public void antesTeste() {

		vettel = new Jogador("Vettel");
		alonso = new Jogador("Alonso");
		jogadorInvalido = new Jogador("<WORLD>");

		partida = new Partida(criaModelo());
	}

	private Modelavel criaModelo() {

		ModeloPartida modelo = new ModeloPartida();

		modelo.criarItem(alonso, vettel, TesteJogador.M16);
		modelo.criarItem(vettel, alonso, TesteJogador.M16);
		modelo.criarItem(jogadorInvalido, alonso, TesteJogador.AK47);
		modelo.criarItem(vettel, alonso, TesteJogador.PK7);
		modelo.criarItem(vettel, alonso, TesteJogador.PK7);
		modelo.criarItem(vettel, alonso, TesteJogador.PK7);
		modelo.criarItem(vettel, alonso, TesteJogador.PK7);

		return modelo;

	}

	@Test
	public void testarPremiacao() {
		assertEquals(1, partida.getVencedor().getAwards().size());
	}

	@Test
	public void testarStreakerPartida() {
		assertEquals(vettel, partida.getStreaker());
	}

	@Test
	public void testarBuscaJogador() {
		assertEquals(alonso, partida.buscarJogador(alonso.getNome()));
	}

	@Test
	public void testarRankingAssassinos() {

		List<Jogador> jogadores = partida.listarRankingAssassinatos();
		assertEquals(vettel, partida.getVencedor());
		assertEquals(jogadorInvalido, jogadores.get(jogadores.size() - 1));

	}
}
