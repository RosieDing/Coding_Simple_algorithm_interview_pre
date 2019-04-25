import java.util.Scanner;

public class SixteenToTen {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()){
            String m = s.nextLine();
            System.out.println(Integer.parseInt(m.substring(2),16));
        }
    }
}
