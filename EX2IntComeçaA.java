package EX9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX2IntComeçaA {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList< String> listaDeNomes = new ArrayList<>();

        ArrayList< String> listaDeNomes2 = new ArrayList<>();

        System.out.println("Digite uma palavra");
        String n1 = teclado.nextLine();
        listaDeNomes.add(n1);

        for (int i = 1; i <= 7; i++) {

            System.out.println("Digite uma palavra");
            n1 = teclado.nextLine();
            listaDeNomes.add(n1);
        }

        for (String nome1 : listaDeNomes) {

            if (nome1.startsWith("A")) {

                listaDeNomes2.add(nome1);
            }
        }

        int tamanho = listaDeNomes2.size();

        System.out.println("Foram digitadas " + tamanho + " palavras que comecas com A");

    }

}
