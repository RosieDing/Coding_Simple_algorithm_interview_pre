import java.util.ArrayList;
import java.util.Scanner;

public class CountACSIInCoin {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("ha");
        String[] input = s.nextLine().split("");
        ArrayList<String> a = new ArrayList<>();
        for(String m: input){
            if(m.charAt(0)<127 && m.charAt(0) > 0){
                if(!a.contains(m)){
                    a.add(m);
                }

            }
        }
        System.out.println(a.size());
    }
}
