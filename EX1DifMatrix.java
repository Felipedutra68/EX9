package EX9;

/**
 *
 * @author ADM
 */
public class EX1DifMatrix {

    public static void main(String[] args) {

        int[][] num = new int[3][3];

        for (int i = 0; i < num.length; i++) {
            int sum = 0;
            for (int j = 0; j < num[i].length; j++) {
                sum += num[j][i];
            }
            System.out.println(sum);
        }

    }

}
