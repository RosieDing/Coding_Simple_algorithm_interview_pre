import java.util.Scanner;

public class Test {
    static int count_double(int[] input){
        int sum = 0;

        for(int i: input){
            for(int c: input){
                if (i * 2 == c){
                    sum += 1;
                }
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num_goup = s.nextInt();
        //System.out.println(num_goup);

        if(num_goup != 0){
            for(int i = 0; i < num_goup; i++){
                int num_element = s.nextInt();
               // System.out.println("element"+ num_element);

                //finish input
                int[] list = new int[num_element];
                for(int j = 0; j < num_element; j++){
                    list[j] = s.nextInt();
                    //System.out.println(list[j]);
                }

                int a = count_double(list);
                System.out.println(a);

            }
        }
    }
}
