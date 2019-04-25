import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        while(c.hasNext()){
            int a = c.nextInt();
            int b = c.nextInt();
            System.out.println(a + b);
        }
    }
}
