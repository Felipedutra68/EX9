package EX9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Ex4IntPar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();

        int n1;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Digite um numero");
            n1 = teclado.nextInt();

            int[] n3 = new int[n1];

            if (n3.length %2==0) {
                set.add(n3.length);
            }

        }

        int tamanho = set.size();

        System.out.println("Possuem " + tamanho + " Numeros pares");


        }

    }


