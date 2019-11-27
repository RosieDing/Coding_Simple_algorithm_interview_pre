import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**in the function printing out the number which is square-free*/

public class CheckSquareFreeNumber {

    static boolean isSquareFree(int n) {
        if (n % 2 == 0)
            n = n / 2;

        // If 2 again divides n, then n is
        // not a square free number.
        if (n % 2 == 0)
            return false;

        // n must be odd at this point. So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
            // Check if i is a prime factor
            if (n % i == 0) {
                n = n / i;

                // If i again divides, then
                // n is not square free
                if (n % i == 0)
                    return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
       // System.out.println("entering");
        Scanner s = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        while (s.hasNextInt()) {
            int c = s.nextInt();
            if(isSquareFree(c)){
                System.out.println(c);
            }
            array.add(c);
            //System.out.println(array);
        }//set up the input array

        System.out.println("input finish");
//        List<Integer> result = new ArrayList<>();
//
//        for(int i = 0 ;  i < array.size(); i++){
//            int k = array.get(i);
//            System.out.println(" step 1");
//            for(int j = 2 ; j < k ; j++){
//                if(j *j == k){
//                    result.add(k);
//                    System.out.println(k);
//                    break;
//                }
//            }
    }


//       for(Integer k : array){
//            System.out.println(k);
//            for (int i = 2; i < k; i++){
//               if((i * i) == k){
//                    System.out.println(k);
//                }
//            }
//        }

       // System.out.println("finish");

    }

