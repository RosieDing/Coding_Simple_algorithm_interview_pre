import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**Aimed to find the largest three digits in the list*/

public class FindGreatestThreeDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] input = s.nextLine().split("");
        ArrayList<Integer> c = new ArrayList<>();
        for(int i = 0; i < input.length-2; i++){
            int hun = Integer.valueOf(input[i]);
            int ten = Integer.valueOf(input[i+1]);
            int one = Integer.valueOf(input[i+2]);
            int element = hun*100+ ten*10+ one;
            c.add(element);
        }
        Collections.sort(c);
        System.out.println(c.get(c.size()-1));

    }
}
