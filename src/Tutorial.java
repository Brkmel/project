import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Tutorial{
    public static int [] filterEvenIndexOddValue(int [] array) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i+=2) {
            if (array[i] % 2 != 0) {
                result.add(array[i]);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] filtered = filterEvenIndexOddValue(arr);
        for ( int num: filtered) {
            System.out.println(num);
        }
    }
}





