package projetoJava;

public abstract class Personagem implements Acoes {

    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;
    protected boolean defendendo = false;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defesa: " + defesa);

        if (vida == 0) {
            System.out.println("STATUS: DERROTADO");
        } else {
            System.out.println("STATUS: VIVO");
        }
    }

    
    public void receberDano(int dano) {
        int danoFinal = dano - (defesa / 2);

        if (danoFinal <= 0) {
            danoFinal = 1;
        }

        if (defendendo) {
            danoFinal /= 2;
            defendendo = false;
            System.out.println(nome + " reduziu o dano ao se defender!");
        }

        vida -= danoFinal;

        if (vida < 0) {
            vida = 0;
        }

        System.out.println(nome + " sofreu " + danoFinal + " de dano! Vida atual: " + vida);
    }

    public boolean estaVivo() {
        return vida > 0;
    }
    
    
}