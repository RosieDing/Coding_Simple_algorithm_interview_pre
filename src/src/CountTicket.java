import java.util.*;

public class CountTicket {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numOfpeo = s.nextInt()+1;
        int cateOfticket = s.nextInt();
        int ticketPrice = s.nextInt();
        int greatestCombo = ticketPrice * numOfpeo;
        ArrayList<Integer> listOfSum = new ArrayList<>();
        listOfSum.add(greatestCombo);
        HashMap<Integer,Integer> collectionT = new HashMap<>();
        collectionT.put(1,ticketPrice);
        for(int i = 1; i <= cateOfticket; i++){
            int x = s.nextInt();
            int y = s.nextInt();
            collectionT.put(y,x);
            int con = 0;
            if(numOfpeo % y == 0){
                con = x*numOfpeo/y;
            }else{
                int remander = numOfpeo%y;

                int left = (numOfpeo-remander)/y;
                con = (remander)* ticketPrice +left*x;
            }
            listOfSum.add(con);
        }

        Set<Integer> c =collectionT.keySet();//return the set of all the keys
        for(int m: c){
            if(numOfpeo%m !=0){
                int remain = numOfpeo % m;
                if(c.contains(remain)){
                    int value = collectionT.get(remain) + (numOfpeo/m) *collectionT.get(m);
                    listOfSum.add(value);
                }

            }
        }

        Collections.sort(listOfSum);
        System.out.println(listOfSum.get(0));
    }

}
