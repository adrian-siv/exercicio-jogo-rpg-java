package br.com.fiap.JogoRPG;

public class Jogo {

	public static void main(String[] args) {
		Guerreiro jogador1 = new Guerreiro("Joao");
		Mago jogador2 = new Mago();
		var dragao = new Dragao();
		var bolaDeFogo = new BolaDeFogo();
		
		var fase = new Fase();
		
		fase.carregar(jogador1);
		fase.carregar(jogador2);
		fase.carregar(dragao);
		fase.carregar(bolaDeFogo);
		
		mostrarJogador(jogador1);
		jogador1.receberDano(10);
		mostrarJogador(jogador1);
		jogador1.receberCura(5);
		mostrarJogador(jogador1);
		jogador1.ganharExperiencia(20);
		mostrarJogador(jogador1);
		jogador1.receberAntidoto();
		mostrarJogador(jogador1);
		jogador2.atacar(jogador1);
		mostrarJogador(jogador1);

		System.out.println("Jogador 2 " + jogador2.getNome() + " XP=" + jogador2.getXp() + " HP=" + jogador2.getHp()
				+ " Env=" + jogador2.isEnvenenado());
	}

	private static void mostrarJogador(Jogador jogador1) {
		System.out.println("Jogador 1 " + jogador1.getNome() + " XP=" + jogador1.getXp() + " HP=" + jogador1.getHp()
				+ " Env=" + jogador1.isEnvenenado());
	}

}
