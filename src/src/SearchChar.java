import java.util.Scanner;

public class SearchChar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("entering digits");
        String[] input = s.nextLine().split(" ");
        String a = input[0];
        String b = input[1];
        int c = 0;
        for(int i = 0; i < a.length(); i++){
            if(Character.toString(a.charAt(i)).equals(b)){
                c++;
            }
        }
        System.out.println(c);
    }
}
