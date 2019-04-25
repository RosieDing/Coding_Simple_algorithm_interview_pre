import java.util.Scanner;

public class Vaculary {
    public int repeated(int n){
        if(n <= 1){
            return 1;
        }else {
            return n*repeated(n-1);
        }
    }

        public static void main(String[] args) {
            Scanner key = new Scanner(System.in);
            System.out.println("entering num");
            int input = key.nextInt();
            //System.out.println(input);
            if(input == 0){
                System.out.println(0);
            }else{
                Vaculary v = new Vaculary();
                //int c = Vaculary.r
                //System.out.println(repeated(input));
            }
        }
    }

