import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CombineTablenSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();


        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < num; i++){
            int num1 = s.nextInt();
            int num2 = s.nextInt();

            if(!map.containsKey(num1)){
                map.put(num1,num2);
            }else{
                map.put(num1, map.get(num1)+ num2);
            }

        }
        Map<Integer,Integer> treeMap = new TreeMap<>(map);

        for(Map.Entry<Integer, Integer> c: treeMap.entrySet()){
            System.out.println(c.getKey() + " " + c.getValue());
        }
    }
}
