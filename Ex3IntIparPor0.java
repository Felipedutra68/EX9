package EX9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Ex3IntIparPor0 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();

        int n1;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Digite um numero");
            n1 = teclado.nextInt();

            int[] n3 = new int[n1];

            if (n3.length % 2 == 0) {

                set.add(n3.length);

            } else {

                set.add(0);

            }
        }

        for (Integer nome2 : set) {

            System.out.println(nome2);

        }

    }

}
