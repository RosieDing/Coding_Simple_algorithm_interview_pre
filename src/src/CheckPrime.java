//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    static boolean checkPrime(int input){
//        if(input == 1){
//            return false;
//        }
//        if(input == 2){
//            return true;
//        }
//
//        for(int i = 2; i <input; i++){
//            if(input%i == 0){
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        while(s.hasNextInt()){
//            int num_days = s.nextInt();//count all the days
//            int sum= 0;
//            int num_bought = 0;
//
//            int[] input = new int[num_days];
//            for(int i= 0; i < num_days; i ++){
//                input[i] = s.nextInt();
//                //System.out.println(input[i]);
//            }
//
//            for(int day = 1; day <= num_days; day++){//start form day = 0
//                if(checkPrime(day)){
//                    num_bought += 1;
//                    //System.out.println("date today: "+ day);
//                    int[] datePrice = new int[day];
//                    for (int k = 0; k < day; k++){
//                        datePrice[k] = input[k];
//                    }
//                    Arrays.sort(datePrice);
//                    sum += datePrice[num_bought-1];
//
//                }
//            }
//            System.out.println(sum);
//        }
//    }
//
//}