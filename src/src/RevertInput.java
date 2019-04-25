import java.util.Scanner;

public class RevertInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] m = s.nextLine().split("");
        String h = "";
        for(int length = m.length-1; length >= 0 ; length--){
            h += m[length];
        }
        System.out.println(h);
    }
}
