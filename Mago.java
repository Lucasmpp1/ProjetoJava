package projetoJava;


public class Mago extends Personagem{
	private int mana;

	public Mago(String nome, int vida, int ataque, int defesa, int mana) {
		super(nome, vida, ataque, defesa, mana);
		this.mana = mana;
	}

	@Override
	public void atacar() {
		System.out.println("O Mago " + nome +  " fez seu ataque mágico! ");		
	}

	@Override
	public void defender() {
		System.out.println("O Mago  " + nome + " se defendeu! ");
		
	}

	@Override
	public void usarHabilidadesEspeciais() {
		System.out.println("O Mago " + nome + " usou sua magia forte! " + mana * ataque + " Dano ");
	}

}