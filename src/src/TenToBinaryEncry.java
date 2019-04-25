import java.util.Scanner;

public class TenToBinaryEncry {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        //String[] inputs = input.split("");
        StringBuilder result = new StringBuilder();
        for (int f = 0; f < input.length(); f++) {
            Integer a = Character.getNumericValue(input.charAt(f));
            String binary = Integer.toBinaryString(a);
            String[] m = binary.split("");
            StringBuilder c = new StringBuilder();
            for (int i = m.length - 1; i >= 0; i--) {
               c.append(m[i]);
            }
            result.append( c);
        }
        System.out.println(result);

    }
}
