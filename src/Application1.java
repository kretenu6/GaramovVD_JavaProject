import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application1
{
    public static void binarySearch(int numToFind, int[] numberArray)
    {
        int low = 0;

        int high = numberArray.length;

        int middle;

        int iteration = 0;

        while(low <= high)
        {

            iteration++;

            System.out.println("номер итерации "+iteration);

            middle = (low + high) / 2;

            int num = numberArray[middle];

            if(num == numToFind){
                System.out.println("Значение найдено под индексом "+middle);
                return;
            } else if(num > numToFind){
                high = middle - 1;
            } else {
                low = middle + 1;
            }


        }
        System.out.println("Искомого значения в массиве нет");

    }
    public static void main(String[] args)
    {
        int numberArray[];

        int arrayLength;

        int numToFind;

        Scanner scan = new Scanner(System.in);

        System.out.println("length array: ");

        arrayLength = scan.nextInt();

        numberArray = new int[arrayLength];

        Random random = new Random();

        for (int i = 0; i < numberArray.length; i++)
        {
            numberArray[i] = random.nextInt(-100, 100);
        }

        Arrays.sort(numberArray);

        System.out.println(Arrays.toString(numberArray));

        System.out.println("Введите число для поиска:");

        numToFind = scan.nextInt();

        binarySearch(numToFind, numberArray);
    }
}