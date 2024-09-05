import java.util.Arrays;
import java.util.Random;

public class Application2 {

    public static void main(String[] args) {
        int[] array1 = new int[25];
        int[] array2 = new int[25];
        Random random = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(100);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(100);
        }

        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println("Массив 1: " + Arrays.toString(array1));
        System.out.println("Массив 2: " + Arrays.toString(array2));

        commons(array1, array2);
    }

    public static void commons(int[] array1, int[] array2) {
        for (int num : array2) {
            if (binarySearch1(array1, num) != -1) {
                System.out.println("Общий элемент: " + num);
            }
        }
    }

    public static int binarySearch1(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}