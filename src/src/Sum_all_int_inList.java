import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**输入描述：

 1、忽略小数点，例如“A1.2”，认为包含整数1和2；

 2、如果整数的左侧出现“-”，则奇数个数认为是负整数，偶数个数认为是正整数。例如AB-1CD--2EF---3“”,认为包含整数-1、2和-3。

 输出描述：

 输出即为字符串中所有整数数字之和。*/
public class Sum_all_int_inList {

    static boolean check_int(String s){
        try{
            Integer.parseInt(s);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] input = s.nextLine().split("");
        HashMap<Integer, Integer> map_of_input = new HashMap<>();
        for(int j = 0; j< input.length; j++){
            if(check_int(input[j])){
                map_of_input.put(j, Integer.parseInt(input[j]));
            }
        }
        int sum = 0;


        for(HashMap.Entry<Integer, Integer> entry :map_of_input.entrySet()){
            int index = entry.getKey();
            int value = entry.getValue();
            int num_of_minus = 0;

            for(int i = index; i >= 0; i-- ){
                if (!input[i-1].equals("-")){
                    break;
                }
                else{
                    num_of_minus +=1;
                }
            }
            System.out.println("numofneg "+ num_of_minus);

            if(num_of_minus%2 == 1) {
                value = -1 * value;

            }
            System.out.println(value);
            sum += value;

        }

        System.out.println(sum);



    }

}
