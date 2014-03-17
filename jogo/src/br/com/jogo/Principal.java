package br.com.jogo;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;

import br.com.jogo.partida.Partida;

public class Principal {

	private static final Logger logger = Logger.getLogger(Principal.class);

	public static void main(String[] args) throws CloneNotSupportedException,
			IOException {

		Partida partida = Partida.carregarArquivo("src/log/info.log");
		logar(partida.getVencedor());
		logar(partida);

	}

	private static void logar(Partida partida) {

		List<Jogador> classificacao = partida.listarRankingAssassinatos();
		int index = 1;
		logger.info("Ranking:");
		for (Jogador jogador : classificacao) {
			if (jogador.isValido())
				logger.info(index++ + "� " + jogador);
		}
	}

	private static void logar(Jogador jogador) {

		logger.info("Vencedor: " + jogador);
		logger.info("Arma: " + jogador.getNomeArmaFavorita());
		logger.info("Streak: " + jogador.getNumeroStreak());
		logger.info("Assassinatos: " + jogador.getQuantidadeAssassinato());
		logger.info("Mortes: " + jogador.getQuantidadeMorte());

		logarAwards(jogador.getAwards());

	}

	private static void logarAwards(List<Award> awards) {
		if (!awards.isEmpty())
			logger.info("Conquistas:");
		for (Award award : awards) {
			logger.info("\t" + award);
		}
	}
}
