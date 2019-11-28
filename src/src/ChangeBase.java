import java.util.Scanner;

public class ChangeBase {
    static boolean checkSymmetric(String input){
        String[] array = input.split("");
        int length = array.length;
        for(int i = 0; i < length; i++){
            if(!array[i].equals(array[length-1-i])){
                return false;
            }
        }
        return true;

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int success = 0;
        for(int i = 2; i <= 16; i++){
            String c = Integer.toString(num, i);
            if(checkSymmetric(c)){
                System.out.println(i);
                success+=1;
            }
        }

        if(success == 0){
            System.out.println("-1");
        }


    }
}
