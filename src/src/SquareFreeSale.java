import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SquareFreeSale {
    static boolean checkPrime(int input){
        if(input == 1){
            return false;
        }
        if(input == 2){
            return true;
        }

        if(input %2 == 0){
            return false;
        }

        for(int i = 3; i <input; i++){
            if(input%i == 0){
                return false;
            }
        }

        return true;
    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNextInt()) {
            int num_days = s.nextInt();//count all the days
            int sum = 0;
            int num_bought = 0;

            ArrayList<Integer> input = new ArrayList<>();


            for (int i = 0; i < num_days; i++) {
                input.add(s.nextInt());

                int date = i + 1;
                if (checkPrime(date)) {
                    System.out.println("date " + date);

                    num_bought += 1;
                    Collections.sort(input);

                    System.out.println("bought element: " + input.get(num_bought - 1));
                    sum += input.get(num_bought - 1);
                }
            }


            System.out.println(sum);

        }

    }

}
