package EX9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX5HashSet {
    
public static void main(String[] args) {
    
  Scanner teclado = new Scanner(System.in);

        ArrayList<String> listaDeNomes = new ArrayList<>();

        System.out.println("Digite uma palavra");
        String n1 = teclado.nextLine();

        System.out.println("Digite uma plavra");
       String n2 = teclado.nextLine();

     listaDeNomes.add(n1);
        listaDeNomes.add(n2);
    
    HashSet<String> set = new HashSet<>(listaDeNomes);
   
     for (String nome :  set) {

            System.out.println(nome);

     }
 }
}
