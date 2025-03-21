package EX9;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX3Maior {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        

       

        System.out.println("Digite um numero");
          int   n1 = teclado.nextInt();
          
         int m1 = n1;
        int m2 = n1;
        
        for (int i = 1; i <= 5; i++) {

            System.out.println("Digite um numero");
            n1 = teclado.nextInt();

            int[] n = new int[n1];

            if (n1 > m1) {

                m1 = n1;
            }

            if (n1 < m2) {

                m2 = n1;

            }
        }

        System.out.println("O maior valor eh:" + m1);

        System.out.println("O menor valoe eh:" + m2);

    }
}
