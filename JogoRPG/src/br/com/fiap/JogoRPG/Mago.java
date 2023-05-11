package br.com.fiap.JogoRPG;

public class Mago extends Jogador implements Visual {

	private int mp;

	public Mago() {

	}

	public Mago(String nome, int mp) {
		super(nome);
		this.mp = mp;
	}

	@Override
	public void mover(int x, int y) {

	}

}
