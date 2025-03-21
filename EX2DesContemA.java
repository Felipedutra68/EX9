package EX9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX2DesContemA {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> listaDeNomes = new ArrayList<>();

        ArrayList<String> listaDeNomes2 = new ArrayList<>();

        for (int i = 1; i <= 7; i++) {

            System.out.println("Digite uma palavra");
            String n1 = teclado.nextLine();
            listaDeNomes.add(n1);
        }

        for (String nome1 : listaDeNomes) {

            if (nome1.contains("a")) {

                listaDeNomes2.add(nome1);

            }

        }
        for (String nome2 : listaDeNomes2) {

            System.out.println(nome2);

        }
    }

}
