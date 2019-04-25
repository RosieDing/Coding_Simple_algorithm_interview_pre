import java.util.Scanner;

public class Chicken {
    public static void main(String[] args) {
        int child; //one for 1/3 dollars
        Scanner s = new Scanner(System.in);
        int c = 100;
       int l = s.nextInt() * 100;

       for(int i = 0 ; i <= 100; i++ ){
           for(int k = 0; k< 100; k++){
               child = (c - i*5 -k*3)*3;
               if(child + i+ k == 100){
                   System.out.println(i+" "+ k+ " "+child);
               }
           }
       }



    }
}
