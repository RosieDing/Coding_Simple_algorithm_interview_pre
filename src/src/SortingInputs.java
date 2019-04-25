import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingInputs {

    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input");
        int num = s.nextInt();
        if(num == 0){
            System.out.println(0);
        }else{
            int[] p = new int[num];
        while(s.hasNext()){
            int m = s.nextInt();
            if(!contains(p, m)){
                //p[]
            }
        }
        //Collections.sort(k);


       // for(int counter: k){
          //  System.out.println(counter);
    //    }
    }}
}
