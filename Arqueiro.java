package projetoJava;

public class Arqueiro extends Personagem {

    private int precisao;

    public Arqueiro(String nome, int vida, int ataque, int defesa, int precisao) {
        super(nome, vida, ataque, defesa);
        this.precisao = precisao;
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = ataque + (precisao / 2);
        System.out.println("O Arqueiro " + nome + " atirou em " + alvo.nome + " causando " + dano + " de dano!");
        alvo.receberDano(dano);
    }

    @Override
    public void defender() {
        defendendo = true;
        System.out.println("O Arqueiro " + nome + " está se defendendo!");
    }

    @Override
    public void usarHabilidadesEspeciais(Personagem alvo) {
        int danoEspecial = ataque + precisao;
        System.out.println("O Arqueiro " + nome + " usou tiro preciso causando " + danoEspecial + " de dano!");
        alvo.receberDano(danoEspecial);
    }
    
    
}