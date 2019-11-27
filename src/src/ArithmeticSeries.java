import java.util.Scanner;
/** in this class we print the numbers in other types
 * */
public class ArithmeticSeries {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
        int num = s.nextInt();
        if(num > 0){
        int lastdigit = 2+(num-1)*3;
        System.out.println((2+lastdigit)*num/2);}
        else {
            System.out.println(-1);
        }
        }
    }
}
