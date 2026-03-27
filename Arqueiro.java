package projetoJava;


public class Arqueiro extends Personagem{
	private int precisao;

	public Arqueiro(String nome, int vida, int ataque, int defesa, int precisao) {
		super(nome, vida, ataque, defesa, precisao);
		this.precisao = precisao;
	}

	@Override
	public void atacar() {
		System.out.println("O Arqueiro " + nome + " fez seu ataque a distancia! ");
		
	}

	@Override
	public void defender() {
		System.out.println("O Arqueiro " + nome + " se defendeu! ");
	}

	@Override
	public void usarHabilidadesEspeciais() {
		System.out.println("O Arqueiro " + nome + " deu seu tiro critico com uma precisão nivel " + precisao);
	}
	
	
	
	
}