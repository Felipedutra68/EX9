package EX9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX1DesPares {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Integer> listaDeNomes = new ArrayList<>();

        ArrayList<Integer> listaDeNomes2 = new ArrayList<>();

        for (int i = 1; i <= 7; i++) {

            System.out.println("Digite um numero");
            int n1 = teclado.nextInt();
            listaDeNomes.add(n1);
        }

        for (Integer nome1 : listaDeNomes) {

            if (nome1 % 2 == 0) {

                listaDeNomes2.add(nome1);

            }

        }
        for (Integer nome2 : listaDeNomes2) {

            System.out.println(nome2);

        }
    }
}
