package projetoJava;
import java.util.Scanner;

public class MenuSistema {

		public void menu() {
	        Scanner sc = new Scanner(System.in);

	        Personagem guerreiro = new Guerreiro("Fenix", 220, 70, 40, 50);
	        Personagem arqueiro = new Arqueiro("Negro", 170, 85, 30, 60);
	        Personagem mago = new Mago("Kersx", 140, 100, 20, 80);

	        System.out.println("=== ESCOLHA SEU PERSONAGEM ===");
	        System.out.println("1 - Guerreiro");
	        System.out.println("2 - Arqueiro");
	        System.out.println("3 - Mago");

	        int escolha = sc.nextInt();

	        Personagem jogador;

	        switch (escolha) {
	            case 1: 
	            	jogador = guerreiro; 
	            	break;
	            case 2: 
	            	jogador = arqueiro; 
	            	break;
	            case 3: 
	            	jogador = mago; 
	            	break;
	            default:
	                System.out.println("Opção inválida!");
	                sc.close();
	                return;
	        }

	        System.out.println("\n=== ESCOLHA O ALVO ===");
	        System.out.println("1 - Guerreiro");
	        System.out.println("2 - Arqueiro");
	        System.out.println("3 - Mago");

	        int escolhaAlvo = sc.nextInt();

	        Personagem alvo;

	        switch (escolhaAlvo) {
	            case 1: 
	            	alvo = guerreiro; 
	            	break;
	            case 2: 
	            	alvo = arqueiro; 
	            	break;
	            case 3: 
	            	alvo = mago; 
	            	break;
	            default:
	                System.out.println("Opção inválida!");
	                sc.close();
	                return;
	        }

	        System.out.println("\n=== AÇÃO ===");
	        System.out.println("1 - Atacar");
	        System.out.println("2 - Defender");
	        System.out.println("3 - Habilidade Especial");

	        int acao = sc.nextInt();

	        switch (acao) {
	            case 1:
	                jogador.atacar(alvo);
	                break;
	            case 2:
	                jogador.defender();
	                break;
	            case 3:
	                jogador.usarHabilidadesEspeciais(alvo);
	                break;
	            default:
	                System.out.println("Ação inválida!");
	        }

	        System.out.println("\n=== STATUS FINAL ===");
	        guerreiro.exibirStatus();
	        System.out.println();
	        arqueiro.exibirStatus();
	        System.out.println();
	        mago.exibirStatus();

	        sc.close();
	        }
}

