import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 输入为一个整数数组，数组内有六个整数。
 * 输入整数数组长度为6， 不需要考虑其他长度，元素值为0或者正整数，6个数字每个数字只能使用一次。
 * output should be the maximum time
 *
 * 输入
 * [0,2,3,0,5,6]
 * 输出
 * 23:56:00
 *
 * 输入
 * [9,9,9,9,9,9]
 * 输出
 * invalid
 *
 * */



public class Time_sortList {
/**steps: search from each digits:
 * output
 * hour:
 * 1st: 0,1,2
 * 2nd: if 0: 0-9
 * if 1: 0-9
 * if 2: 0-4
 * minutes:
 * max: 60
 *
 * second:
 * 60
 *
 * */

 static boolean checkVaild(int[] input){
    ArrayList<Integer> less_two = new ArrayList();
    ArrayList<Integer> less_four = new ArrayList();
    ArrayList<Integer> less_six = new ArrayList();
    ArrayList<Integer> less_nine = new ArrayList();

    for(int i : input){
        if(i <= 2){
            less_two.add(i);
        }else if (i <= 4){
            less_four.add(i);
        }else if (i <= 6){
        less_six.add(i);
        }
        else if (i <= 9){
            less_nine.add(i);
        }
    }

    if(less_two.size() < 1){
        return false;
    }
    if(less_six.size()+ less_two.size() + less_four.size() < 3){
        return false;
    }

    if((less_two.size()) == 1 && less_two.get(0) == 2){
        if (less_four.size() < 1){
            return false;
        }
    }

    return true;

}

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] input = new int[6];
    for(int i = 0; i < 6; i++){
        input[i] = s.nextInt();
    }
    boolean c = checkVaild(input);
    if(c){
        System.out.println("ok");
    }else{
        System.out.println("fail");
    }
}


}
