import java.util.Scanner;

public class SplitToEightDigits {

    private static void print(String s){
        String[] input1 = s.split("(?<=\\G.{8})");
            int lengthOfList = input1.length -1;
            if (input1[lengthOfList].length() < 8) {
                int lengths = 8 - input1[lengthOfList].length();
                for (int i = 0; i < lengths; i++) {
                    input1[lengthOfList] += "0";
                }
            }
                for(String k : input1){
                    System.out.println(k);
                }

    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("entering");
        String s = keyboard.nextLine();
        String s2 = keyboard.nextLine();
        print(s);
        print(s2);

    }
}
