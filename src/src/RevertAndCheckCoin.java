import java.util.ArrayList;
import java.util.Scanner;
/**reverse the list of string*/

public class RevertAndCheckCoin {


        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String[] m = s.nextLine().split("");
            ArrayList<String> a = new ArrayList();
            String h = "";
            for(int length = m.length-1; length >= 0 ; length--){
                if(!a.contains(m[length])){
                    a.add(m[length]);
                }
            }
            for(Object c:a){
                h += c;
            }
            System.out.println(h);
        }


}
