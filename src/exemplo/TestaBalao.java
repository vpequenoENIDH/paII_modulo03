package exemplo;
/**
 * Programa de teste da classe Balao.
 *
 * @author F. Mário Martins
 * @version 3/2008
 */

import java.util.Scanner;
import static java.lang.System.out;
public class TestaBalao {
    public static void menu() {
        out.println("-----  Operações ---------");
        out.println(" 1 ---------- Subir ");
        out.println(" 2 ---------- Descer ");
        out.println(" 3 ---------- Mudar Direção ");
        out.println(" 4 ---------- Cor nova ");
        out.println(" 5 ---------- Fim ");
        out.print("--------------------------- Opção (1-5): ");
    }

    public static void main(String args[]) {

        Balao[] baloes = new Balao[2];
        baloes[0] = new Balao("Azul", "Norte", 25);
        //
        out.println("Balão 1 : "+ baloes[0].toString() + "\n");
        //
        out.println("---- Novo Balão ----");
        out.print(" Introduza a cor: ");
        String cor = Input.lerString();
        out.print(" Introduza a direção: ");
        String dir = Input.lerString();
        out.print(" Introduza a altura: ");
        int altura = Input.lerInt();
        out.println();
        //
        baloes[1] = new Balao(cor, dir, altura);
        out.println("Balão 2 : " + baloes[1].toString() + "\n");

        // ----  Algumas mudanças de atributos ------

        int metros, opcao, num;
        String novaCor ="", novaDir = "";

        do {
            menu(); opcao = Input.lerInt();
        }
        while(opcao > 5 || opcao < 1);

        while(opcao != 5) {
            do {
                out.print("Qual o balao a modificar (1,2) : ");
                num = Input.lerInt();
            }
            while(num != 1 && num != 2);
            switch(opcao) {
                case 1: { out.print("Subir quantos metros ? "); metros = Input.lerInt();
                    baloes[num-1].subir(metros); break;
                }
                case 2: { out.print("Descer quantos metros ? "); metros = Input.lerInt();
                    baloes[num-1].descer(metros);  break;
                }

                case 3: { out.print("Qual a nova direcção ? "); novaDir = Input.lerString();
                    baloes[num-1].mudaDir(novaDir);  break;
                }
                case 4: { out.print("Qual a nova cor ? "); novaCor = Input.lerString();
                    baloes[num-1].mudaCor(novaCor); break;
                }
            }
            out.println("\n----------   ESTADOS DOS BALOES ------------");
            for(int i = 0; i <=1; i++) out.println("Balão " + (i+1) + " : " + baloes[i].toString() + "\n");
            out.println("--------------------------------------------\n");
            do {
                menu();
                opcao = Input.lerInt();
            }
            while(opcao > 5 || opcao < 1);
        }
        //
        out.println("\n\n-------  FIM DO PROGRAMA -------");
    }
}
