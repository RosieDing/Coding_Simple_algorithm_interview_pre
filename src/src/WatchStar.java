import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * aimed to count all the stars in the give region
 * Not pass the whole requirement*/
public class WatchStar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numofStars = s.nextInt();
        HashMap<Integer, ArrayList<Integer>>listOfStars = new HashMap<>();
        for(int i = 1; i <= numofStars; i++){
            int nextX = s.nextInt();
            int nextY = s.nextInt();
            if(!listOfStars.containsKey(nextX)){
                ArrayList<Integer> k = new ArrayList<>();
                k.add(nextY);
                listOfStars.put(nextX,k);
            }else{
                listOfStars.get(nextX).add(nextY);
            }
        }


        int numQuestions = s.nextInt();

        for(int i = 1; i <= numQuestions; i++){
            int sx = s.nextInt();
            int sy = s.nextInt();
            int ex = s.nextInt();
            int ey = s.nextInt();
            int num = 0;
            int x1 = Integer.min(ex,sx);
            int x2 = Integer.max(ex,sx);
            int y1 = Integer.min(ey,sy);
            int y2 = Integer.max(ey,sy);

            for(int c = x1; c <= x2; c++){
                ArrayList<Integer> m =listOfStars.get(c);
                for(int p = y1; p <= y2; p++){
                    if(m.contains(p)){
                        num +=1;
                    }
                }
            }
            System.out.println(num);
        }
    }
}
