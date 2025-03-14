import java.util.HashMap;
import java.util.Map;
public class Tutorial2 {
    public static int findDominant(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();
       int n = array.length;

       for (int num : array) {
           countMap.put(num, countMap.getOrDefault(num, 0) + 1);
           if (countMap.get(num) > n / 2) {
               return num;
           }
        }
       return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 2, 2};
        System.out.println(findDominant(arr));
    }
}
