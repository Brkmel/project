import java.util.Arrays;
public class Tutorial3 {
    public static int [] rotateArray(int[] array, int positions) {
        int n = array.length;
        positions = positions % n;
        int [] result = new int [n];

        for (int i = 0; i < positions; i++) {
        result[(i + positions) % n] = array[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotateArray(arr,2)));
    }
}


