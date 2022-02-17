import java.util.Arrays;
import java.util.Scanner;

/**
 * Сформувати одновимірний масив b з вихідного одновимірного масиву a
 * шляхом циклічного зсуву елементів a на k позицій вправо.
 * Значення k задається як перший аргумент при виклику програми,
 * інші аргументи - елементи масиву.
 **/
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arrStr = input.split(" ");
        int arrSize = arrStr.length - 1;
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = Integer.parseInt(arrStr[i + 1]);
        }
        System.out.println("Initial array: " + Arrays.toString(arr));
        System.out.println("Shifted array: " + Arrays.toString(shiftArray(arr, Integer.parseInt(arrStr[0]))));

    }

    public static int[] shiftArray(int[] inputArr, int shift) {
        if (shift != 0) {
            if (shift > inputArr.length) {
                shift = Math.abs(shift % inputArr.length);
            }
            for (int i = 0; i < shift; i++) {
                int buffer = inputArr[0];
                inputArr[0] = inputArr[inputArr.length - 1];
                for (int j = 1; j < inputArr.length - 1; j++) {
                    inputArr[inputArr.length - j] = inputArr[inputArr.length - j - 1];
                }
                inputArr[1] = buffer;
            }
        } else return inputArr;
        return inputArr;
    }
}
