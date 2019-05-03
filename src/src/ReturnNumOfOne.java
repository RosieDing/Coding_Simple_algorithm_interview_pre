import java.util.Scanner;

public class ReturnNumOfOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer a = s.nextInt();
        String binary = Integer.toBinaryString(a);
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
