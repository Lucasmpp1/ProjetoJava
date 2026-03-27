package projetoJava;

public class Guerreiro extends Personagem{
	private int forcaExtra;

	public Guerreiro(String nome, int vida, int ataque, int defesa, int forcaExtra) {
		super(nome, vida, ataque, defesa, forcaExtra);
		this.forcaExtra = forcaExtra;
	}

	@Override
	public void atacar() {
		System.out.println("O guerreiro " + nome +  " fez seu ataque físico!");
		System.out.println("\nO Guerreiro " + nome +  " está causando " + ataque + " de dano ");
	}

	@Override
	public void defender() {
		System.out.println("O guerreiro " + nome + " se defendeu! ");
		
	}

	@Override
	public void usarHabilidadesEspeciais() {
		System.out.println("O Guerreiro " + nome + " usou seu especial! Sua força agora é: " + forcaExtra * ataque );
		
	}
	
}