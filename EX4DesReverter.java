package EX9;


import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX4DesReverter {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite uma palavra");
        String n1 = teclado.nextLine();
        
        
     String reversed = "";
for (int i = n1.length() - 1; i >= 0; i--) {
reversed += n1.charAt(i);
}
   
System.out.println(reversed);

    }
}
