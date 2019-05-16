import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RedraimentSorting {

    private static ArrayList<Integer> sorting(ArrayList<Integer> t){
        Collections.sort(t);
        return t;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        ArrayList<Integer> m = new ArrayList<>();
        for(int i = 0; i < num; i ++){
            m.add(s.nextInt());
        }

        ArrayList<Integer> t = new ArrayList<>();
        for(int k : m){
            t.add(k);
        }

        sorting(t);
        System.out.println(m);
        System.out.println(t);

//        int sum = 0;
//        int init = t.get(0);
        ArrayList<Integer> length = new ArrayList<>();
        for(int k: t){
            int value = k;
            int occurance = 1;
            for(int index = m.indexOf(k); index < m.size(); index++){
                if(m.get(index) > value){
                    value = m.get(index);
                    occurance += 1;
                }
            }
            length.add(occurance);
            //System.out.println(length);
        }
        int c = Collections.max(length);
        System.out.println(c);

        //Collections.sort(m);
//        ArrayList<Integer> h = new ArrayList<>();
//        for(int c = m.size()-1; c >= 0; c--){
//            if(!h.contains(m.get(c))){
//                h.add(m.get(c));
//            }
//        }
//        int sum = 0;
//        int ind = m.get(0);
//        for(int e = m.size()-1; e>0 ; e--){
//            if(m.get(e) < ind){
//                sum += 1;
//                ind = m.get(e);
//            }
//        }
//        System.out.println(sum);






    }
}
