package projetoJava;

public abstract class Personagem implements Acoes {

	protected String nome;
	protected int vida;
	protected int ataque;
	protected int defesa;
	protected int bolsa = 0;
	
	public Personagem(String nome, int vida, int ataque, int defesa, int bolsa) {
		this.nome = nome;
		this.vida = vida;
		this.ataque = ataque;
		this.defesa = defesa;
		this.bolsa = bolsa;
	}
	
	public void exibirStatus() {
		System.out.println("Nome do personagem:" + nome + "\nVida: " + vida + "\nAtaque: " + ataque + "\nDefesa: " + defesa+"\nBolsa:"+bolsa );
		if(vida <0) {
			System.out.println(">> STATUS: DERROTADO! <<<<");
		} else {
			System.out.println(">>> STATUS: AINDA VIVO <<<<");
		}
	
	}
	public void receberDano(int dano) {
	    int danoFinal = dano - defesa;

	    if (danoFinal < 0) {
	        danoFinal = 0;
	        bolsa+=ouro();
	    }

	    vida -= danoFinal;

	    if (vida < 0) {
	        vida = 0;
	        System.out.println("Esta morto");
	    }

	    System.out.println("Foi recebido " + danoFinal + " de dano! Vida atual: " + vida);
	}
	
	public boolean estaVivo() {
		return this.vida > 0;
	}
	
	public void atacarOutro(Personagem alvo) {
		System.out.println("\n----"+ this.nome+" Esta atacando: "+alvo.nome+"-----");
		alvo.receberDano(this.ataque);
	}
	
	public int ouro() {
		return 10;
	}
	
}