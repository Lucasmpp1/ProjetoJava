package projetoJava;

public class Guerreiro extends Personagem {

    private int forcaExtra;

    public Guerreiro(String nome, int vida, int ataque, int defesa, int forcaExtra) {
        super(nome, vida, ataque, defesa);
        this.forcaExtra = forcaExtra;
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = ataque + forcaExtra;
        System.out.println("O Guerreiro " + nome + " atacou " + alvo.nome + " causando " + dano + " de dano!");
        alvo.receberDano(dano);
    }

    @Override
    public void defender() {
        defendendo = true;
        System.out.println("O Guerreiro " + nome + " está se defendendo!");
    }

    @Override
    public void usarHabilidadesEspeciais(Personagem alvo) {
        int danoEspecial = ataque + (forcaExtra * 2);
        System.out.println("O Guerreiro " + nome + " usou golpe especial causando " + danoEspecial + " de dano!");
        alvo.receberDano(danoEspecial);
    }
}