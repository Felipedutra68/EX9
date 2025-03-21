package EX9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX5DesDublicar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();

        ArrayList<Integer> listaDeNomes = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {

            System.out.println("Digite um numero");
            int n1 = teclado.nextInt();

            int[] n3 = new int[n1];

            set.add(n3.length);

        }
        for (Integer nome2 : set) {

            listaDeNomes.add(nome2);
        }

        for (Integer nome2 : set) {

            listaDeNomes.add(nome2);
        }

        for (Integer nome : listaDeNomes) {

            System.out.println(nome);

        }

    }

}
