import java.util.Scanner;

/**in this class we counted the num of 1 in the base 2 representation for the input int*/
public class ReturnNumOfOne {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer a = s.nextInt();
        String binary = Integer.toBinaryString(a);//change to base 2 string
        String[] m = binary.split("");
        int numOfOne = 0;
        for(String p: m){
            if(Integer.valueOf(p).equals(1)){
                numOfOne +=1;
            }
        }
        System.out.println(numOfOne);
    }
}
