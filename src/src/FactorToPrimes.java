
import java.util.Scanner;

public class FactorToPrimes {

        public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                int number = sc.nextInt();
                String s = "";
                for (int i = 2; i < number; i++) {
                    while (number % i == 0) {
                        s = s + i+ " ";
                        number = number / i;
                    }
                }

                if(number > 2) {
                    s += number;
                }
                System.out.println(s);
            }
        }
    }
