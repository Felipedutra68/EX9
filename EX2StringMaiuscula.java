package EX9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX2StringMaiuscula {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> listaDeNomes = new ArrayList<>();

        String n1 = null, n2 = "o";

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite uma palavra");
            n1 = teclado.nextLine();

            n2 = n1.toUpperCase();
            listaDeNomes.add(n2);
        }

        n2 = n1.toUpperCase();

        for (String nome : listaDeNomes) {

            System.out.println(nome);
        }

    }
}
