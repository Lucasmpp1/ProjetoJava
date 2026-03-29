package projetoJava;

public class Mago extends Personagem {

    private int mana;

    public Mago(String nome, int vida, int ataque, int defesa, int mana) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println("O Mago " + nome + " lançou magia causando " + ataque + " de dano!");
        alvo.receberDano(ataque);
    }

    @Override
    public void defender() {
        defendendo = true;
        System.out.println("O Mago " + nome + " está se defendendo!");
    }

    @Override
    public void usarHabilidadesEspeciais(Personagem alvo) {
        if (mana >= 20) {
            int danoEspecial = ataque + mana;
            System.out.println("O Mago " + nome + " usou magia poderosa causando " + danoEspecial + " de dano!");
            alvo.receberDano(danoEspecial);
            mana -= 20;
        } else {
            System.out.println(nome + " não tem mana suficiente!");
        }
    }
}