package projetoJava;

public class Main {

    public static void main(String[] args) {

        Personagem guerreiro = new Guerreiro("Fenix", 200, 750, 30, 100);
        Personagem arqueiro = new Arqueiro("Negro", 160, 90, 25, 120);
        Personagem mago = new Mago("Kersx", 150, 100, 20, 180);

        System.out.println("\n===== GUERREIRO =====");
        guerreiro.atacar();
        guerreiro.atacarOutro(mago);
        
        guerreiro.usarHabilidadesEspeciais();
        guerreiro.exibirStatus();

        System.out.println("\nRecebendo dano...");
        guerreiro.receberDano(100);

        System.out.println("\nStatus final:");
        guerreiro.exibirStatus();

        System.out.println("\n===== ARQUEIRO =====");
        arqueiro.atacar();
        arqueiro.defender();
        arqueiro.usarHabilidadesEspeciais();

        System.out.println("\nRecebendo dano...");
        arqueiro.receberDano(75);

        System.out.println("\nStatus final:");
        arqueiro.exibirStatus();

        System.out.println("\n===== MAGO =====");
        mago.atacar();
        mago.defender();
        mago.usarHabilidadesEspeciais();

        System.out.println("\nRecebendo dano...");
        mago.receberDano(90);

        System.out.println("\nStatus final:");
        mago.exibirStatus();
    }
}
