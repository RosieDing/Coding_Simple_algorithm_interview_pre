import java.util.Scanner;

public class RevertSentence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] m = s.nextLine().split(" ");
        String h = m[m.length-1];
        for(int length = m.length-2; length >= 0 ; length--){
            h += " "+ m[length];
        }
        System.out.println(h);
    }


}
